import java.awt.*;
import javax.swing.*;
public class Q5CalculatorLayout extends JFrame{
    public Q5CalculatorLayout(){
        setTitle("3x3 Calculator Layout");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextField field = new JTextField();
        add(field, BorderLayout.NORTH);

        JPanel button = new JPanel();
        button.setLayout(new GridLayout(3,3,5,5));

        for(int i = 1; i <= 9; i++){
            button.add(new JButton(String.valueOf(i)));
        }
        add(button, BorderLayout.CENTER);
        setVisible(true);
    }
    public static void main(String[] args){
        new Q5CalculatorLayout();
    }
}
