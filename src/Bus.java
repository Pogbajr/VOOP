// Bus.java
public class Bus implements Schedulable, Trackable, Serviceable {
    private String registrationNumber;
    private int capacity;

    public Bus(String registrationNumber, int capacity) {
        this.registrationNumber = registrationNumber;
        this.capacity = capacity;
    }

    @Override
    public void schedule(String route) {
        System.out.println("Bus " + registrationNumber + " is scheduled for route: " + route);
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking location of Bus " + registrationNumber);
    }

    @Override
    public void service() {
        System.out.println("Servicing Bus " + registrationNumber);
    }
}
