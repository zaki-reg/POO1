public class SimCard {
    private int simId;
    private String number;

    public SimCard(int simId, String number) {
        this.simId = simId;
        this.number = number;
    }

    public int getSimId() { return simId; }
    public void setSimId(int simId) { this.simId = simId; }

    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
}
