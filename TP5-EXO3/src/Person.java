
public class Person {
	
	private String name;
	protected int birthYear;
	private String address;
	
	
	
	public Person(String name, int birthYear, String address) {
		this.name = name;
		this.birthYear = birthYear;
		this.address = address;
	}


	public void displayInfo() {
		System.out.println("[Person] - Name: "+this.name+".");
		System.out.println("         - Birth Date: "+this.birthYear+".");
		System.out.println("         - Address: "+this.address+".");
	}

}
