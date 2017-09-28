import javax.swing.JOptionPane;

public class apples {
    public static void main(String[] args) {
//JOptionPane.showInputDialog lets you write string you want displayed on the panel and store it into a variable
	        String fn =JOptionPane.showInputDialog("Enter 1st number");
	        String sn =JOptionPane.showInputDialog("Enter 2nd number");

//Integer.parseInt converts a string to a int
	        int num1= Integer.parseInt(fn);
	        int num2= Integer.parseInt(sn);
	        int sum= num1+num2;
	        int anti_sum= num1-num2;
	        int div_sum= num1/num2;
	        int multi_sum=num1*num2;

//null means the position of the panel will be inthe middle of the screen
//JOptionPane.PLAIN_MESSAGE means that there will be no icons on the panel and it'll be just A plain screen

//JOptionPane.showMessageDialog creates a panel with the string you want displayed from JOptionPane.showInputDialog
			JOptionPane.showMessageDialog(null, "the division answer is " +div_sum, "Division Calculator", JOptionPane.ERROR_MESSAGE);
	        JOptionPane.showMessageDialog(null, "the multiplication answer is " +multi_sum, "Multiplication Calculator", JOptionPane.PLAIN_MESSAGE);

	        JOptionPane.showMessageDialog(null, "the addition answer is " +sum, "Addition Calculator", JOptionPane.WARNING_MESSAGE);
	        JOptionPane.showMessageDialog(null, "the subtraction answer is " +anti_sum, "Subtraction Calculator", JOptionPane.QUESTION_MESSAGE);
    }
}
