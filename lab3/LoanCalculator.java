/*This class provides the service of calculating the payment
necessary to pay off a loan */
import java.lang.Math;
public class LoanCalculator {
public double monthlyPayment( double principle,double interestRate, int term)
{
	double A=principle;
	double r;
 	double num_1;
	int t=term;
	double Paymentmonthly;
	r = interestRate /(100 * term);
	num_1 = Math.pow((r + 1),term);
	Paymentmonthly = ( principle * r *num_1   / (num_1 - 1));
	return Paymentmonthly;
//missing code....
}
public void displaySchedule( double principle,double interestRate, int term)
{
	double payment;
	double amountRemaining = principle ;
	double r;
    int i;
    r = interestRate /(100 * term);
    i = 0;


    payment = monthlyPayment(principle,interestRate,term);
    System.out.printf("\nmonthly payment will be: $%4.2f \n" ,payment );
    System.out.printf("The loan is $%4.2f at an interest rate of %4.2f%%",payment, interestRate);
    System.out.printf("\nMonth Payment  Amount Remaining\n\n");

	while (i <12 )
	{
		amountRemaining = (	amountRemaining * r) + amountRemaining;
		amountRemaining -= payment;
		System.out.printf ("\n%d  $%4.2f %4.2f",i + 1,payment,amountRemaining);
		i += 1;
	}


}
//Math.pow(1st,its power);
}//end of class LoanCalculator

