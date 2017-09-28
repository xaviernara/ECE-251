/*
Class: ECE25100 Object Oriented Programming
Instructor: Xiaoli Yang
Author: [Xavier Richardson]
Assignment: [No. 2]
File Name: TicketBooth
Date: [02]/[28]/[17]
*/

public class TicketBooth {
//the 2 private instance variables and 2 publically accessible class constants are defined here
		int Pass_SoldCount=0;
		private int TicketsSold=0;
		private float moneyMade;
		private int availablePasses;

	//the get methods for the private instance variables are defined here
	public float getMoneyMade()
	{
		return moneyMade;
	}

	public int getAvailablePasses()
	{
		return availablePasses;
	}
// that records the fact that the specified number of tickets have been sold at this booth
	public void soldTickets(int num){

		//if (availablePasses>0)
		//moneyMade=moneyMade+(num*Assignment2GlobalValues.TICKET_PRICE);
		TicketsSold+=num;
	}

	public void setMoneyMade(float aMoneyMade){
		moneyMade+=aMoneyMade;

	}

//records the fact that a ride pass has been sold from this booth
	public void soldPass() {

		//if (availablePasses>0)

			//availablePasses--;
			//Pass_SoldCount++;

		//=(moneyMade+PASS_PRICE);
		availablePasses-=1;

	}

	public String toString(){

	 	return ("Ticket Booth with " + availablePasses + "passes");
	 }

//a constructor that takes an initial number of passes that the booth has available
 public TicketBooth(int aAvailablePasses) {

		moneyMade=0;
		Pass_SoldCount=0;
    	 //this.moneyMade=aMoneyMade;
    	 this.availablePasses=aAvailablePasses;
    }

}