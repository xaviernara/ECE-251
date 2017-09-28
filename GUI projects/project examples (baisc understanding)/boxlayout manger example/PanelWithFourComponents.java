import javax.swing.*;
import java.awt.*; //needed to use components setting methods (e.g., colors, fonts)

public class PanelWithFourComponents extends JPanel {

	public PanelWithFourComponents() {
    	// Create and add a simple JLabel to the panel
        JLabel plainLabel = new JLabel("Plain Small Label");
        add(plainLabel);

        // Create a 2nd JLabel with a 32pt bold italic Serif font
        // and a "brain.gif" picture to the left of the text.
        // Make the label have a red background and white text.
        JLabel fancyLabel = new JLabel("Fancy Big Label");
        fancyLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 32));
        fancyLabel.setIcon(new ImageIcon("banana.gif"));
        fancyLabel.setHorizontalAlignment(JLabel.RIGHT);
     //   fancyLabel.setBackground(Color.blue);
       fancyLabel.setBackground(new Color(1.0f,1.0f,0.0f));
        fancyLabel.setOpaque(true);
        fancyLabel.setForeground(Color.red);
        add(fancyLabel); // Add to this panel

        // Create a JButton
        JButton button1 = new JButton("Button");
        button1.setBackground(Color.blue);
        button1.setForeground(Color.yellow);
   //     button1.setIcon(new ImageIcon("theIncredibles.jpg"));
    button1.setIcon(new ImageIcon("hurt.gif"));
        add(button1);

        // Create a 2nd JButton, this one with an icon
        JButton button2 = new JButton("Brain", new ImageIcon("brain.gif"));
        button2.setBackground(SystemColor.control);
        add(button2);

		// Set the background color of the panel
	//	setBackground(Color.orange);
	setBackground(Color.orange);
	}
}