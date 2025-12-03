import javax.swing.*;
public class TestOut {
    public static void main(String[] args){
        JFrame frame = new JFrame("My frame with components");
        JButton jbtOk = new JButton("OK");
        frame.add(jbtOk);

        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
