// Lecturer.java
public class Lecturer extends User {
    private String department;

    public Lecturer(String id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer " + getName() + " has requested transport for faculty meeting.");
    }
}
