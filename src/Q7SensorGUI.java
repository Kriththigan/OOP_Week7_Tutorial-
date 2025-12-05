import javax.swing.*;
import java.awt.*;
public class Q7SensorGUI extends JFrame {
    public Q7SensorGUI(){
        setTitle("Sensor Monitoring GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        JButton startBtn = new JButton("Start");
        JButton stopBtn = new JButton("Stop");
        JButton resetBtn = new JButton("Reset");

        topPanel.add(startBtn);
        topPanel.add(stopBtn);
        topPanel.add(resetBtn);

        add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new GridLayout(2,2,10,10));

        JLabel sensor1 = new JLabel("Sensor 1: 0");
        JLabel sensor2 = new JLabel("Sensor 2: 0");
        JLabel sensor3 = new JLabel("Sensor 3: 0");
        JLabel sensor4 = new JLabel("Sensor 4: 0");

        sensor1.setHorizontalAlignment(SwingConstants.CENTER);
        sensor2.setHorizontalAlignment(SwingConstants.CENTER);
        sensor3.setHorizontalAlignment(SwingConstants.CENTER);
        sensor4.setHorizontalAlignment(SwingConstants.CENTER);

        centerPanel.add(sensor1);
        centerPanel.add(sensor2);
        centerPanel.add(sensor3);
        centerPanel.add(sensor4);

        JPanel bottomPanel  = new JPanel(new FlowLayout());
        JLabel statusLabel  = new JLabel("Status: Waiting for user action...");
        bottomPanel.add(statusLabel);

        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
    public static void main(String[] args){
        new Q7SensorGUI();
    }
}
