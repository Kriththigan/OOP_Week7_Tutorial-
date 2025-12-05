import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3FontUpdater extends JFrame {

    private JTextField textField;
    private JCheckBox boldCheckBox;
    private JButton updateButton;

    public Q3FontUpdater() {


        setTitle("Font Updater");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());


        textField = new JTextField("Type something here", 20);
        boldCheckBox = new JCheckBox("Bold");
        updateButton = new JButton("Update Font");


        add(textField);
        add(boldCheckBox);
        add(updateButton);


        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (boldCheckBox.isSelected()) {
                    textField.setFont(new Font("SansSerif", Font.BOLD, 16));
                }
                else {
                    textField.setFont(new Font("SansSerif", Font.PLAIN, 16));
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q3FontUpdater();
    }
}
