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
        sidePanel.add(Box.createVerticalGlue());
        for(String button: buttons)
        {
            JButton btn = new JButton(button);
            sidePanel.add(btn);
            btn.setMaximumSize(new Dimension(100, 40));
            sidePanel.add(Box.createVerticalStrut(10));
        }
        
        sidePanel.add(Box.createVerticalGlue());
        add(panel, BorderLayout.NORTH);
        add(sidePanel, BorderLayout.WEST);
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->  {
            new Form().setVisible(true);
        }
        );
    }
}