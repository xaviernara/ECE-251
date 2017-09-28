import java.util.*;
public class ChocolateBarsTest {
   public static void main(String[] args){

        // displays the following menu using t5he JAVA System.out method
        System.out.println("1. Oh Henry $0.65");
		System.out.println("2. Coffee Crisp $0.80");
		System.out.println("3. Aero $0.60");
		System.out.println("4. Smarties $0.70 ");
		System.out.println("5. Crunchie $0.75 ");

		//Using the JAVA System.out method to ask the user which type of chocolate they want and how many boxes

        System.out.println("How many boxes of type(1)would you like(48 bars per box): ");
   		Scanner scanner = new Scanner(System.in);
		int Henry = scanner.nextInt();

		//remember that once you declare scanner using soming like  "int Henry = scanner.nextInt();" you dont have to redo it after every new variable

		System.out.println("How many boxes of type(2)would you like(48 bars per box): ");
		int Coffee = scanner.nextInt();

		System.out.println("How many boxes of type(3)would you like(48 bars per box): ");
		int Aero = scanner.nextInt();

		System.out.println("How many boxes of type(4)would you like(48 bars per box): ");
		int Smarties = scanner.nextInt();

		System.out.println("How many boxes of type(5)would you like(48 bars per box): ");
		int Crunchie = scanner.nextInt();

		//passing the user inputs to the chocolateOrders function in ChocolateBars.java file
		//ChocolateBars is the class and m is the object and new ChocolateBars()
		ChocolateBars m= new ChocolateBars();
		m.chocolateOrders(Henry,Coffee,Aero,Smarties,Crunchie);
    }
}