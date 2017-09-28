/* This class runs the application and interacts with the user.
It prompt the user for input and displays results back to them on the
console window */
import java.util.*;
public class LoanApplication{
public static void main(String[] args){
//define the variables that will be used and their type
//for reading from the keyboard
Scanner scanner;
GregorianCalendar today;
double principle; //amount of the loan
int term;//length of loan in months
double annualInterestRate;//loan interest rate

//create a Date object representing today's date
today = new GregorianCalendar();

//create scanner for reading user input from keyboard
scanner = new Scanner(System.in);

//create the LoanCalculator object
LoanCalculator calculator = new LoanCalculator();

//set scanner to read a whole line at a time
//String lineSeparator = System.getProperty("line.separator");
//scanner.useDelimiter(lineSeparator);

//print greeting...missing code
//collect user input ...missing code, use today.getTime()

System.out.println("Welcome to the Purdue University Northwest Loan Calculator");
System.out.println("today is: " + today.getTime());
System.out.println("=======================================");
System.out.println("\n\n");

System.out.print("Enter the amount of the loan (e.g. 5000.00): ");
principle = scanner.nextDouble();
//System.out.printf("The value of principle : %4.2f",principle);
System.out.print("Enter the annual interest rate: (e.g. 7.0): ");
annualInterestRate=scanner.nextDouble();
//System.out.printf("The value of principle : %4.2f",annualInterestRate);
System.out.print("Enter the term in months: (e.g. 60): ");
term=scanner.nextInt();

LoanCalculator m= new LoanCalculator();
m.monthlyPayment(principle,annualInterestRate,term);
m.displaySchedule(principle,annualInterestRate,term);



//to display the time.
//compute monthly payment ...missing code
//display repayment schedule...missing code
} //end class LoanApplication
}