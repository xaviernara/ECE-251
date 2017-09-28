public class Customer1 {
	String name;
	int age;
	char sex;
	float money;
	boolean admitted;

	public boolean  spend(float amount){
		float spent;
		if(amount < money){

			spent = money - amount;

				money = spent;

			return true;
		}
		return false;
	}

	public void give(Customer1 person, float amount){
		float given;

		given = person.money + amount;
		money -= amount;
		person.money = given;

	}
	public float computeFee(){
		double fee = 10;

		if(age <= 3)
		{
			fee =  0;
		}
		else if(age >= 18 && age < 65)
		{
			fee = 12.75;
		}
		else if(age > 65)
		{
			fee =.5 *12.75;
		}
		else if(age > 4 && age <= 17)
		{
			fee = 8.50;
		}

		return (float)fee;

	}
		public boolean payAdmission(){

		float fee = computeFee();
		admitted = spend(fee);

		if(!admitted)
		{
			return false;
		}
		return true;
	}
}