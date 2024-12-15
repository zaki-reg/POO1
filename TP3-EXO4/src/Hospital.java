import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String hospitalName;
    private String category;
    private String sos_Phone;
    private ArrayList<Department> departments;

    public Hospital(String hospitalName, String category, String sosPhone) {
        this.hospitalName = hospitalName;
        this.category = category;
        this.sos_Phone = sosPhone;
        this.departments = new ArrayList<>();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSosPhone() {
        return sos_Phone;
    }

    public void setSosPhone(String sosPhone) {
        this.sos_Phone = sosPhone;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }
}
