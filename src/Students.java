import javax.swing.*;
import java.awt.*;
public class Students extends JFrame {
    public Students(){
        super("Students Panel");
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);
        JButton addBtn = new JButton("Add");

        topPanel.add(nameLabel);
        topPanel.add(nameField);
        topPanel.add(addBtn);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        bottomPanel.add(new JButton("Clear"));
        bottomPanel.add(new JButton("Save"));
        bottomPanel.add(new JButton("Exit"));

        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Students();
    }
}
