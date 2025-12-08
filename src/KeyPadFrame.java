import javax.swing.*;
import java.awt.*;
public class KeyPadFrame extends JFrame {
    public KeyPadFrame(){
        super("Keypad");
        JPanel keypadPanel = new JPanel();
        keypadPanel.setLayout(new GridLayout(4, 3, 5, 5));
        String[] keys = {
                "1", "2", "3",
                "4", "5", "6",
                "7", "8", "9",
                "*", "0", "#"
        };
        for(String key: keys){
            keypadPanel.add(new JButton(key));
        }
        add(keypadPanel);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new KeyPadFrame();
    }
}
