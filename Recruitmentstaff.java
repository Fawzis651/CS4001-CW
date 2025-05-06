import java.util.ArrayList;
import java.util.Scanner;

public class RecruitmentSystem {
    public static void main(String[] args) {
        ArrayList<StaffHire> staffList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Part-Time Staff");
            System.out.println("2. Show All Staff Info");
            System.out.println("3. Terminate a Staff Member");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear newline

            if (choice == 1) {
                System.out.print("Vacancy No: ");
                int vacancyNo = sc.nextInt();
                sc.nextLine();
                System.out.print("Designation: ");
                String designation = sc.nextLine();
                System.out.print("Job Type: ");
                String jobType = sc.nextLine();
                System.out.print("Staff Name: ");
                String name = sc.nextLine();
                System.out.print("Joining Date: ");
                String joiningDate = sc.nextLine();
                System.out.print("Qualification: ");
                String qualification = sc.nextLine();
                System.out.print("Appointed By: ");
                String appointedBy = sc.nextLine();
                System.out.print("Working Hours: ");
                int hours = sc.nextInt();
                System.out.print("Wage Per Hour: ");
                double wage = sc.nextDouble();
                sc.nextLine(); // clear newline
                System.out.print("Shift: ");
                String shift = sc.nextLine();

                PartTimeStaffHire newStaff = new PartTimeStaffHire(
                    vacancyNo, designation, jobType, name,
                    joiningDate, qualification, appointedBy,
                    true, hours, wage, shift
                );

                staffList.add(newStaff);
                System.out.println("Staff added successfully.");

            } else if (choice == 2) {
                if (staffList.isEmpty()) {
                    System.out.println("No staff added yet.");
                } else {
                    for (int i = 0; i < staffList.size(); i++) {
                        System.out.println("Staff #" + (i + 1));
                        staffList.get(i).showInfo();
                        System.out.println("-------------------------");
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter index to terminate (starting from 1): ");
                int index = sc.nextInt();
                int realIndex = index - 1;

                if (realIndex >= 0 && realIndex < staffList.size()) {
                    StaffHire staff = staffList.get(realIndex);
                    if (staff instanceof PartTimeStaffHire) {
                        ((PartTimeStaffHire) staff).terminate();
                    } else {
                        System.out.println("Selected staff is not part-time.");
                    }
                } else {
                    System.out.println("Invalid index.");
                }

            } else if (choice == 4) {
                System.out.println("Exiting program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
