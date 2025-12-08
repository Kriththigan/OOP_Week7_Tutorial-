import java.awt.*;
import javax.swing.*;
public class LayoutDemo extends JFrame {
    public LayoutDemo(){
        super("BorderLayout Demo");
        JLabel topPanel = new JLabel("Welcome", SwingConstants.CENTER);
        topPanel.setOpaque(true);
        topPanel.setBackground(Color.YELLOW);
        topPanel.setFont(new Font("SansSerif", Font.BOLD, 16));

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(3, 1, 5, 5));
        leftPanel.add(new JButton("Button 1"));
        leftPanel.add(new JButton("Button 2"));
        leftPanel.add(new JButton("Button 3"));

        JTextArea text = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(text);

        JLabel statusLabel = new JLabel("Ready", SwingConstants.SOUTH);
        statusLabel.setOpaque(true);
        statusLabel.setBackground(Color.DARK_GRAY);

        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(leftPanel, BorderLayout.WEST);
        add(text, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        setSize(500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new LayoutDemo();
    }
}
