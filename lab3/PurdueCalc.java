/*We will use the Java programming language to write a command line calculator. The program will ask
the user which operation he wants to perform, then it will prompt the user for a first operand, and what
is the second operand. It will then display the answer. The program will continue asking the user to use
the calculator until the user chooses the “Exit”. Note that in the case of a division, the program should
make sure that the user is not attempting to do a division by zero. If that is the case, it should display an
error message*/
import java.util.*;
public class PurdueCalc
{
public static void main(String[] args)
{
int count=0;

System.out.println("=======================================================");
System.out.println("Welcome to Purdue University Northwest's calculator!");
System.out.println("1 - Addition");
System.out.println("2 - Substraction");
System.out.println("3 - Multiplication");
System.out.println("4 - Division");
System.out.println("5 - Exit");

System.out.println("Which operation do you want to perform: ");
Scanner scanner= new Scanner(System.in);
int operation = scanner.nextInt();

//System.out.println("What is your first operand: ");
//int operand1 = scanner.nextInt();
//System.out.println("What is your second operand: ");
//int operand2 = scanner.nextInt();

while(operation !=5)
{
System.out.println("What is your first operand: ");
	int operand1 = scanner.nextInt();

	System.out.println("What is your second operand: ");
	int	operand2 = scanner.nextInt();

	if (operation == 1)
		System.out.println("The result is " + (operand1+operand2) );
	else if (operation == 2)
		System.out.println("The result is " + (operand1-operand2) );
	else if (operation == 3)
		System.out.println("The result is " + (operand1*operand2) );
	else if (operation == 4)
	{
//this if statement prints out a error if the user input is zero for operand 2 and the else after this if will run the operation if the second operand 2 isnt zero
			if (operand2==0)
				System.out.println("Division by zero is not allowed." );

//the else after this if will run the operation if the second operand 2 is anything excpet zero
				else
					System.out.println("The result is " + (operand1/operand2) );
	}
	else
		break;
	count++;

	System.out.println("Which operation do you want to perform: ");
	operation = scanner.nextInt();


}
System.out.println("Thanks for using Purdue University Northwest's calculator!");
System.out.println("=======================================================");

}
}


