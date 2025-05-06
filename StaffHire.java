public class StaffHire {
    private int vacancyNumber;
    private String designation;
    private String jobType;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

    // Constructor
    public StaffHire(int vacancyNumber, String designation, String jobType,
                     String staffName, String joiningDate, String qualification,
                     String appointedBy, boolean joined) {
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;
        this.staffName = staffName;
        this.joiningDate = joiningDate;
        this.qualification = qualification;
        this.appointedBy = appointedBy;
        this.joined = joined;
    }

    // Getters
    public int getVacancyNumber() {
        return vacancyNumber;
    }

    public String getDesignation() {
        return designation;
    }

    public String getJobType() {
        return jobType;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public String getQualification() {
        return qualification;
    }

    public String getAppointedBy() {
        return appointedBy;
    }

    public boolean getJoined() {
        return joined;
    }

    // Setters
    public void setStaffName(String name) {
        staffName = name;
    }

    public void setJoiningDate(String date) {
        joiningDate = date;
    }

    public void setQualification(String q) {
        qualification = q;
    }

    public void setAppointedBy(String a) {
        appointedBy = a;
    }

    public void setJoined(boolean j) {
        joined = j;
    }

    // Method to show details
    public void showInfo() {
        System.out.println("Vacancy Number: " + vacancyNumber);
        System.out.println("Designation: " + designation);
        System.out.println("Job Type: " + jobType);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Qualification: " + qualification);
        System.out.println("Appointed By: " + appointedBy);
        System.out.println("Joined: " + joined);
    }

    // Optional: useful for printing in GUI or logs
    @Override
    public String toString() {
        return "Vacancy Number: " + vacancyNumber + "\n" +
               "Designation: " + designation + "\n" +
               "Job Type: " + jobType + "\n" +
               "Staff Name: " + staffName + "\n" +
               "Joining Date: " + joiningDate + "\n" +
               "Qualification: " + qualification + "\n" +
               "Appointed By: " + appointedBy + "\n" +
               "Joined: " + joined;
    }
}
