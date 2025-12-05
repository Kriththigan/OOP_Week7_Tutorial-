import java.awt.*;
import javax.swing.*;
public class Q1GUI {
    public static void main(String[] args){
        JFrame frame = new JFrame("Q1 - Enter Name");
        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter Name:");
        JTextField textField = new JTextField(20);
        JButton submitButton = new JButton("Submit");

        frame.add(label);
        frame.add(textField);
        frame.add(submitButton);

        frame.setVisible(true);
    }
}
