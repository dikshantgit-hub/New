package W18;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Form here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Form extends JFrame
{
    String[] buttons = {"Add", "Edit", "Delete", "Update"};
    public Form()
    {
        setTitle("Student Registration");
        setSize(400,300);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Student Form");
        panel.add(label);
        
        JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
        sidePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        sidePanel.add(Box.createVerticalGlue());
        for(String button: buttons)
        {
            JButton btn = new JButton(button);
            sidePanel.add(btn);
            btn.setMaximumSize(new Dimension(100, 40));
            sidePanel.add(Box.createVerticalStrut(10));
        }
        
        sidePanel.add(Box.createVerticalGlue());
        
        JPanel formPanel= new JPanel();
        formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
        
        JPanel row1= new JPanel();
        row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
        
        JLabel nameLabel= new JLabel("Name: ");
        JTextField nameField = new JTextField(10);
        
        sidePanel.add(nameField);
        nameField.setMaximumSize(new Dimension(100,20));
        
        row1.add(nameLabel);
        row1.add(Box.createHorizontalStrut(10));
        row1.add(nameField);
        
        JPanel row2= new JPanel();        
        row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
        row2.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel genderLabel= new JLabel("Gender: ");
        String[] genders= {"Male", "Female"};
        
        row2.add(genderLabel);
        
        ButtonGroup btnGrp= new ButtonGroup();
        
        for(String gender : genders)
        {
            JRadioButton btn= new JRadioButton(gender);
            btnGrp.add(btn);
            row2.add(btn);
        }
        
        
        JPanel row3= new JPanel();
        row3.setLayout(new  BoxLayout(row3, BoxLayout.X_AXIS));
        row3.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel checkLabel = new JLabel("Skills: ");
        String[] skills= {"Java", "Python", "C++"};
        
        ButtonGroup cbGrp = new ButtonGroup();
        
        for(String skill: skills)
        {
            JCheckBox check= new JCheckBox(skill);
            row3.add(check);
        }
        
        JPanel row4= new JPanel();
        row4.setLayout(new  BoxLayout(row4, BoxLayout.X_AXIS));
        row4.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel courLabel = new JLabel("Courses: ");
        String[] courses= {"B.Tech", "M.Tech", "B.Sc","M.Sc"};
        
        ButtonGroup coGrp = new ButtonGroup();
        
        JComboBox<String> combo = new JComboBox<>(courses);

        row4.add(courLabel);
        row4.add(combo);
        
        String[] buts = {"Submit"};
        for (String but : buts)
        {
            JButton btn = new JButton(but);
            btn.setMaximumSize(new Dimension(100, 40));
            sidePanel.add(btn);
            sidePanel.add(Box.createVerticalStrut(10));
        }
        
        
        
        
        
        formPanel.add(row1);
        formPanel.add(row2);
        formPanel.add(row3);
        formPanel.add(row4);
        
        add(formPanel, BorderLayout.CENTER);
        add(panel, BorderLayout.NORTH);
        add(sidePanel, BorderLayout.WEST);
        
        pack();
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->  {
            new Form().setVisible(true);
        }
        );
    }
}