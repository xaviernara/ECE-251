import javax.swing.*;
public class SimplePanelTestFrame extends JFrame {

    public SimplePanelTestFrame(String title) {
    	super(title);  // Must be first line

    	add(new PanelWithFourComponents());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400);
	}

    public static void main(String args[]) {
		JFrame frame = new SimplePanelTestFrame("SimplePanel Example");
        frame.setVisible(true);
    }
}