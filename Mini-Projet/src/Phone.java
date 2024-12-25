public class Phone {
    private double batteryLevel;
    private SimCard simCard;
    private double x;
    private double y;
    private boolean inCall;

    public Phone(double batteryLevel, double x, double y) {
        this.batteryLevel = batteryLevel;
        this.x = x;
        this.y = y;
        this.inCall = false;
    }

    public void insertSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public boolean canMakeCall() {
        return batteryLevel > 0 && simCard != null && 
               simCard.isActive() && simCard.hasSufficientCredit() && !inCall;
    }

    public boolean makeCall(Network network) {
        if (!canMakeCall()) return false;
        
        Antenna nearestAntenna = network.findNearestAntenna(x, y);
        if (nearestAntenna == null || !nearestAntenna.canAcceptNewCall()) return false;
        
        nearestAntenna.incrementActiveCalls();
        inCall = true;
        simCard.deductCredit(1.0);
        return true;
    }

    public void move(double newX, double newY, Network network) {
        this.x = newX;
        this.y = newY;
        if (inCall) {
            Antenna nearestAntenna = network.findNearestAntenna(x, y);
            if (nearestAntenna == null) {
                endCall();
            }
        }
    }

    public void endCall() {
        if (inCall) {
            inCall = false;
        }
    }

    public double getBatteryLevel() { return batteryLevel; }
    public void setBatteryLevel(double batteryLevel) { this.batteryLevel = batteryLevel; }
    public double getX() { return x; }
    public double getY() { return y; }
    public boolean isInCall() { return inCall; }
}