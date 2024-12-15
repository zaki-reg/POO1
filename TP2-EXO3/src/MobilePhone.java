public class MobilePhone {
    private String brand;
    private String model;
    private float screenSize;
    private String os;
    private int camResolution; // Camera resolution in MP
    private SimCard simCard;
    private Ram ram;
    private Processor processor;

    public MobilePhone(String brand, String model, float screenSize, String os, int camResolution, SimCard simCard, Ram ram, Processor processor) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.os = os;
        this.camResolution = camResolution;
        this.simCard = simCard;
        this.ram = ram;
        this.processor = processor;
    }

    // Getters and Setters for each attribute...

    public double performance() {
        return processor.getFrequency() * ram.getCapacity();
    }

    public MobilePhone compare(MobilePhone other) {
        return this.camResolution > other.camResolution ? this : other;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Operating System: " + os);
        System.out.println("Camera Resolution: " + camResolution + " MP");
        System.out.println("Sim Card Number: " + simCard.getNumber());
        System.out.println("RAM Capacity: " + ram.getCapacity() + " GB");
        System.out.println("Processor Frequency: " + processor.getFrequency() + " GHz");
        System.out.println("Performance: " + performance());
    }
}
