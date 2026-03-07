package W17;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;

/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2 extends JFrame
{
    public Q2()
    {
        setTitle("Welcome to Orentation Day");
        setSize(400,300);
        
        
        JPanel panel = new JPanel();
        
    
        panel.setBackground(new Color(173, 216, 230));
        
        JLabel label = new JLabel("Welcome to Orentation Day");
        label.setFont(new Font("Roman", Font.BOLD, 16));
        label.setBounds(100, 50, 100, 30);
        
        
        panel.add(label);
        
        add(panel);
        
        
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args)
    {
        Q2 announce = new Q2();
        announce.setVisible(true);
    }
}