import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Handle2Buttons2 extends JFrame {

	// Improvement 2
    /* We need to make the buttons instance variables and assign them
     in the constructor so that we can access these objects
    from within our event handler code.*/
    JButton   aButton1, aButton2;

    public Handle2Buttons2(String title){

     super(title);

     // Improvement 2
     aButton1 = new JButton("Press Me");
     aButton2 = new JButton("Don't Press Me");

     setLayout(new FlowLayout());
     add(aButton1);
     add(aButton2);


	// Improvement 2
    aButton1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.out.println("That felt good!");
        }
    });


    aButton2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Ouch! Stop that!");
        }
    });

     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setSize(250,100);
 }



    public static void main(String args[]) {
        Handle2Buttons2 frame =  new Handle2Buttons2("Handling 2 Button Presses");
        frame.setVisible(true);
    }
}

