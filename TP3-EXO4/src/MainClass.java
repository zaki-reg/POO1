public class MainClass {
    public static void main(String[] args) {

    	Hospital hospital = new Hospital("Hospital L'Bled", "General", "0 36 55 68 40\n");

       
        Department cardiology = new Department("Cardiology");
        Department neurology = new Department("Neurology");

        hospital.addDepartment(cardiology);
        hospital.addDepartment(neurology);

        Doctor doctor1 = new Doctor("Dr. Akkab", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Geuttaf", "Neurology");

        cardiology.addDoctor(doctor1);
        neurology.addDoctor(doctor2);

        System.out.println("Hospital: " + hospital.getHospitalName());
        System.out.println("Category: " + hospital.getCategory());
        System.out.println("SOS Phone: " + hospital.getSosPhone());
        System.out.println("Departments:");

        for (Department dept : hospital.getDepartments()) {
            System.out.println(" - ID: " + dept.getIdDep() + ", Specialty: " + dept.getSpecialty());
            System.out.println("   Doctors:");
            for (Doctor doc : dept.getDoctors()) {
                System.out.println("        * Doctor ID: " + doc.getId_Doct() + ", Name: " + doc.getName() + ", Specialty: " + doc.getDoc_Speciality()+"\n");
            }
        }

        neurology.removeDoctor(doctor2);
        System.out.println("\nAfter removing Dr. Geuttaf from Neurology:\n");
        
        for (Department dept : hospital.getDepartments()) {
            System.out.println(" - ID: " + dept.getIdDep() + ", Specialty: " + dept.getSpecialty());
            System.out.println("   Doctors:\n");
            for (Doctor doc : dept.getDoctors()) {
                System.out.println("        * Doctor ID: " + doc.getId_Doct() + ", Name: " + doc.getName() + ", Specialty: " + doc.getDoc_Speciality()+"\n");
            }
        }
        }
    }
