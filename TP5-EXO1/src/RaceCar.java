
public class RaceCar extends Vehicle {
	
	private String raceType;

	public RaceCar(String maker, int topSpeed, String fuelType, String plaqueNumber, boolean transmitionType,
			int nbOfWheels, String raceType, int horsePower, double engineCapacity) {
		super(maker, topSpeed, fuelType, plaqueNumber, transmitionType, nbOfWheels, horsePower, engineCapacity);
		this.raceType = raceType;
		this.engine = new Engine(horsePower, engineCapacity);
		
	}

	public String getRaceType() {
		return raceType;
	}

	public void setRaceType(String raceType) {
		this.raceType = raceType;
	}
	
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("This car is a : "+this.raceType+" car.");
	}
	
	
	
	
	

}
