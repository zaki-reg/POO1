import java.util.ArrayList;
import java.util.List;

public class Department {
    private static int id_Counter = 1; 
    private String specialty;
    private int id_dep;
    private ArrayList<Doctor> doctors;

    public Department(String specialty) {
        this.specialty = specialty;
        this.id_dep = id_Counter++;
        this.doctors = new ArrayList<>();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getIdDep() {
        return id_dep;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void removeDoctor(Doctor doctor) {
        doctors.remove(doctor);
    }
}
