public class FullTimeStaffHire extends StaffHire {
    private double salary;
    private int workingHours;

    // Constructor
    public FullTimeStaffHire(int vacNo, String des, String type, String name,
                             String date, String qual, String appointedBy,
                             boolean joined, double sal, int hours) {
        super(vacNo, des, type, name, date, qual, appointedBy, joined);
        salary = sal;
        workingHours = hours;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Getter for working hours
    public int getWorkingHours() {
        return workingHours;
    }

    // Change salary if staff is joined
    public void changeSalary(double newSalary) {
        if (getJoined()) {
            salary = newSalary;
            System.out.println("New salary set to: " + salary);
        } else {
            System.out.println("Can't change salary. Staff not joined.");
        }
    }

    // Change working hours
    public void changeWorkingHours(int newHours) {
        workingHours = newHours;
        System.out.println("Working hours changed to: " + workingHours);
    }

    // Show info about staff
    public void showInfo() {
        super.showInfo();  // Call parent method
        if (getJoined()) {
            System.out.println("Salary: " + salary);
            System.out.println("Working Hours per Week: " + workingHours);
        } else {
            System.out.println("This staff hasn't joined yet.");
        }
    }

    // Main method to try the class (for testing)
    public static void main(String[] args) {
        FullTimeStaffHire f = new FullTimeStaffHire(101, "Team Lead", "Full-Time",
            "Alex", "2025-04-10", "BSc CS", "John", true, 45000, 40);
        
        f.showInfo();
        f.changeSalary(47000);
        f.changeWorkingHours(42);
        f.showInfo();
    }
}
