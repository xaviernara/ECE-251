/*
Class: ECE25100 Object Oriented Programming
Instructor: Xiaoli Yang
Author: [Xavier Richardson]
Assignment: [2]
File Name:FairTester
Date: [03]/[2]/[17]
*/

public class FairTester{
    public static void doTestCase1(){
    Ride millennium = new Ride("Millennium", 6, 4.25f);
	Ride mcCormick = new Ride("McCormick Place", 5, 3.1f);
	Ride kensington = new Ride("Kensington", 4, 2.0f);
	Ride homewood = new Ride("Homewood", 2, 0);
	Ride roosevelt = new Ride("Roosevelt Rd.", 7, 4.9f);

    //Make a place where tickets are sold, specifiying the
	//number of available passes
	TicketBooth booth1 = new TicketBooth(4);
	// Make some people by specifying their height and their
	//money amounts
	Person billy = new Person(4.9f, 10.00f);
	Person donna = new Person(3.0f, 5.00f);
	Person fredy = new Person(6.0f, 0.00f);
	Person harry = new Person(4.8f, 78.50f);
	Person jenny = new Person(2.0f, 1.00f);
	Person larry = new Person(4.0f, 50.00f);
	System.out.println("Billy is a " + billy);


	if (billy.buyTickets(20, booth1))
		System.out.println("Billy just bought 20 tickets.");
	else
		System.out.println("Billy did not have enough money to buy 20 tickets.");
		System.out.println("Billy is going on the Millennium and Roosevelt Rd....");
		billy.getOn(millennium);
		billy.getOn(roosevelt);
		System.out.println("Billy is now a " + billy);
		System.out.println();
		System.out.println("Donna is a " + donna);
	if (donna.buyPass(booth1))
		System.out.println("Donna just bought a pass.");
	else
		System.out.println("Donna did not have enough money to buy a pass.");
	if (donna.buyTickets(6, booth1))
		System.out.println("Donna just bought 6 tickets.");
	else
		System.out.println("Donna did not have enough money to buy 6 tickets.");
		System.out.println("Donna is going on the McCormick Place and Merry Go Round...");
		donna.getOn(mcCormick);
		donna.getOn(homewood);
		System.out.println("Donna is now a " + donna);
		System.out.println();
		System.out.println("Fredy is a " + fredy);
	if (fredy.buyTickets(5, booth1))
		System.out.println("Fredy just bought 5 tickets.");
	else
		System.out.println("Fredy did not have enough money to buy 5 tickets.");
		System.out.println("Fredy is going on the Merry Go Round...");
		fredy.getOn(homewood);
		System.out.println("Fredy is now a " + fredy);
		System.out.println();
		System.out.println("Harry is a " + harry);
	if (harry.buyTickets(10, booth1)){
		System.out.println("Harry just bought 10 tickets.");
	}


	else{
		System.out.println("Harry did not have enough money to buy 10 tickets.");
	}

	if (harry.buyPass(booth1))
		System.out.println("Harry just bought a pass.");
	else
		System.out.println("Harry did not have enough money to buy a pass.");
		System.out.println("Harry is going on the Millennium twice and the Roosevelt Rd. Once...");
		harry.getOn(millennium);
		harry.getOn(roosevelt);
		harry.getOn(millennium);
		System.out.println("Harry is now a " + harry);
		System.out.println();
		System.out.println("Larry is a " + larry);
	if (larry.buyTickets(15, booth1))
		System.out.println("Larry just bought 15 tickets.");
	else
		System.out.println("Larry did not have enough money to buy 15 tickets.");
		System.out.println("Larry is going on the Roosevelt Rd., Millennium and Merry Go Round...");
		larry.getOn(roosevelt);
		larry.getOn(millennium);
		larry.getOn(homewood);
		System.out.println("Larry is now a " + larry);
		System.out.println();
		System.out.println("Ticket Booth 1 made $" + booth1.getMoneyMade());
		System.out.println("Ticket Booth 1 has " + booth1.getAvailablePasses()+" passes left.");
		System.out.println(millennium + " and had " + millennium.getNumberOfRiders() + " riders.");
		System.out.println(mcCormick + " and had " + mcCormick.getNumberOfRiders() + " riders.");
		System.out.println(kensington + " and had " + kensington.getNumberOfRiders() + " riders.");
		System.out.println(homewood + " and had " + homewood.getNumberOfRiders() + " riders.");
		System.out.println(roosevelt + " and had " + roosevelt.getNumberOfRiders() + " riders.");

    }
    public static void main(String argc[]){
    	doTestCase1();
    }




}
