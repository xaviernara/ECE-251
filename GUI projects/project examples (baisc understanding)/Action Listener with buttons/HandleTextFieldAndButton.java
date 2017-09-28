import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class HandleTextFieldAndButton extends JFrame {
    JTextField valueField, squareField, rootField;

    public HandleTextFieldAndButton(String title) {
        super(title);

        setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));

        // Add the value text field, along with a label
        add(new JLabel("Value:"));
        valueField = new JTextField("10", 8);
        add(valueField);

        // Add the compute button
        JButton aButton = new JButton("Compute");
        add(aButton);

        // Add the square text field, along with a label
        add(new JLabel("Square:"));
        squareField = new JTextField("0", 16);
        add(squareField);

        // Add the square root text field, along with a label
        add(new JLabel("Square Root:"));
        rootField = new JTextField("0", 20);
        add(rootField);

        // Handle the button click
        aButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(valueField.getText());
                squareField.setText("" + value * value);
                rootField.setText("" + Math.sqrt(value));
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(250,180);
    }

    public static void main(String args[]) {
        HandleTextFieldAndButton frame = new HandleTextFieldAndButton("Working With TextFields");
        frame.setVisible(true);
    }
}

