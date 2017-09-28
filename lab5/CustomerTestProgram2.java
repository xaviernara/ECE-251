import java.util.*;
	public class CustomerTestProgram2 {
		public static void main(String args[]) {
	Customer2 c1 = new Customer2("Bob",17,'M');
	Customer2 c2 = new Customer2("Dottie",3,'F',10,true);
	Customer2 c3 = new Customer2("Jane");
	Customer2 c4 = new Customer2();

	System.out.println("Bob looks like this: " + c1);
	System.out.println("Dottie looks like this: " + c2);
	System.out.println("Jane looks like this: " + c3);
	System.out.println("Customer 4 looks like this: " + c4);
	}
}