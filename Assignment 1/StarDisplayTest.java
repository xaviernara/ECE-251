import java.util.Scanner;
public class StarDisplayTest {

    public static void main(String args[]) {
        int a;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a 5 digit integer : "  );
        a=scanner.nextInt();
        StarDisplay s = new StarDisplay( );
   //prompt the user to enter a 5-digit positive integer
   //and initialize the above variable a:
  		s.displayStar(a);
    }
 }