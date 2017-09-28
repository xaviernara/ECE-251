public class Ride{
	//the private instance variables are defined here
		private String rideName="Park Xavier";
		private int ticketsRequired=6;
		private float heightRequirement=4.9f;
		private int numberOfRiders;

	//the get methods for the private instance variables are defined here
	public String getRideName()
	{
		return rideName;
	}

	public int getTicketsRequired()
	{
		return ticketsRequired;
	}

	public float getHeightRequirement()
	{
		return heightRequirement;
	}

	public int getNumberOfRiders()
	{
		return numberOfRiders;
	}

	public void setRideName(String aRideName){
		rideName=aRideName;
	}

	//the set methods for the private instance variables are defined here
	public void setNumberOfRiders(int aNumberOfRiders){
		numberOfRiders=aNumberOfRiders;
	}

	public void setTicketsRequired(int aTicketsRequired){
		ticketsRequired=aTicketsRequired;
	}

	public void setHeightRequirement(float aHeightRequirement){
		heightRequirement=aHeightRequirement;
	}

	//a constructor that takes the name of the ride, the number of tickets required and the height requirement
	 public Ride( String aRideName , int aTicketsRequired, float aHeightRequirement,int aNumberOfRiders) {

    	 this.ticketsRequired=aTicketsRequired;
    	 this.rideName=aRideName;
    	 this.heightRequirement=aHeightRequirement;
    	 this.numberOfRiders=aNumberOfRiders;

    }

    public Ride( String aRideName , int aTicketsRequired, int aHeightRequirement) {

    	 this(aRideName,aTicketsRequired,aHeightRequirement,0);

    }



 public Ride( String aRideName , int aTicketsRequired, float aHeightRequirement) {

    	setRideName(aRideName);
    	setTicketsRequired(aTicketsRequired);
    	setHeightRequirement(aHeightRequirement);
    	setNumberOfRiders(0);

    }


	public String toString (){

		return (rideName+ "requiring" + ticketsRequired+ "tickets and height restriction"+ heightRequirement+ "feet" );
	}

}

