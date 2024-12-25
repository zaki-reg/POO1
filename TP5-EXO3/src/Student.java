
public class Student extends Person{
	
	private String speciality;
	private String level;
	
	
	
	
	public Student(String name, int birthYear, String address, String speciality, String level) {
		super(name, birthYear, address);
		this.speciality = speciality;
		this.level = level;
	}




	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("[Student] - Speciality: "+this.speciality+".");
		System.out.println("          - Level: "+this.level+".");
	}
	
	public int calculateAge(int currentYear) {
		return currentYear - birthYear;
	}

}
