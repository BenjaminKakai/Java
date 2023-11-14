import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Q04App extends JFrame {
    private JTextField studentIdField;
    private JButton submitButton;

    public Q04App() {
        setTitle("Q04 Application");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize components
        studentIdField = new JTextField(10);
        submitButton = new JButton("Submit");

        // Add components to the frame
        setLayout(new FlowLayout());
        add(new JLabel("Enter Student ID:"));
        add(studentIdField);
        add(submitButton);

        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitButtonClicked();
            }
        });
    }

    private void submitButtonClicked() {
        String studentId = studentIdField.getText().trim();

        // Validate student ID
        if (!studentId.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Invalid Student ID. Please enter a numeric ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Connect to the database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://srv572.hstgr.io/u912419555_3421a02", "u912419555_3421user", "A02@eecs3421");

            // Check if the student ID exists in the database
            String query = "SELECT * FROM 3421A02Data WHERE StudentID = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, Integer.parseInt(studentId));
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Student ID exists, update visit count
                int currentVisitCount = resultSet.getInt("VisitCount");
                int newVisitCount = currentVisitCount + 1;

                // Display message
                JOptionPane.showMessageDialog(this,
                        "Your earlier number of visits are: " + currentVisitCount,
                        "Visit Count",
                        JOptionPane.INFORMATION_MESSAGE);

                // Update visit count in the database
                String updateQuery = "UPDATE 3421A02Data SET VisitCount = ? WHERE StudentID = ?";
                PreparedStatement updateStatement = con.prepareStatement(updateQuery);
                updateStatement.setInt(1, newVisitCount);
                updateStatement.setInt(2, Integer.parseInt(studentId));
                updateStatement.executeUpdate();
            } else {
                // Student ID does not exist, insert new row
                String insertQuery = "INSERT INTO 3421A02Data (StudentID, VisitCount) VALUES (?, 1)";
                PreparedStatement insertStatement = con.prepareStatement(insertQuery);
                insertStatement.setInt(1, Integer.parseInt(studentId));
                insertStatement.executeUpdate();

                // Display message
                JOptionPane.showMessageDialog(this,
                        "Your earlier number of visits are: 0",
                        "Visit Count",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            // Close the database connection
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Q04App().setVisible(true);
            }
        });
    }
}
