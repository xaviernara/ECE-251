/*
Class: ECE25100 Object Oriented Programming
Instructor: Xiaoli Yang
Author: [Xavier Richardson]
Assignment: [No.1]
File Name:ChocolateBars.java
Date: [01]/[12]/[17]
*/

public class ChocolateBars
{


public void chocolateOrders ( int candyType1 , int candyType2 , int candyType3, int candyType4, int candyType5  )
{
	double order1=candyType1*48*.65;
	double order2=candyType2*48*.80;
	double order3=candyType3*48*.60;
	double order4=candyType4*48*.70;
	double order5=candyType5*48*.60;
	double subTotal=(order1 + order2 + order3+ order4 + order5);
	double tax=(order1+order2+order3+ order4+order5) *0.07;
	double amount= tax + subTotal;

		System.out.println ( candyType1 + "boxes of Oh Henry ($0.65 x 48) = $ " + order1 );

		System.out.println ( candyType2 + "boxes of Coffee Crisp ($0.80 x 48) = $ " + order2);

		System.out.println ( candyType3 + "boxes of Aero ($0.60 x 48) = $" + order3);

		System.out.println ( candyType4 + "boxes of Smarties ($0.70 x 48) = $" + order4);

		System.out.println ( candyType5 + "boxes of Crunchie ($0.75 x 48) = $" + order5);

		System.out.println ("----------------------------------------------");
		System.out.println ("Sub Total = $ " + subTotal);
		System.out.println ("Tax = " + tax);
		System.out.println ("==============================================");
		System.out.println ("Amount Due = $ " + amount );
}
}

