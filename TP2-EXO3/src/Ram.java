public class Ram {
    private int capacity; // in GB
    private double frequency; // in MHz

    public Ram(int capacity, double frequency) {
        this.capacity = capacity;
        this.frequency = frequency;
    }

    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }

    public double getFrequency() { return frequency; }
    public void setFrequency(double frequency) { this.frequency = frequency; }
}
