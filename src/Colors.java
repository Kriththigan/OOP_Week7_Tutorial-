import java.awt.*;
import javax.swing.*;
public class Colors extends JFrame {
    public Colors(){
        super("Color & Font Demo");
        JLabel messageLabel = new JLabel("Sample Text");
        Font customFont = new Font("Serif", Font.BOLD + Font.ITALIC, 18);
        messageLabel.setFont(customFont);

        JPanel buttonPanel = new JPanel(new FlowLayout());

        JButton redBtn = new JButton("Red");
        JButton greenBtn = new JButton("Green");
        JButton blueBtn = new JButton("Blue");

        buttonPanel.add(redBtn);
        buttonPanel.add(greenBtn);
        buttonPanel.add(blueBtn);

        setLayout(new FlowLayout());
        add(messageLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new Colors();
    }
}
