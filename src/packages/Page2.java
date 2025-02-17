package packages;

import javax.swing.*;
import java.awt.*;

public class Page2 {

    public void create(JFrame frame) {
        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        //making the font
        Font font = new Font("Estedad Black", Font.PLAIN, 10);

        // Question 1
            JLabel question1 = new JLabel("How interesting you find the GUI?");
            question1.setFont(font);

            JRadioButton radio1_1 = new JRadioButton("1 (not interesting at all)");
            radio1_1.setFont(font);
            JRadioButton radio1_2 = new JRadioButton("2 (a little interesting)");
            radio1_2.setFont(font);
            JRadioButton radio1_3 = new JRadioButton("3 (normal)");
            radio1_3.setFont(font);
            JRadioButton radio1_4 = new JRadioButton("4 (interesting)");
            radio1_4.setFont(font);
            JRadioButton radio1_5 = new JRadioButton("5 (very interesting)");
            radio1_5.setFont(font);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio1_1);
        group1.add(radio1_2);
        group1.add(radio1_3);
        group1.add(radio1_4);
        group1.add(radio1_5);

        // Question 2
            JLabel question2 = new JLabel("Can you access different features of the app easily?");
            question2.setFont(font);

            JRadioButton radio2_1 = new JRadioButton("Yes");
            radio2_1.setFont(font);
            JRadioButton radio2_2 = new JRadioButton("No");
            radio2_2.setFont(font);
            JRadioButton radio2_3 = new JRadioButton("particularly");
            radio2_3.setFont(font);


        ButtonGroup group2 = new ButtonGroup();
        group2.add(radio2_1);
        group2.add(radio2_2);
        group2.add(radio2_3);

        // Question 3
            JLabel question3 = new JLabel("how simple and user-friendly the designing is?");
            question3.setFont(font);

            JRadioButton radio3_1 = new JRadioButton("1 (very complex)");
            radio3_1.setFont(font);
            JRadioButton radio3_2 = new JRadioButton("2 (complex)");
            radio3_2.setFont(font);
            JRadioButton radio3_3 = new JRadioButton("3 (normal)");
            radio3_3.setFont(font);
            JRadioButton radio3_4 = new JRadioButton("4 (simple)");
            radio3_4.setFont(font);
            JRadioButton radio3_5 = new JRadioButton("5 (very user-friendly)");
            radio3_5.setFont(font);


        ButtonGroup group3 = new ButtonGroup();
        group3.add(radio3_1);
        group3.add(radio3_2);
        group3.add(radio3_3);
        group3.add(radio3_4);
        group3.add(radio3_5);

        // Question 4
            JLabel question4 = new JLabel("Are the colors and fonts of the app appropriate?");
            question4.setFont(font);

            JRadioButton radio4_1 = new JRadioButton("Yes");
            radio4_1.setFont(font);
            JRadioButton radio4_2 = new JRadioButton("No");
            radio4_2.setFont(font);
            JRadioButton radio4_3 = new JRadioButton("Should be changed");
            radio4_3.setFont(font);


        ButtonGroup group4 = new ButtonGroup();
        group4.add(radio4_1);
        group4.add(radio4_2);
        group4.add(radio4_3);

        // Next button to go to Page3
            JButton nextButton = new JButton("Next page");
            nextButton.setFocusable(false);
            nextButton.setFont(font);

        nextButton.addActionListener(e -> {
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            Page3 page3 = new Page3();
            page3.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(Box.createRigidArea(new Dimension(50, 10)));

        panel.add(question1);
        panel.add(radio1_1);
        panel.add(radio1_2);
        panel.add(radio1_3);
        panel.add(radio1_4);
        panel.add(radio1_5);

        panel.add(question2);
        panel.add(radio2_1);
        panel.add(radio2_2);
        panel.add(radio2_3);

        panel.add(question3);
        panel.add(radio3_1);
        panel.add(radio3_2);
        panel.add(radio3_3);
        panel.add(radio3_4);
        panel.add(radio3_5);

        panel.add(question4);
        panel.add(radio4_1);
        panel.add(radio4_2);
        panel.add(radio4_3);

        panel.add(Box.createRigidArea(new Dimension(50, 20)));


        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
