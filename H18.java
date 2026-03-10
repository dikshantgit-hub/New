import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


/**
 * Write a description of class H18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class H18
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JPanel Panel = new JPanel();
        Panel.setLayout(new BoxLayout(Panel, BoxLayout.Y_AXIS));
        Panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
       
        JLabel idLabel = new JLabel("Student ID:");
        JTextField idField = new JTextField(15);
       
        JLabel nameLabel = new JLabel("Student Name:");
        JTextField nameField = new JTextField(15);
       
        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        JRadioButton otherRadio = new JRadioButton("Other");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        genderGroup.add(otherRadio);
       
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        genderPanel.add(otherRadio);
       
        JLabel skillLabel = new JLabel("Programming Skills:");
        JCheckBox javaCheck = new JCheckBox("Java");
        JCheckBox pythonCheck = new JCheckBox("Python");
        JCheckBox cppCheck = new JCheckBox("C++");
        JCheckBox cSharpCheck = new JCheckBox("C#");
        JCheckBox javascriptCheck = new JCheckBox("JavaScript");
       
        JPanel skillPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        skillPanel.add(javaCheck);
        skillPanel.add(pythonCheck);
        skillPanel.add(cppCheck);
        skillPanel.add(cSharpCheck);
        skillPanel.add(javascriptCheck);
       
        JLabel courseLabel = new JLabel("Course:");
        String[] courses = {"BCA", "BFA", "BIT"};
        JComboBox<String> courseCombo = new JComboBox<>(courses);
       
        JButton addButton = new JButton("Add Student");
        JButton viewButton = new JButton("View Students");
        JButton deleteButton = new JButton("Delete Student");
       
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);
        buttonPanel.add(deleteButton);
       
        JTextArea outputArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(outputArea);
       
        Panel.add(idLabel);
        Panel.add(idField);
        Panel.add(nameLabel);
        Panel.add(nameField);
        Panel.add(genderLabel);
        Panel.add(genderPanel);
        Panel.add(skillLabel);
        Panel.add(skillPanel);
        Panel.add(courseLabel);
        Panel.add(courseCombo);
        Panel.add(buttonPanel);
        Panel.add(scrollPane);
       
        frame.add(Panel);
        frame.setVisible(true);
    }
}
