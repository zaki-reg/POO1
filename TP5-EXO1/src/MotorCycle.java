
public class MotorCycle extends Vehicle {
	
	private int seatHeight;
	private boolean hastractionControl;
	
	
	public MotorCycle(String maker, int topSpeed, String fuelType, String plaqueNumber, boolean transmissionType,int seatHeight,
			boolean hastractionControl, int nbOfWhhels, int horsePower, double engineCapacity) {
	     super(maker, topSpeed, fuelType, plaqueNumber, transmissionType, nbOfWhhels,horsePower,engineCapacity);
		this.seatHeight = seatHeight;
		this.hastractionControl = hastractionControl;
		this.engine = new Engine(120, 1.0);
	}


	public int getSeatHeight() {
		return seatHeight;
	}


	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}


	public boolean isHastractionControl() {
		return hastractionControl;
	}


	public void setHastractionControl(boolean hastractionControl) {
		this.hastractionControl = hastractionControl;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("This MotorCycle's seat is : "+this.seatHeight+" cm, Does it have a traction control? "+(this.hastractionControl ? "Yes" : "No"));
	}
	
	

}
