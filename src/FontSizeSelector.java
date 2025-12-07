import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class FontSizeSelector extends JFrame {
    public FontSizeSelector(){
        setTitle("Font Size Selector");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] sizes = {"10", "14", "18", "24"};
        JComboBox<String> sizeBox = new JComboBox<>(sizes);

        JTextField inputField = new JTextField("Type text here", 15);

        JButton applyBtn = new JButton("Apply");

        JLabel displayLabel = new JLabel("Preview Text");
        displayLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

        add(new JLabel("Font Sizes"));
        add(sizeBox);
        add(inputField);
        add(applyBtn);
        add(displayLabel);

        applyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int fontSize = Integer.parseInt((String) sizeBox.getSelectedItem());

                String text = inputField.getText();

                displayLabel.setText(text);
                displayLabel.setFont(new Font("SansSerif", Font.PLAIN, fontSize));
            }
        });
        setVisible(true);
    }
    public static void main(String[] args){
        new FontSizeSelector();
    }
}
