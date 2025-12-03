import javax.swing.*;
public class SwingExample{
    public static void main(String[] args){

        JFrame frame = new JFrame("Swing Components Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton jbtOK = new JButton("OK");
        JLabel jlblName = new JLabel ("Enter your name:");
        JTextField jtfName = new JTextField("Type Name Here", 15);
        JCheckBox jchkBold = new JCheckBox("Bold");
        JRadioButton jrbRed = new JRadioButton("Red");
        JComboBox<String> jcboColor = new JComboBox<>(
                new String[]{"Red", "Green", "Blue"}
        );
        panel.add(jlblName);
        panel.add(jtfName);
        panel.add(jbtOK);
        panel.add(jchkBold);
        panel.add(jrbRed);
        panel.add(jcboColor);

        frame.add(panel);
        frame.setVisible(true);
    }
}