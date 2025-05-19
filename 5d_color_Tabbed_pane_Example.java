/*
Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan
*/

package Swings;

import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane extends JFrame {

    public ColorTabbedPane() {
        setTitle("Color Tabbed Pane");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);
        tabbedPane.addTab("Cyan", cyanPanel);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);
        tabbedPane.addTab("Magenta", magentaPanel);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);
        tabbedPane.addTab("Yellow", yellowPanel);

        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ColorTabbedPane().setVisible(true);
        });
    }
}
