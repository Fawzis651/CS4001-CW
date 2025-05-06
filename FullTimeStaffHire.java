public class FullTimeStaffHire extends StaffHire {
    private double salary;
    private int workingHours;

    public FullTimeStaffHire(int vacancynum, String desig, String jobtype,
                             String sName, String dateJoined, String qualify,
                             String byWho, boolean hasJoined, double sal, int hours) {
        super(vacancynum, desig, jobtype, sName, dateJoined, qualify, byWho, hasJoined);
        this.salary = sal;
        this.workingHours = hours;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void changeSalary(double newSal) {
        if (getJoined()) {
            salary = newSal;
            System.out.println("Salary updated.");
        } else {
            System.out.println("Staff not joined.");
        }
    }

    public void changeWorkingHours(int newHours) {
        workingHours = newHours;
        System.out.println("Working hours updated.");
    }

    public void showInfo() {
        super.showInfo();
        if (getJoined()) {
            System.out.println("Salary: " + salary);
            System.out.println("Weekly Working Hours: " + workingHours);
        } else {
            System.out.println("Staff not joined yet.");
        }
    }
}
