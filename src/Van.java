// Van.java
public class Van implements Schedulable, Trackable, Serviceable {
    private String registrationNumber;
    private String driver;

    public Van(String registrationNumber, String driver) {
        this.registrationNumber = registrationNumber;
        this.driver = driver;
    }

    @Override
    public void schedule(String route) {
        System.out.println("Van " + registrationNumber + " with driver " + driver + " is scheduled for route: " + route);
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking location of Van " + registrationNumber);
    }

    @Override
    public void service() {
        System.out.println("Servicing Van " + registrationNumber);
    }
}
