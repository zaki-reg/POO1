
public class Vehicle {
	
	private String maker;
	private int topSpeed;
	private String fuelType;
	private String plaqueNumber;
	private boolean transmitionType;
	private Engine engine;
	
	
	public Vehicle(String maker, int topSpeed, String fuelType, String plaqueNumber, boolean transmitionType, Engine engine) {
		this.maker = maker;
		this.topSpeed = topSpeed;
		this.fuelType = fuelType;
		this.plaqueNumber = plaqueNumber;
		this.transmitionType = transmitionType;
		this.engine = engine;
	}


	public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}


	public int getTopSpeed() {
		return topSpeed;
	}


	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}


	public String getFuelType() {
		return fuelType;
	}


	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}


	public String getPlaqueNumber() {
		return plaqueNumber;
	}


	public void setPlaqueNumber(String plaqueNumber) {
		this.plaqueNumber = plaqueNumber;
	}


	public boolean isTransmitionType() {
		return transmitionType;
	}


	public void setTransmitionType(boolean transmitionType) {
		this.transmitionType = transmitionType;
	}
	
	public void displayInfo() {
        System.out.println("Maker: " + maker + ", Top Speed: " + topSpeed + ", Fuel Type: " + fuelType + 
                           ", Plaque Number: " + plaqueNumber + ", Transmission Type: " + (transmitionType ? "Automatic" : "Manual"));
        engine.displayInfo();
    }
	
	


}
