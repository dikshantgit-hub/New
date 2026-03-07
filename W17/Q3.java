package W17;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;
import java.awt.Frame;


/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3 extends JFrame
{
    public Q3()
    {
        setTitle("Student Profile");
        setSize(200,200);
        
        JPanel panel = new JPanel();
        panel.setBounds(100, 50, 100, 30);
        
        JLabel label = new JLabel();
        label.setBounds(80, 40, 80, 20);
        
        panel.add(label);
        panel.setLayout(null);
        add(panel);
        
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
        Q3 student = new Q3();
        student.setVisible(true);
        });
    }
}