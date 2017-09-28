import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutExample extends JFrame{

	private JButton left_button;
	private JButton center_button;
	private JButton right_button;

	private FlowLayout layout;
	private Container container;


    public FlowLayoutExample() {
    	super ("Button Manipulator");
    	//layout = new FlowLayout(); means we want our layout to go from when we put things there like buttons we
    	//we want them to be arranged from left to right
    	layout = new FlowLayout();
    	//this is used so that the flowlayout will know where to put the buttons
    	container=getContentPane();
    	setLayout(layout);

    	//left button manipulation in here

    	//left_button= new JButton("Left"); wrties text on button
    	left_button= new JButton("Left");
    	//	add(left_button); adds the button to the screen
    	add(left_button);
    	//all this below basically is saying what you want to happen when the left button is clicked
    	left_button.addActionListener(
    			new ActionListener(){
    				public void actionPerformed(ActionEvent event){
    					//layout.setAlignment(FlowLayout.LEFT); changes the layout when the left button is clicked
    					layout.setAlignment(FlowLayout.LEFT);
    					//layout.layoutContainer(container); resets the container when the left button is clicked (i.e moves it to the left)
    					layout.layoutContainer(container);
    				}
    			}
    			);


    	//center button manipulation in here

    	//center_button= new JButton("Center"); wrties text on button
    	center_button= new JButton("center");
    	//	add(left_button); adds the button to the screen
    	add(center_button);
    	//all this below basically is saying what you want to happen when the center button is clicked
    	center_button.addActionListener(
    			new ActionListener(){
    					//layout.setAlignment(FlowLayout.LEFT); changes the layout when the center button is clicked
    				public void actionPerformed(ActionEvent event){
    					//layout.setAlignment(FlowLayout.LEFT); changes the layout when the center button is clicked
    					layout.setAlignment(FlowLayout.CENTER);
    					//layout.layoutContainer(container); resets the container when the center button is clicked (i.e moves it to the left)
    					layout.layoutContainer(container);
    				}
    			}
    			);


    	//RIGHT button manipulation in here
    	//just look above for the functionatality
    	right_button= new JButton("right");
    	add(right_button);
    	right_button.addActionListener(
    			new ActionListener(){
    				public void actionPerformed(ActionEvent event){
    					layout.setAlignment(FlowLayout.RIGHT);
    					layout.layoutContainer(container);
    				}
    			}
    			);



    }


}