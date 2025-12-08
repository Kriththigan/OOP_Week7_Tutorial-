import javax.swing.*;
import java.awt.*;
public class calculatorFrame extends JFrame {
    private JTextField displayField;
    public calculatorFrame(){
        super("My Calculator");

        JPanel topPanel = new JPanel();
        displayField = new JTextField(25);
        displayField.setEditable(false);
        topPanel.add(displayField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));
        String[] btnName = {
                "1", "2", "3", "+",
                "4", "5", "6", "-",
                "7", "8", "9", "Clear",
                "0", "."
        };
        for (String name: btnName){
            buttonPanel.add(new JButton(name));
        }
        setLayout(new BorderLayout());
        add(topPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
    }
    public static void main(String[] args){
        calculatorFrame myCalculator = new calculatorFrame();
        myCalculator.setVisible(true);
        myCalculator.setSize(600, 300);
        myCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
