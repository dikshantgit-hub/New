package W17;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;

/**
 * Write a description of class Window here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Window extends JFrame
{
    public Window()
    {
        setTitle("CS4001NI Programming");
        setSize(400,500);
        
        
        JPanel panel = new JPanel();
        
        //panel.setBackground(Color.ORANGE);
        panel.setBorder(BorderFactory.createTitledBorder("User Info"));
        
        JLabel label = new JLabel("Username: ");
        label.setBounds(50, 50, 100, 30);
        
        JTextField txtField = new JTextField();
        txtField.setBounds(160, 50, 100, 30);
        
        JButton btnField = new JButton("Submit: ");
        btnField.setBounds(160, 80, 100, 30);
        btnField.setForeground(Color.BLUE);
        btnField.setBackground(new Color(255,200,0));
        
        panel.add(btnField);
        panel.add(txtField);
        panel.add(label);
        panel.setLayout(null);
        add(panel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args)
    {
        Window wd = new Window();
        wd.setVisible(true);
    }
}