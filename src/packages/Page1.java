package packages;

import javax.swing.*;
import java.awt.*;

public class Page1 {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        //making the font
        Font font = new Font("Estedad Black", Font.PLAIN, 16);

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(font);
        JTextField nameField = new JTextField(15);
        nameField.setMaximumSize(new Dimension(500 , 50));
        nameField.setAlignmentX(JTextField.CENTER);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("Age");
        ageLabel.setFont(font);
        JTextField ageField = new JTextField(15);
        ageField.setMaximumSize(new Dimension(500, 50));
        ageField.setAlignmentX(JTextField.CENTER);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setFont(font);
        JTextField emailField = new JTextField(15);
        emailField.setMaximumSize(new Dimension(500, 50));
        emailField.setAlignmentX(JTextField.CENTER);

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("Level of familiarity with similar software");
        levelLabel.setFont(font);

        JRadioButton level1 = new JRadioButton("Beginner");
        JRadioButton level2 = new JRadioButton("Intermediate");
        JRadioButton level3 = new JRadioButton("Advanced");
        JRadioButton level4 = new JRadioButton("No familiarity");

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("Next Page");
        nextButton.setBounds(10, 200, 100, 20);
        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            Page2 page2 = new Page2();
            page2.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(Box.createRigidArea(new Dimension(50, 50)));

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(levelLabel);
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(level4);

        panel.add(Box.createRigidArea(new Dimension(50, 50)));

        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
