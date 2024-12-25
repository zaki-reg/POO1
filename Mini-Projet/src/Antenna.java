public class Antenna {
    private double x;
    private double y;
    private double coverageRadius;
    private int maxCapacity;
    private int activeCallsCount;

    public Antenna(double x, double y, double coverageRadius, int maxCapacity) {
        this.x = x;
        this.y = y;
        this.coverageRadius = coverageRadius;
        this.maxCapacity = maxCapacity;
        this.activeCallsCount = 0;
    }

    public boolean isInRange(double phoneX, double phoneY) {
        double distance = Math.sqrt(Math.pow(x - phoneX, 2) + Math.pow(y - phoneY, 2));
        return distance <= coverageRadius;
    }

    public boolean canAcceptNewCall() {
        return activeCallsCount < maxCapacity;
    }

    public void incrementActiveCalls() {
        if (canAcceptNewCall()) {
            activeCallsCount++;
        }
    }

    public void decrementActiveCalls() {
        if (activeCallsCount > 0) {
            activeCallsCount--;
        }
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getCoverageRadius() { return coverageRadius; }
    public int getActiveCallsCount() { return activeCallsCount; }
}