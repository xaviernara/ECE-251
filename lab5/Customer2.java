
public class Customer2 {
	String name = "Charles";
	int age = 10;
	char sex = 'M';
	float money = 10;
	boolean admitted = true;

	public Customer2(String aName, int aAge,char aSex) {
		name = aName;
		age = aAge;
		sex = aSex;
    }

    public Customer2(String aName) {
		name = aName;
    }
     public Customer2(String aName,int aAge, char aSex,float aMoney, boolean aAdmitted) {
		name = aName;
		age = aAge;
		sex = aSex;
		admitted = aAdmitted;
		money = aMoney;
    }
    public Customer2() {

    }



	public boolean spend(float amount) {
		if (money < amount)
			return false;
		money -= amount;
		return true;
}
public void give(Customer2 c, float amount) {
	if (money >= amount) {
		money -= amount;
		c.money += amount;
	}
}
public float computeFee() {
	if (age <= 3)
		return 0;
	if (age < 18)
		return 8.50f;
	if (age >= 65)
		return 12.75f * 0.50f;
		return 12.75f;
}
public void payAdmission() {
	if (spend(computeFee()))
		admitted = true;
	}
}