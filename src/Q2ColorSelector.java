import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2ColorSelector extends JFrame {

    private JRadioButton redBtn, greenBtn, blueBtn;
    private JButton applyBtn;

    public Q2ColorSelector() {


        setTitle("Color Selector");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        JLabel label = new JLabel("Select your color");


        redBtn = new JRadioButton("Red");
        greenBtn = new JRadioButton("Green");
        blueBtn = new JRadioButton("Blue");


        ButtonGroup group = new ButtonGroup();
        group.add(redBtn);
        group.add(greenBtn);
        group.add(blueBtn);


        applyBtn = new JButton("Apply");


        add(label);
        add(redBtn);
        add(greenBtn);
        add(blueBtn);
        add(applyBtn);


        applyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (redBtn.isSelected()) {
                    getContentPane().setBackground(Color.RED);
                }
                else if (greenBtn.isSelected()) {
                    getContentPane().setBackground(Color.GREEN);
                }
                else if (blueBtn.isSelected()) {
                    getContentPane().setBackground(Color.BLUE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q2ColorSelector();
    }
}
