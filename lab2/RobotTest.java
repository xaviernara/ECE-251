import java.util.Scanner;

public class RobotTest {
	public static void main(String args[]) {
	
		System.out.print("Enter a x coordinate: ");
		Scanner x1=new Scanner (System.in);
		int x=x1.nextInt();
		System.out.print("Enter a y coordinate: ");
		Scanner y1=new Scanner (System.in);
		int y=y1.nextInt();
		System.out.print("Enter a theta value between 0 and 360: ");
		Scanner theta1 =new Scanner (System.in);
		int theta=theta1.nextInt();
		Robot m = new Robot();
		m.computestuff(x,y,theta);
		
	}
}
