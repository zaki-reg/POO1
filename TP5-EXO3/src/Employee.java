
public class Employee extends Person{
	
	private String position;
	private double baseSalary;
	private double bonus;
	
	
	
	public Employee(String name, int birthDate, String address, String position, int baseSalary, int bonus) {
		super(name, birthDate, address);
		this.position = position;
		this.baseSalary = baseSalary;
		this.bonus = bonus;
	}



	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("[Employee] - Position: "+this.position+".");
		System.out.println("           - Base Salary: "+this.baseSalary+".");
		System.out.println("           - Bonus: "+this.bonus+".");
	}
	
	
	public double calculateSalary() {
		return this.baseSalary + this.bonus - (this.baseSalary * 0.09);
		
	}

}
