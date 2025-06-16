// TransportOfficer.java
public class TransportOfficer extends User {
    private String shiftTime;

    public TransportOfficer(String id, String name, String email, String shiftTime) {
        super(id, name, email);
        this.shiftTime = shiftTime;
    }

    public String getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport Officer " + getName() + " is scheduling transport for users.");
    }
}
