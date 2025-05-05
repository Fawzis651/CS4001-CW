public class StaffHire {
    private int vacancyNumber;
    private String designation;
    private String jobType;
    private String staffNamee;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

    public StaffHire(int vacancyNumber, String designation, String jobType, String staffName, String joiningDate,
                     String qualification, String appointedBy, boolean joined) {
        this.vacancyNumber = vacancyNumber;
        this.designation = designation;
        this.jobType = jobType;
        this.staffName = staffName;
        this.joiningDate = joining Date;
        this.qualification = qualification;
        this.appointedBy = appointedBy;
        this.joined = joined;
    }

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
