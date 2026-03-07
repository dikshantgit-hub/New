package W17;
import javax.swing.*;

/**
 * Write a description of class Model here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class View extends JFrame
{
    public View(Model student) {

        setTitle("Student ID Card");

        JLabel label = new JLabel("<html>" + student.getFormattedDetails() + "</html>", SwingConstants.CENTER);
        add(label);

        setSize(450,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}