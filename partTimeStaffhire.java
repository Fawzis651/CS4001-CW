public class PartTimeStaffHire extends StaffHire {
    private int workingHour;
    private double wagesPerHour;
    private String shifts;
    private boolean terminated;

    // Constructor
    public PartTimeStaffHire(int vacNo, String des, String jobType, String name,
                             String date, String qualification, String appointedBy,
                             boolean joined, int hours, double wage, String shift) {
        super(vacNo, des, jobType, name, date, qualification, appointedBy, joined);
        this.workingHour = hours;
        this.wagesPerHour = wage;
        this.shifts = shift;
        this.terminated = false;
    }

    // Get methods
    public int getWorkingHour() {
        return workingHour;
    }

    public double getWagesPerHour() {
        return wagesPerHour;
    }

    public String getShifts() {
        return shifts;
    }

    public boolean isTerminated() {
        return terminated;
    }

    // Change shift if staff has joined
    public void changeShift(String newShift) {
        if (getJoined()) {
            shifts = newShift;
            System.out.println("Shift changed to: " + shifts);
        } else {
            System.out.println("Can't change shift. Staff hasn't joined.");
        }
    }

    // Terminate staff if not already terminated
    public void terminate() {
        if (terminated) {
            System.out.println("This staff is already terminated.");
        } else {
            setStaffName("");
            setJoiningDate("");
            setQualification("");
            setAppointedBy("");
            setJoined(false);
            terminated = true;
            System.out.println("Staff has been terminated.");
        }
    }

    // Show info
    public void showInfo() {
        super.showInfo();
        if (terminated) {
            System.out.println("Status: Terminated");
        } else if (getJoined()) {
            System.out.println("Working Hours: " + workingHour);
            System.out.println("Wage per Hour: " + wagesPerHour);
            System.out.println("Shift: " + shifts);
            System.out.println("Daily Income: " + (workingHour * wagesPerHour));
        } else {
            System.out.println("Staff has not joined yet.");
        }
    }

    // Main method to test this class (optional)
    public static void main(String[] args) {
        PartTimeStaffHire p = new PartTimeStaffHire(2, "Helper", "Part-Time", "Tom",
                "2025-05-01", "GCSE", "Admin", true, 5, 12.5, "Morning");

        p.showInfo();
        p.changeShift("Evening");
        p.terminate();
        p.showInfo();
    }
}
