package CourseWork;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class SubscriptionGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SubscriptionGUI extends JFrame
{
    private JTextField modelName, pricingTokens, parameter, contextWindow, promptsQuota, teamMember, promptTxt, responseLength;
    private ArrayList<AIModel> aiModel = new ArrayList<>();
    
    public SubscriptionGUI()
    {
        setTitle("Subscription Management System");
        setSize(500, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10,10));
        
        JPanel formPanel = new JPanel(new GridLayout(4,2,8,8));
        formPanel.setBorder(BorderFactory.createTitledBorder("Enter Details"));
        
        formPanel.add(new JLabel("Model Name:"));
        modelName = new JTextField();
        formPanel.add(modelName);
        
        formPanel.add(new JLabel("Tokens:"));
        pricingTokens = new JTextField();
        formPanel.add(pricingTokens);
        
        formPanel.add(new JLabel("Parameter:"));
        parameter = new JTextField();
        formPanel.add(parameter);
        
        formPanel.add(new JLabel("Context window:"));
        contextWindow = new JTextField();
        formPanel.add(contextWindow);
        
        formPanel.add(new JLabel("Initial prompts quota:"));
        promptsQuota = new JTextField();
        formPanel.add(promptsQuota);
        
        formPanel.add(new JLabel("Initial team member slot:"));
        teamMember = new JTextField();
        formPanel.add(teamMember);
        
        formPanel.add(new JLabel("Prompt text:"));
        promptTxt = new JTextField();
        formPanel.add(promptTxt);
        
        formPanel.add(new JLabel("Response length:"));
        responseLength = new JTextField();
        formPanel.add(responseLength);
        
        add(formPanel, BorderLayout.NORTH);
        
        
        JPanel buttonPanel = new JPanel();

        JButton btnPersonal = new JButton("Add Personal Plan");
        JButton btnPro = new JButton("Add Pro Plan");
        JButton btnDisplay = new JButton("Display All");
        JButton btnClear = new JButton("Clear");
        JButton btnPrompt = new JButton("Give a Prompt");
        JButton btnMember = new JButton("Add Team Member");
        JButton btnPlan = new JButton("Check Plan Type");
        JButton btnExport = new JButton("Export to File");
        JButton btnLoad = new JButton("Load From File");

        buttonPanel.add(btnPersonal);
        buttonPanel.add(btnPro);
        buttonPanel.add(btnDisplay);
        buttonPanel.add(btnClear);
        buttonPanel.add(btnPrompt);
        buttonPanel.add(btnMember);
        buttonPanel.add(btnPlan);
        buttonPanel.add(btnExport);
        buttonPanel.add(btnLoad);
        
        add(buttonPanel, BorderLayout.CENTER);
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(()->
        {
            new SubscriptionGUI().setVisible(true);
        });
    }
}