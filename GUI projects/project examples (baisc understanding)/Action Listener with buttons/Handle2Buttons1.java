import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Handle2Buttons1 extends JFrame implements ActionListener {

	// Improvement 1
    /* We need to make the buttons instance variables and assign them
     in the constructor so that we can access these objects
    from within our event handler code.*/
    JButton   aButton1, aButton2;

    public Handle2Buttons1(String title){

     super(title);

     // Improvement 1
     aButton1 = new JButton("Press Me");
     aButton2 = new JButton("Don't Press Me");

     setLayout(new FlowLayout());
     add(aButton1);
     add(aButton2);

     // Indicate that this class will handle 2 button clicks
     // and that both buttons will go to the SAME event handler
     aButton1.addActionListener(this);
     aButton2.addActionListener(this);

     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setSize(250,100);
 }


  	// Improvement 1
    // Change the event handler to use getSource() to compare the actual objects
    public void actionPerformed(ActionEvent e) {
        // Ask the event which button was the source that generated the event
        if (e.getSource() == aButton1)
            System.out.println("That felt good!");
        else
            System.out.println("Ouch! Stop that!");
      /*
            switch((JButton)e.getSource()){

            case aButton1: System.out.println("That felt good!");
            break;
            case aButton2:System.out.println("Ouch! Stop that!");
            }*/
    }



    public static void main(String args[]) {
        Handle2Buttons1 frame =  new Handle2Buttons1("Handling 2 Button Presses");
        frame.setVisible(true);
    }
}

