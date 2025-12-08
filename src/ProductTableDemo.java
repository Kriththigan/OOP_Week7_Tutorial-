import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class ProductTableDemo extends JFrame{
    public ProductTableDemo(){
        super("Product Table");
        String[] columns = {"Product", "Price", "Quantity"};
        Object[][] data =  {
                {"Pen", "50", "10"},
                {"Book", "200", "5"},
                {"Bag", "1500", "2"}
        };
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        setLayout(new FlowLayout());
        add(scrollPane, FlowLayout.CENTER);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new ProductTableDemo();
    }
}
