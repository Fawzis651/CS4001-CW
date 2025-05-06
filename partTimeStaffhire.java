public class PartTimeStaffHire extends StaffHire {
    private int workingHour;
    private double wagesPerHour;
    private String shifts;
    private boolean terminated;

    public PartTimeStaffHire(int vacancyNumber, String designation, String jobType, String staffName,
                             String joiningDate, String qualification, String appointedBy, boolean joined,
                             int workingHour, double wagesPerHour, String shifts) {
        super(vacancyNumber, designation, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        this.terminated = false;
    }

    public int getWorkingHour() { return workingHour; }
    public double getWagesPerHour() { return wagesPerHour; }
    public String getShifts() { return shifts; }
    public boolean isTerminated() { return terminated; }

    public void changeShift(String newShift) {
        if (getJoined()) {
            shifts = newShift;
        } else {
            System.out.println("Staff has not joined yet.");
        }
    }

    public void terminate() {
        if (terminated) {
            System.out.println("Already terminated.");
        } else {
            setStaffName("");
            setJoiningDate("");
            setQualification("");
            setAppointedBy("");
            setJoined(false);
            terminated = true;
            System.out.println("Staff terminated.");
        }
    }

    public void showInfo() {
        super.showInfo();
        if (!terminated) {
            System.out.println("Working Hour: " + workingHour);
            System.out.println("Wages Per Hour: " + wagesPerHour);
            System.out.println("Shift: " + shifts);
            System.out.println("Terminated: " + terminated);
            System.out.println("Daily Income: " + (wagesPerHour * workingHour));
        }
    }
}
