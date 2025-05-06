import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class RecruitmentSystemGUI extends JFrame {
    private ArrayList<StaffHire> staffList = new ArrayList<>();
    private JTextArea displayArea;

    public RecruitmentSystemGUI() {
        setTitle("Recruitment System");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel buttons = new JPanel(new GridLayout(2, 3));
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        JButton addFullTime = new JButton("Add Full-Time");
        JButton addPartTime = new JButton("Add Part-Time");
        JButton setSalary = new JButton("Set Salary");
        JButton setShift = new JButton("Set Shift");
        JButton terminate = new JButton("Terminate");
        JButton display = new JButton("Display All");

        buttons.add(addFullTime);
        buttons.add(addPartTime);
        buttons.add(setSalary);
        buttons.add(setShift);
        buttons.add(terminate);
        buttons.add(display);

        add(buttons, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        addFullTime.addActionListener(e -> addFullTimeStaff());
        addPartTime.addActionListener(e -> addPartTimeStaff());
        setSalary.addActionListener(e -> JOptionPane.showMessageDialog(this, "Set salary clicked"));
        setShift.addActionListener(e -> JOptionPane.showMessageDialog(this, "Set shift clicked"));
        terminate.addActionListener(e -> JOptionPane.showMessageDialog(this, "Terminate clicked"));
        display.addActionListener(e -> displayAllStaff());
    }

    private void addFullTimeStaff() {
        try {
            String name = JOptionPane.showInputDialog("Enter Name:");
            String desig = JOptionPane.showInputDialog("Enter Designation:");
            double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter Salary:"));

            FullTimeStaffHire staff = new FullTimeStaffHire(1, desig, "Full-Time", name, "2025-05-01", "BA", "HR", true, salary, 40);
            staffList.add(staff);
            JOptionPane.showMessageDialog(this, "Full-Time Staff Added");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter correct data");
        }
    }

    private void addPartTimeStaff() {
        try {
            String name = JOptionPane.showInputDialog("Enter Name:");
            String desig = JOptionPane.showInputDialog("Enter Designation:");
            double wage = Double.parseDouble(JOptionPane.showInputDialog("Enter Wage:"));

            PartTimeStaffHire staff = new PartTimeStaffHire(2, desig, "Part-Time", name, "2025-05-01", "BSc", "Manager", true, 5, wage, "Day");
            staffList.add(staff);
            JOptionPane.showMessageDialog(this, "Part-Time Staff Added");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter correct data");
        }
    }

    private void displayAllStaff() {
        StringBuilder text = new StringBuilder();
        for (StaffHire s : staffList) {
            text.append(s.toString()).append("\n");
        }
        displayArea.setText(text.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RecruitmentSystemGUI app = new RecruitmentSystemGUI();
            app.setVisible(true);
        });
    }
}
