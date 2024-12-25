public class SimCard {
    private String phoneNumber;
    private boolean active;
    private double creditBalance;

    public SimCard(String phoneNumber, double initialCredit) {
        this.phoneNumber = phoneNumber;
        this.creditBalance = initialCredit;
        this.active = true;
    }

    public boolean isActive() {
        return active;
    }

    public boolean hasSufficientCredit() {
        return creditBalance > 0;
    }

    public void deductCredit(double amount) {
        if (creditBalance >= amount) {
            creditBalance -= amount;
        }
    }

    public String getPhoneNumber() { return phoneNumber; }
    public double getCreditBalance() { return creditBalance; }
    public void setActive(boolean active) { this.active = active; }
}