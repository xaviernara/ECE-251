import java.awt.*;
import javax.swing.JFrame; //gives you access to the scroll bar, close out (x), minimize, maximize just the basic window
import javax.swing.JLabel; //



public class tuna extends JFrame {
	private JLabel item1;


    public tuna() {
    	super("The title bar"); //how you add a title to your layout
    	setLayout(new FlowLayout());

    	item1 = new JLabel("this is a sentence"); //JLabeli is how you put text on a screen and what you past to it is what will be displayed on the screen
    	item1.setToolTipText("This is gonna show up on hover");
    	add(item1); //add() will add the item to the window

    }


    public static void main(String[] args) {

    }
}
