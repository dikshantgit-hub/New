package W17;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5 extends JFrame
{
    public Q5()
    {
        setTitle("Login screen");
        setSize(400,300);
        
        JPanel panel = new JPanel();
        panel.setBounds(50,50,300,200);
        panel.setLayout(null);

        JTextField username = new JTextField();
        username.setBounds(120,100,150,30);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(150,150,100,30);
        loginBtn.setBackground(Color.GREEN);
        
        panel.add(username);
        panel.add(loginBtn);
        
        add(panel);
        
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->
        {
        Q5 window = new Q5();
        window.setVisible(true);
        }
        );
    }
}
