import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class StudentFormApp extends JFrame {

    private JTextField nameField, marksField;
    private JTable table;
    private DefaultTableModel model;
    private JLabel statsLabel;

    public StudentFormApp() {


        setTitle("Student Form");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        JPanel topPanel = new JPanel(new FlowLayout());

        nameField = new JTextField(10);
        marksField = new JTextField(5);
        JButton addButton = new JButton("Add Student");

        topPanel.add(new JLabel("Name:"));
        topPanel.add(nameField);

        topPanel.add(new JLabel("Marks:"));
        topPanel.add(marksField);

        topPanel.add(addButton);

        add(topPanel, BorderLayout.NORTH);


        String[] columns = {"Name", "Marks"};
        model = new DefaultTableModel(columns, 0);

        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);


        JPanel bottomPanel = new JPanel(new FlowLayout());
        statsLabel = new JLabel("Total Students: 0 | Average Marks: 0.00");

        bottomPanel.add(statsLabel);

        add(bottomPanel, BorderLayout.SOUTH);


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = nameField.getText().trim();
                String marksText = marksField.getText().trim();


                if (name.isEmpty() || marksText.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Please enter both name and marks.");
                    return;
                }

                int marks;
                try {
                    marks = Integer.parseInt(marksText);
                }
                catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Marks must be a number.");
                    return;
                }


                model.addRow(new Object[] {name, marks});


                updateStats();


                nameField.setText("");
                marksField.setText("");
            }
        });

        setVisible(true);
    }
    private void updateStats() {

        int rowCount = model.getRowCount();

        if (rowCount == 0) {
            statsLabel.setText("Total Students: 0 | Average Marks: 0.00");
            return;
        }

        int sum = 0;

        for (int i = 0; i < rowCount; i++) {
            sum += Integer.parseInt(model.getValueAt(i, 1).toString());
        }

        double avg = (double) sum / rowCount;

        statsLabel.setText("Total Students: " + rowCount
                + " | Average Marks: " + String.format("%.2f", avg));
    }

    public static void main(String[] args) {
        new StudentFormApp();
    }
}
