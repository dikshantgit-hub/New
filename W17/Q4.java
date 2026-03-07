package W17;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JLabel;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4 extends JFrame
{
    public Q4()
    {
        setTitle("Student Id Card");
        setSize(400,300);
        
        JPanel panel = new JPanel();
        panel.setBounds(100, 50, 150, 150);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        String htmlText = "<html><body><div style='text-align: center'><p>Student Name: Shishir Mishra</p><p>Module: Programming</p><p>College: Islington College</p></div></body></html>";
        JLabel label = new JLabel(htmlText);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setBounds(10,10,130,120);
        
        setLayout(null);
        panel.setLayout(null);

        panel.add(label);
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
        Q4 student = new Q4();
        student.setVisible(true);
    }
        );
    }
}