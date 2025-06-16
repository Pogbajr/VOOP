// Student.java
public class Student extends User {
    private String course;

    public Student(String id, String name, String email, String course) {
        super(id, name, email);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void requestTransport() {
        System.out.println("Student " + getName() + " has requested transport for class schedule.");
    }
}
