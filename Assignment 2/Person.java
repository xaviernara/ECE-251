public class Person {
	//the private instance variables are defined here

	private float money; //a float representing the amount of money the person currently has.
	private float height;  //a float representing the person’s height (in inches).
	private int ticketCount;  //an integer indicating the number of tickets the person currently has
	private boolean hasPass;   // a boolean indicating whether or not the person has a pass to get on rides.
 	 //a int thats used to subtract from the total number of tickets avaliable once a ticket is purchased (i.e. ticket count)

//the get methods for the private instance variables are defined here

	public Person(float aHeight, float aMoney){
		height=aHeight;
		money=aMoney;
		hasPass=false;
		ticketCount=0;
	}

	public float getMoney(){  //this uses the money passed to it and displays it
		return money;
	}

		public float getHeight(){  //this uses the height passed to it and displays it
		return height;
	}

		public int getTicketCount(){  //this displays the amount of tickets before anyone buys them
		return ticketCount;
	}

		public boolean hasPass(){  //this detemines if theres enough passes
		return hasPass;
	}

	/*	public int useTickets() ////a int thats used to subtract from the total number of tickets avaliable once a ticket is purchased (i.e. ticket count)
	{
		if (ticketCount!=0)
			ticketUsage=ticketCount-ticketUsage;

		return ticketUsage;
	}
	*/




//the set methods for the private instance variables are defined here

	public void setMoney( float aMoney ){
		this.money=aMoney;
	}

	public void setHeight( float aHeight ){
		this.height=aHeight;
	}

	public void setPass( boolean aHasPass ){
		this.hasPass=aHasPass;
	}
	public String toString() {

		if (hasPass==true)
			return (height + "foot person with $" + money+ "and a pass");

		return (height+ "foot person with $" +money+ "and" + ticketCount+ "tickets" );
	}

	public void setTicketCount( int aTicketCount ){
		this.ticketCount=aTicketCount;

	}


		public int useTickets(int ticketUsage) //a int thats used to subtract from the total number of tickets avaliable once a ticket is purchased (i.e. ticket count)
	{ //a int thats used to subtract from the total number of tickets avaliable once a ticket is purchased (i.e. ticket count)

		if (ticketCount>=0)
			ticketCount=ticketCount-ticketUsage;

		return ticketCount;
	}

	public boolean buyTickets(int number, TicketBooth booth){

		if (this.money<number*Assignment2GlobalValues.TICKET_PRICE)
		{
			return false;
		}
		else
		{
			booth.setMoneyMade(number*Assignment2GlobalValues.TICKET_PRICE);
			booth.soldTickets(number);
			ticketCount+= number;
			this.money-=number*Assignment2GlobalValues.TICKET_PRICE;
			return true;
		}

	}

	public boolean buyPass(TicketBooth booth){

		if (this.money < Assignment2GlobalValues.PASS_PRICE)
		{
			return false;
		}
		else
		{
			booth.setMoneyMade(Assignment2GlobalValues.PASS_PRICE);
			booth.soldPass();
			hasPass=true;
			this.money-=Assignment2GlobalValues.PASS_PRICE;
			return true;
		}

	}
	public boolean allowedToRide(Ride aRide){

		if ( aRide.getHeightRequirement()<=height )
		{
			if (hasPass)
				return true;
			else if (ticketCount>=aRide.getTicketsRequired())
				return true;
		}
		return false;
	}



	public void getOn(Ride aRide){

		if (allowedToRide(aRide))
			ticketCount-= aRide.getTicketsRequired();
			aRide.setNumberOfRiders(aRide.getNumberOfRiders()+1);
	}



}