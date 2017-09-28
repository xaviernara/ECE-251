import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x=1;

        do{
        	try{
			System.out.println("Enter first number: ");
	        	int number1=input.nextInt();
	        System.out.println("Enter second number: ");
		        int number2=input.nextInt();
		        int sum=number1/number2;
	        System.out.println("This the sum: "+sum);
	        x=2;
			}
			catch(Exception e){
			System.out.println("You cant do that");

			}
        }
		while (x==1);

    }
}
