package W17;
import javax.swing.SwingUtilities;


/**
 * Write a description of class Launcher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Launcher
{
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> {

            Model s1 = new Model("ST101","Ram Sharma","Computing");
            Model s2 = new Model("ST102","Sita Rai","Networking");

            new View(s1);
            new View(s2);

        });
    }
}