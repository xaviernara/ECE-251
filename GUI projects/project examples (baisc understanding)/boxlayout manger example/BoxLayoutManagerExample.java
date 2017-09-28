import java.awt.*;

import javax.swing.*;
public class BoxLayoutManagerExample extends JFrame {

    public BoxLayoutManagerExample (String title) {
        super(title);

  //      setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));

        add(new JButton("one"));
        add(new JButton("two"));
        add(new JButton("three"));
        add(new JButton("four", new ImageIcon("banana.gif")));
        add(new JButton(new ImageIcon("happy.gif")));
        add(new PanelWithFourComponents());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 300);
    }

    public static void main(String args[]) {
        BoxLayoutManagerExample frame =  new BoxLayoutManagerExample("Box Layout Example");
        frame.setVisible(true);
    }
}
