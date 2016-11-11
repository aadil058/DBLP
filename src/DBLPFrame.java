import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class DBLPFrame extends JFrame {

    private JLabel header;
    private QueryPanel queryPanel;
    private ResultTable resultTable;

    public void initialize() {
        setSize(800, 700);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(255, 248, 238));

        JPanel HeaderPanel = new JPanel(new BorderLayout(20, 20));
        header = new JLabel("DBLP Query Engine", JLabel.CENTER);
        header.setFont(new Font("Courier", Font.PLAIN, 50));
        HeaderPanel.add(header);
        HeaderPanel.add(new JSeparator(), BorderLayout.PAGE_END);
        HeaderPanel.setBackground(new Color(255, 248, 238));
        add(HeaderPanel, BorderLayout.NORTH);

        queryPanel = new QueryPanel();
        add(queryPanel, BorderLayout.WEST);

        // resultTable = new ResultTable();

        display();
    }

    public void display() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        DBLPFrame dblp = new DBLPFrame();
        dblp.initialize();
    }
}