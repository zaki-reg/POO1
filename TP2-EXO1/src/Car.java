public class Car {
    // Attributes
    private String autoMaker;
    private String model;
    private String colour;
    private int maxSpeed;
    private boolean autoTransition;
    private double enginePower;
    private String energy;
    private int speed;
    private int kmAge;

    // Constructor
    public Car(String autoMaker, String model, String colour, int maxSpeed, boolean autoTransition,
               double enginePower, String energy, int speed, int kmAge) {
        this.autoMaker = autoMaker;
        this.model = model;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
        this.autoTransition = autoTransition;
        this.enginePower = enginePower;
        this.energy = energy;
        this.speed = speed;
        this.kmAge = kmAge;
    }

    // Getters and Setters
    public String getAutoMaker() { return autoMaker; }
    public void setAutoMaker(String autoMaker) { this.autoMaker = autoMaker; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }

    public int getMaxSpeed() { return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }

    public boolean isAutoTransition() { return autoTransition; }
    public void setAutoTransition(boolean autoTransition) { this.autoTransition = autoTransition; }

    public double getEnginePower() { return enginePower; }
    public void setEnginePower(double enginePower) { this.enginePower = enginePower; }

    public String getEnergy() { return energy; }
    public void setEnergy(String energy) { this.energy = energy; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getKmAge() { return kmAge; }
    public void setKmAge(int kmAge) { this.kmAge = kmAge; }

    // Methods
    public void accelerate(int acc) {
        speed += speed * acc / 100;
        if (speed > maxSpeed) speed = maxSpeed;
    }

    public void brake(int nbsec) {
        speed -= speed * nbsec * 10 / 100;
        if (speed < 0) speed = 0;
    }

    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Automaker: " + autoMaker);
        System.out.println("Model: " + model);
        System.out.println("Colour: " + colour);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Automatic Transmission: " + (autoTransition ? "Yes" : "No"));
        System.out.println("Engine Power: " + enginePower + " HP");
        System.out.println("Energy Type: " + energy);
        System.out.println("Current Speed: " + speed + " km/h");
        System.out.println("Kilometers Travelled: " + kmAge + " km");
    }

    public void travel(int dist) {
        kmAge += dist;
    }

    public Car compareSpeed(Car c) {
        return this.speed > c.speed ? this : c;
    }
}
