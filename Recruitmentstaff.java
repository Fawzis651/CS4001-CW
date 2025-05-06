import java.util.ArrayList;
import java.util.Scanner;

public class RecruitmentSystem {
    public static void main(String[] args) {
        ArrayList<StaffHire> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu");
            System.out.println("1. Add Part-Time Staff");
            System.out.println("2. Show Staff Info");
            System.out.println("3. Terminate Staff");
            System.out.println("4. Exit");
            System.out.print("Pick: ");
            int pick = sc.nextInt();
            sc.nextLine();

            if (pick == 1) {
                System.out.print("Vacancy No: ");
                int v = sc.nextInt();
                sc.nextLine();
                System.out.print("Designation: ");
                String d = sc.nextLine();
                System.out.print("Job Type: ");
                String jt = sc.nextLine();
                System.out.print("Name: ");
                String n = sc.nextLine();
                System.out.print("Joining Date: ");
                String jd = sc.nextLine();
                System.out.print("Qualification: ");
                String q = sc.nextLine();
                System.out.print("Appointed By: ");
                String a = sc.nextLine();
                System.out.print("Working Hours: ");
                int wh = sc.nextInt();
                System.out.print("Wages Per Hour: ");
                double wph = sc.nextDouble();
                sc.nextLine();
                System.out.print("Shift: ");
                String s = sc.nextLine();

                PartTimeStaffHire p = new PartTimeStaffHire(v, d, jt, n, jd, q, a, true, wh, wph, s);
                list.add(p);
                System.out.println("Part-time staff added.");

            } else if (pick == 2) {
                for (StaffHire s : list) {
                    s.showInfo();
                    System.out.println("----------------");
                }

            } else if (pick == 3) {
                System.out.print("Enter index to terminate: ");
                int i = sc.nextInt();
                if (i >= 0 && i < list.size()) {
                    if (list.get(i) instanceof PartTimeStaffHire) {
                        PartTimeStaffHire pt = (PartTimeStaffHire) list.get(i);
                        pt.terminate();
                    } else {
                        System.out.println("Not a part-time staff.");
                    }
                } else {
                    System.out.println("Invalid index.");
                }

            } else if (pick == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
        }

        sc.close();
    }
}
