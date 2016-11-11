import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QueryPanel extends JPanel implements ActionListener {

    QueryPanel() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(300, 400));
        setBackground(new Color(255, 248, 238));
        String[] dummyText = { "Select Query Type", "Query 1", "Query 2", "Query 3" };

        JComboBox list = new JComboBox(dummyText);
        list.setSelectedIndex(0);
        list.addActionListener(this);
        list.setBorder(new EmptyBorder(0, 50, 0, 50));
        add(list, BorderLayout.CENTER);

        add(new JSeparator(SwingConstants.VERTICAL), BorderLayout.LINE_END);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Item Selected");
    }
}
