public class Customer {
		String name;
		int age;
		char sex;
		float money;
		boolean admitted;

	public boolean spend(float amount)
	{
		money=money-amount;
		boolean x=false;
		if (money>=amount)
			x=true;

		return x;
    }

	public float computeFee()
	{
		float fee= 12.75f;

		if (age >= 18 )
			fee= 12.75f;

		else if (age <= 3)
			fee=0;

		else if (age >= 65)
			fee=12.75f/2;

		else
			fee=8.50f;

		return fee;
	}

	public void payAdmission()
	{
		float admission=computeFee();
		spend(admission);

	}

		public void give (Customer c, float amount )
	{
		money-=amount;
		c.money+=amount;


	}


}