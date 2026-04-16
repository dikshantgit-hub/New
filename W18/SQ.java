package W18;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SQ extends JFrame {

    JTextField taskField;
    JPanel taskPanel;

    public SQ() {
        setTitle("My ToDo Manager");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("My ToDo Manager");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titlePanel.add(titleLabel);

        JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
        sidePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        String[] buttons = {"All Task", "Completed", "Pending", "Important"};

        for (String button : buttons) {
            JButton btn = new JButton(button);
            btn.setMaximumSize(new Dimension(150, 40));
            sidePanel.add(btn);
            sidePanel.add(Box.createVerticalStrut(10));
        }

        JPanel top = new JPanel();
        taskField = new JTextField(15);
        JButton addBtn = new JButton("Add Task");
        JButton doneBtn = new JButton("Done");

        top.add(new JLabel("Task:"));
        top.add(taskField);
        top.add(addBtn);
        top.add(doneBtn);

        JPanel northPanel = new JPanel();
        northPanel.setLayout(new BorderLayout());

        northPanel.add(titlePanel, BorderLayout.NORTH);
        northPanel.add(top, BorderLayout.SOUTH);

        taskPanel = new JPanel();
        taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS));

        JScrollPane scroll = new JScrollPane(taskPanel);

        add(northPanel, BorderLayout.NORTH);
        add(sidePanel, BorderLayout.WEST);
        add(scroll, BorderLayout.CENTER);

        addBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText();

                if (task.isEmpty()) {
                    JOptionPane.showMessageDialog(SQ.this, "Enter a task!");
                } else {
                    addTask(task);
                    taskField.setText("");
                }
            }
        });
    }

    void addTask(String task) {
        JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JCheckBox check = new JCheckBox();
        JLabel label = new JLabel(task);
        JButton del = new JButton("Delete");

        del.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                taskPanel.remove(row);
                taskPanel.revalidate();
                taskPanel.repaint();
            }
        });

        
        check.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (check.isSelected()) {
                    label.setText(task);
                } else {
                    label.setText(task);
                }
            }
        });
        
        doneBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        label.setText("<html><strike>" + task + "</strike></html>");
        }
        });

        row.add(check);
        row.add(label);
        row.add(del);

        taskPanel.add(row);
        taskPanel.revalidate();
        taskPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SQ().setVisible(true);
        });
    }
}