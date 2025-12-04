import java.awt.*;
import javax.swing.*;
public class ComponentExample extends JFrame {
    public ComponentExample(){
        JFrame frame = new JFrame("Component Example");
        setLayout(new FlowLayout());

        JLabel lblAge = new JLabel("Enter Age:");
        JTextField JtfAge = new JTextField(20);
        JCheckBox JchkAge = new JCheckBox("Subscribe");

        add(lblAge);
        add(JtfAge);
        add(JchkAge);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new ComponentExample();
    }
}
