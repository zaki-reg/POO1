
public class Engine {
	
	private int horsePower;
	private double engineCapacity;
	
	
	public Engine(int horsePower, double d) {
		this.horsePower = horsePower;
		this.engineCapacity = d;
	}


	public int getHorsePower() {
		return horsePower;
	}


	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}


	public double getEngineCapacity() {
		return engineCapacity;
	}


	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	public void displayInfo() {
        System.out.println("Engine Horsepower: " + horsePower + ", Engine Capacity: " + engineCapacity + "L.");
    }
	
	

}
