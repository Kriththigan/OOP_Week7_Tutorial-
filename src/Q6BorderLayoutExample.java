import java.awt.*;
import javax.swing.*;
public class Q6BorderLayoutExample extends JFrame {
    public Q6BorderLayoutExample(){
        setTitle("BorderLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JButton northBtn = new JButton("NORTH");
        JButton southBtn = new JButton("SOUTH");
        JButton eastBtn = new JButton("EAST");
        JButton westBtn = new JButton("WEST");

        JTextArea textArea = new JTextArea("Center TextAre");

        add(northBtn, BorderLayout.NORTH);
        add(southBtn, BorderLayout.SOUTH);
        add(eastBtn, BorderLayout.EAST);
        add(westBtn, BorderLayout.WEST);
        add(textArea, BorderLayout.CENTER);

        setVisible(true);
    }
    public static void main(String[] args){
        new Q6BorderLayoutExample();
    }
}
