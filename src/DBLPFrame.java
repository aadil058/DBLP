import javax.swing.*;
import java.awt.*;

public class DBLPFrame extends JFrame {

    private JLabel header;

    public void initialize() {
        setSize(800, 700);
        setLayout(new BorderLayout(20, 20));
        getContentPane().setBackground(new Color(255, 248, 238));
        header = new JLabel("DBLP Query Engine", JLabel.CENTER);
        header.setFont(new Font("Courier", Font.PLAIN, 50));
        add(header, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        DBLPFrame dblp = new DBLPFrame();
        dblp.initialize();
    }
}