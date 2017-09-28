import java.awt.*;
import javax.swing.*;
public class GridLayoutManagerExample extends JFrame {

    public GridLayoutManagerExample(String title) {
        super(title);

        setLayout(new GridLayout(6,8,5,5));

        for (int row=1; row<=6; row++)
            for (int col=1; col<=8; col++) {
                JButton b = new JButton();
                if (Math.random() < 0.5)
                    b.setBackground(Color.black);
                else
                    b.setBackground(Color.green);
                add(b);
            }

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250, 200);
    }
    public static void main(String args[]) {
        GridLayoutManagerExample frame = new GridLayoutManagerExample("Grid Layout Example");
        frame.setVisible(true);
    }
}

