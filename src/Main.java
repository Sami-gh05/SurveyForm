import javax.swing.*;
import packages.Page1;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("فرم نظرسنجی");
        frame.setSize(600, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);

        // Creating Font and Size
        Font font = new Font("Estedad Black", Font.BOLD, 40);
        // Create title label
        JLabel title = new JLabel("فرم نظرسنجی");
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setFont(font);

        // Create start button
        JButton startButton = new JButton("شروع!");
        startButton.setBounds(10, 40, 100, 20);
        startButton.setFont(font);
        startButton.setFocusable(false);
        startButton.setBackground(Color.YELLOW);

        // Add components to the panel
        panel.add(title, BorderLayout.NORTH);
        panel.add(startButton, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            Page1 page1 = new Page1();
            page1.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
