// DriverManager.java
public class DriverManager {

    public void assignDriver(String vehicleType) {
        System.out.println("Assigning driver based on vehicle type: " + vehicleType);
        // Example logic
        if (vehicleType.equalsIgnoreCase("Bus")) {
            System.out.println("Driver Abdallah assigned to Bus.");
        } else if (vehicleType.equalsIgnoreCase("Van")) {
            System.out.println("Driver Abel assigned to Van.");
        } else {
            System.out.println("No driver available for this vehicle type.");
        }
    }

    public void assignDriver(String shiftTime, boolean isNightShift) {
        System.out.println("Assigning driver for shift: " + shiftTime);
        if (isNightShift) {
            System.out.println("Night shift driver Mahad assigned.");
        } else {
            System.out.println("Day shift driver Emmanuel assigned.");
        }
    }
}
