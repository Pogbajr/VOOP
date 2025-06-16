// VUTMSApp.java
public class VUTMSApp {
    public static void main(String[] args) {
        // Demonstrating User Polymorphism
        User student = new Student("VU-DIT-24-24*0832*DAY", "Abdallah", "kizitoabdallah@gmail.com", "Diploma in Information Technology");
        User lecturer = new Lecturer("VU-LEC001", "Dr. Alex Bazigu Alex", "balex@vu.ac.ug", "Computer Science");
        User officer = new TransportOfficer("VU-TO001", "Ms. Joannah", "njoannah@vu.ac.ug", "Morning");

        student.requestTransport();
        lecturer.requestTransport();
        officer.requestTransport();

        System.out.println("\n--- VEHICLE OPERATIONS ---");
        Bus bus = new Bus("VUB123", 45);
        Van van = new Van("VUV456", "Alex");

        bus.schedule("Route A");
        bus.trackLocation();
        bus.service();

        van.schedule("Route B");
        van.trackLocation();
        van.service();

        System.out.println("\n--- DRIVER ASSIGNMENT ---");
        DriverManager manager = new DriverManager();
        manager.assignDriver("Bus");
        manager.assignDriver("10:00 AM - 6:00 PM", false);
    }
}
