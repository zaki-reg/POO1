
public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("Ahmed", 2000, "Alger");
		Employee emp1=new Employee("Mohammed", 1985, "Oran", "Mécanicien", 75000, 25000);
		Person p2=new Employee("Ali", 1990, "Setif", "Informaticien", 65000, 15000);
		Student e1=new Student("Djamel", 2005, "Setif", "Informatique", "L2");
		Person e2=new Student("Lamia", 2002, "Constantine", "Chimie", "M2");
		
		
		
		p1 = e1;
		p1.displayInfo();
		System.out.println("Age = "+e1.calculateAge(2023));
		
		System.out.println();
		
		p2 = emp1 ;
		p2.displayInfo() ;
		System.out.println("Salaire = " + emp1.calculateSalary()); 
		
		System.out.println();
		System.out.println();
		
		Person [] tp = {p1, p2, emp1, e1, e2} ;
		for (Person p : tp) {
			p.displayInfo() ;
			System.out.println();
		}
		 
		
		
		
	}

}
