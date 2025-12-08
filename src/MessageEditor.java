import java.awt.*;
import javax.swing.*;
public class MessageEditor extends JFrame {
    public MessageEditor(){
        super("Message Editor");
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel label = new JLabel("Enter Message");
        JTextField textField = new JTextField(20);
        JButton subBtn = new JButton("Submit");

        topPanel.add(label);
        topPanel.add(textField);
        topPanel.add(subBtn);

        JPanel bottomPanel = new JPanel(new GridLayout(2, 2, 5, 5));

        bottomPanel.add(new JButton("Bold"));
        bottomPanel.add(new JButton("Italic"));
        bottomPanel.add(new JButton("Blue"));
        bottomPanel.add(new JButton("Reset"));

        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(bottomPanel, BorderLayout.SOUTH);

        setSize(400, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new MessageEditor();
    }
}
