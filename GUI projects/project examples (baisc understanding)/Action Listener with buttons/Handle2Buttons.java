import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Handle2Buttons extends JFrame implements ActionListener {

    public Handle2Buttons(String title){

     super(title);


     JButton aButton1 = new JButton("Press Me");
     JButton aButton2 = new JButton("Don't Press Me");

     setLayout(new FlowLayout());
     add(aButton1);
     add(aButton2);

     // Indicate that this class will handle 2 button clicks
     // and that both buttons will go to the SAME event handler
     aButton1.addActionListener(this);
     aButton2.addActionListener(this);

     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setSize(250,100);
     	setBackground(Color.green);
 }

  // This is the event handler for the buttons
   public void actionPerformed(ActionEvent e) {
        // Ask the event which button was the source that generated it
        if (e.getActionCommand().equals("Press Me"))
            System.out.println("That felt good!");
        else
            System.out.println("Ouch! Stop that!");
    }



    public static void main(String args[]) {
        Handle2Buttons frame =  new Handle2Buttons("Handling 2 Button Presses");
        frame.setVisible(true);
    }
}

