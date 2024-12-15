
public class MotorCycle extends Vehicle {
	
	private int seatHeight;
	private boolean hastractionControl;
	
	
	public MotorCycle(String maker, int topSpeed, String fuelType, String plaqueNumber, boolean transmissionType, Engine engine,int seatHeight, boolean hastractionControl) {
	     super(maker, topSpeed, fuelType, plaqueNumber, transmissionType, engine);
		this.seatHeight = seatHeight;
		this.hastractionControl = hastractionControl;
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
