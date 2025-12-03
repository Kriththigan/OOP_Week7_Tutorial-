import java.awt.FlowLayout;
import javax.swing.*;
public class ShowFlowLayout extends JFrame{
    public ShowFlowLayout(){
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        add(new JLabel("First Name"));
        add(new JTextField(8));
        add(new JLabel("Middle Name"));
        add(new JTextField(1));
        add(new JLabel("Last Name"));
        add(new JTextField(8));
    }
    public static void main(String[] args){
        ShowFlowLayout frame = new ShowFlowLayout();
        frame.setTitle("ShowFlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 300);
        frame.setVisible(true);
    }
}
