/*
Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).
*/

package Swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ImageButtonExample extends JFrame {
	private JLabel messageLabel;

    public ImageButtonExample() {

        // Set up the frame
        setTitle("Button Image Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a label to display the message
        messageLabel = new JLabel("");
        add(messageLabel);

        // Load images for the buttons
        ImageIcon digitalClockIcon = new ImageIcon("Digitalclock.png"); // Replace with actual image path
        ImageIcon hourGlassIcon = new ImageIcon("Hourclock.png");       // Replace with actual image path

        // Create the Digital Clock button
        JButton digitalClockButton = new JButton(digitalClockIcon);
        digitalClockButton.setText("Digital Clock");
        digitalClockButton.setHorizontalTextPosition(SwingConstants.CENTER);
        digitalClockButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        digitalClockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });
        add(digitalClockButton);

        // Create the Hour Glass button
        JButton hourGlassButton = new JButton(hourGlassIcon);
        hourGlassButton.setText("Hour Glass");
        hourGlassButton.setHorizontalTextPosition(SwingConstants.CENTER);
        hourGlassButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        hourGlassButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });
        add(hourGlassButton);
    }

    public static void main(String[] args) {
        // Create the frame and make it visible
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ImageButtonExample frame = new ImageButtonExample();
                frame.setVisible(true);
            }
        });
    }


}
