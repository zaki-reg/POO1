public class Doctor {
    private static int id_Counter = 1; 
    private int id_Doct;
    private String name;
    private String doc_speciality;

    public Doctor(String name, String doc_speciality) {
        this.id_Doct = id_Counter++;
        this.name = name;
        this.doc_speciality = doc_speciality;
    }

    public int getId_Doct() {
        return id_Doct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoc_Speciality() {
        return doc_speciality;
    }

    public void setDoc_Speciality(String doc_speciality) {
        this.doc_speciality = doc_speciality;
    }
}
