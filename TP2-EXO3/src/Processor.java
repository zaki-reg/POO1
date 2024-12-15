public class Processor {
    private String model;
    private double frequency; // in GHz

    public Processor(String model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getFrequency() { return frequency; }
    public void setFrequency(double frequency) { this.frequency = frequency; }
}
