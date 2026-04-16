package W21;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;

public class EmployeeManagementTemplate extends JFrame {

    // UI Components
    private JLabel headerLabel;
    private JTextField nameField, salaryField;
    private JRadioButton fullTime, partTime, contract;
    private JCheckBox healthInsurance, dentalInsurance, retirementPlan;
    private JComboBox<String> departmentBox;
    private JTextArea displayArea;
    private JLabel charCountLabel, mousePositionLabel;
    private JLabel statusLabel;
    private JButton registerBtn;

    // Panel for advanced events
    private JPanel advancedEventPanel;

    // Store employees
    private ArrayList<String> employees = new ArrayList<>();

    public EmployeeManagementTemplate() {
        setTitle("Employee Management System");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 700);

        // ===== Header =====
        JPanel header = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headerLabel = new JLabel("<html><h1>Employee Management System</h1></html>");
        header.add(headerLabel);
        Color headerOriginalColor = new Color(70, 130, 200);
        header.setBackground(headerOriginalColor);
        headerLabel.setForeground(Color.WHITE);
        add(header, BorderLayout.NORTH);

        // Header mouse hover effect
        header.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                header.setBackground(Color.ORANGE);
                headerLabel.setText("<html><h1>Employee Records View</h1></html>");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                header.setBackground(headerOriginalColor);
                headerLabel.setText("<html><h1>Employee Management System</h1></html>");
            }
        });

        // ===== Sidebar =====
        JPanel sidebar = new JPanel();
        sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
        sidebar.setPreferredSize(new Dimension(200, 0));
        sidebar.setBackground(new Color(240, 240, 240));

        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(new JButton("Add Employee"));
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(new JButton("View Employees"));
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(new JButton("Update Employee"));
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(new JButton("Delete Employee"));
        sidebar.add(Box.createRigidArea(new Dimension(0, 10)));
        sidebar.add(new JButton("Search Employee"));
        sidebar.add(Box.createVerticalGlue());

        add(sidebar, BorderLayout.WEST);

        // ===== Form Panel =====
        JPanel form = new JPanel();
        form.setLayout(new BoxLayout(form, BoxLayout.Y_AXIS));
        form.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        form.setBackground(Color.WHITE);

        // Advanced Event Panel (Mouse coordinates)
        advancedEventPanel = new JPanel();
        advancedEventPanel.setLayout(new BoxLayout(advancedEventPanel, BoxLayout.Y_AXIS));
        advancedEventPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        mousePositionLabel = new JLabel("Mouse: 0,0");
        mousePositionLabel.setFont(new Font("Arial", Font.BOLD, 14));
        advancedEventPanel.add(mousePositionLabel);

        advancedEventPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mousePositionLabel.setText("Mouse: " + e.getX() + "," + e.getY());
            }
        });

        form.add(advancedEventPanel);
        form.add(Box.createRigidArea(new Dimension(0, 10)));

        // Name Field
        nameField = new JTextField(20);
        form.add(createFieldPanel("Full Name:", nameField));
        form.add(Box.createRigidArea(new Dimension(0, 10)));

        // Salary Field (only digits and dot)
        salaryField = new JTextField(20);
        form.add(createFieldPanel("Salary:", salaryField));
        form.add(Box.createRigidArea(new Dimension(0, 10)));

        salaryField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    e.consume(); // block other keys
                }
            }
        });

        // Employment Type
        JPanel empPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        empPanel.add(new JLabel("Employment Type:"));
        fullTime = new JRadioButton("Full-Time");
        partTime = new JRadioButton("Part-Time");
        contract = new JRadioButton("Contract");

        ButtonGroup group = new ButtonGroup();
        group.add(fullTime);
        group.add(partTime);
        group.add(contract);

        empPanel.add(fullTime);
        empPanel.add(partTime);
        empPanel.add(contract);
        form.add(empPanel);
        form.add(Box.createRigidArea(new Dimension(0, 10)));

        // Benefits
        JPanel benPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        benPanel.add(new JLabel("Benefits:"));
        healthInsurance = new JCheckBox("Health");
        dentalInsurance = new JCheckBox("Dental");
        retirementPlan = new JCheckBox("Retirement");

        benPanel.add(healthInsurance);
        benPanel.add(dentalInsurance);
        benPanel.add(retirementPlan);
        form.add(benPanel);
        form.add(Box.createRigidArea(new Dimension(0, 10)));

        // Department
        JPanel deptPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        deptPanel.add(new JLabel("Department:"));
        String[] depts = {"IT", "HR", "Finance", "Marketing"};
        departmentBox = new JComboBox<>(depts);
        deptPanel.add(departmentBox);
        form.add(deptPanel);
        form.add(Box.createRigidArea(new Dimension(0, 10)));

        // Action Buttons
        registerBtn = new JButton("Register Employee");
        JButton clearFormBtn = new JButton("Clear Form");
        JButton clearAllBtn = new JButton("Clear All Records");

        registerBtn.addActionListener(e -> registerEmployee());
        clearFormBtn.addActionListener(e -> clearForm());
        clearAllBtn.addActionListener(e -> clearAllRecords());

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnPanel.add(registerBtn);
        btnPanel.add(clearFormBtn);
        btnPanel.add(clearAllBtn);
        form.add(btnPanel);

        add(form, BorderLayout.CENTER);

        // Display Area
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setLineWrap(true);
        displayArea.setWrapStyleWord(true);
        add(new JScrollPane(displayArea), BorderLayout.EAST);

        // Footer
        JPanel footer = new JPanel(new GridLayout(1, 2));
        footer.setBackground(Color.DARK_GRAY);

        charCountLabel = new JLabel("Characters: 0");
        charCountLabel.setForeground(Color.WHITE);
        statusLabel = new JLabel("Status: Ready");
        statusLabel.setForeground(Color.WHITE);

        footer.add(charCountLabel);
        footer.add(statusLabel);

        add(footer, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Helper for text fields
    private JPanel createFieldPanel(String label, JTextField field) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel jlabel = new JLabel(label);
        jlabel.setPreferredSize(new Dimension(120, 25));
        panel.add(jlabel);
        field.setPreferredSize(new Dimension(300, 30));
        panel.add(field);
        return panel;
    }
    
    // ===== Employee Methods =====
    private void registerEmployee() {
    try {
        String name = nameField.getText();
        String salaryText = salaryField.getText();

        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        if (salaryText == null || salaryText.trim().isEmpty()) {
            throw new IllegalArgumentException("Salary field cannot be empty.");
        }

        double salary;
        try 
        {
            salary = Double.parseDouble(salaryText);
        } 
        catch (NumberFormatException e) 
        {
            throw new IllegalArgumentException("Invalid input");
        }

        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be less than 0.");
        }

        if (!fullTime.isSelected() && !partTime.isSelected() && !contract.isSelected()) {
            throw new IllegalArgumentException("Please select employment type.");
        }

        String dept = (String) departmentBox.getSelectedItem();

        String type = "";
        if (fullTime.isSelected()) type = "Full-Time";
        else if (partTime.isSelected()) type = "Part-Time";
        else if (contract.isSelected()) type = "Contract";

        String benefits = "";
        if (healthInsurance.isSelected()) benefits += "Health ";
        if (dentalInsurance.isSelected()) benefits += "Dental ";
        if (retirementPlan.isSelected()) benefits += "Retirement ";

        String record = name + " | " + salary + " | " + dept + " | " + type + " | " + benefits;

        employees.add(record);
        displayArea.append(record + "\n");

        statusLabel.setText("Status: Employee Saved Successfully");
        JOptionPane.showMessageDialog(this, "Employee Saved Successfully!");

        charCountLabel.setText("Characters: " + record.length());

        } 
        catch (IllegalArgumentException ex) 
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
        } 
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(this, "Something went wrong!", "System Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearForm() {
        nameField.setText("");
        salaryField.setText("");
        fullTime.setSelected(false);
        partTime.setSelected(false);
        contract.setSelected(false);
        healthInsurance.setSelected(false);
        dentalInsurance.setSelected(false);
        retirementPlan.setSelected(false);
        departmentBox.setSelectedIndex(0);

        statusLabel.setText("Status: Form Cleared");
    }

    private void clearAllRecords() {
        employees.clear();
        displayArea.setText("");
        statusLabel.setText("Status: All Records Cleared");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EmployeeManagementTemplate::new);
    }
}