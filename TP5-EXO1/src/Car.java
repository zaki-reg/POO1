
public class Car extends Vehicle {
	private int nbOfDoors;
	private boolean hasSenesors;
	
	
	public Car(String maker, int topSpeed, String fuelType, String plaqueNumber, boolean transmissionType, 
            int number0fDoors, boolean hasParkingSensors, int nbOfWheels, int horsePower, double engineCapacity) {
     super(maker, topSpeed, fuelType, plaqueNumber, transmissionType, nbOfWheels, horsePower, engineCapacity);
     this.nbOfDoors = number0fDoors;
     this.hasSenesors = hasParkingSensors;
     this.engine = new Engine(220, 1.5);
 }


	public int getNbOfDoors() {
		return nbOfDoors;
	}


	public void setNbOfDoors(int nbOfDoors) {
		this.nbOfDoors = nbOfDoors;
	}


	public boolean isHasSenesors() {
		return hasSenesors;
	}


	public void setHasSenesors(boolean hasSenesors) {
		this.hasSenesors = hasSenesors;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("This car has: "+this.nbOfDoors+" doors, Has parking sensors? " + (this.hasSenesors ? "Yes" : "No") + ". Number of Wheels: " + this.getNbOfWheeles());
	}
	

}
