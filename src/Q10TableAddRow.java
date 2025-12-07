import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
public class Q10TableAddRow extends JFrame {
    public Q10TableAddRow(){
        setTitle("JTable Add Row Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] columns = {"ID", "Name", "Marks"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JButton addRowBtn = new JButton("Add Row");

        addRowBtn.addActionListener(new ActionListener() {
            int counter = 1;

            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] row = {counter, "Student" + counter, 75 + counter};
                model.addRow(row);
                counter++;
            }
        });
        add(addRowBtn, BorderLayout.SOUTH);
        setVisible(true);
    }
    public static void main(String[] args){
        new Q10TableAddRow();
    }
}
