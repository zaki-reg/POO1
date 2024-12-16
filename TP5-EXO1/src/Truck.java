
public class Truck extends Vehicle {
	
	private int truckCapacity;
	private boolean trailerSupport;
	
	
	public Truck(String maker, int topSpeed, String fuelType, String plaqueNumber, boolean transmissionType,int truckCapacity,
			boolean trailerSupport, int nbOfWheels, int horsePower, double engineCapacity) {
	    super(maker, topSpeed, fuelType, plaqueNumber, transmissionType, nbOfWheels, horsePower, engineCapacity);
		this.truckCapacity = truckCapacity;
		this.trailerSupport = trailerSupport;
		this.engine = new Engine(360, 3.5);
	}


	public int getTruckCapacity() {
		return truckCapacity;
	}


	public void setTruckCapacity(int truckCapacity) {
		this.truckCapacity = truckCapacity;
	}


	public boolean isTrailerSupport() {
		return trailerSupport;
	}


	public void setTrailerSupport(boolean trailerSupport) {
		this.trailerSupport = trailerSupport;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("This Truck can carry: "+this.truckCapacity+" tons, Does it support a trailer? "+(this.trailerSupport ? "Yes" : "No"));
	}
	
	

}
