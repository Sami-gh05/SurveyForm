package packages;

import javax.swing.*;
import java.awt.*;

public class Page3 {

    public void create(JFrame frame) {

        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBackground(Color.YELLOW);

        //making the font
        Font font = new Font("Estedad Black", Font.PLAIN, 30);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thanks for your participation");
        thankYouLabel.setFont(font);
        thankYouLabel.setHorizontalAlignment(JLabel.CENTER);

        // Add components to the panel
        panel.add(thankYouLabel, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);


    }


}
