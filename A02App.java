import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class A02App {
    private JTextField studentIDTextField;
    private JButton submitButton;
    private JPanel mainPanel;

    public A02App() {
        // Initialize components
        studentIDTextField = new JTextField(20);
        submitButton = new JButton("Submit");
        mainPanel = new JPanel();

        // Add components to the main panel
        mainPanel.add(new JLabel("Student ID:"));
        mainPanel.add(studentIDTextField);
        mainPanel.add(submitButton);

        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSubmission();
            }
        });
    }

    private void handleSubmission() {
        // Your existing handleSubmission() code
    }

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("A02App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an instance of A02App
        A02App app = new A02App();

        // Set layout and add mainPanel to the frame
        frame.setLayout(new FlowLayout());
        frame.add(app.mainPanel);

        // Pack and make the frame visible
        frame.pack();
        frame.setVisible(true);
    }
}
