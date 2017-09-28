public class Customer3 {
	private String name = "";
	private int age =0;
	private char sex ='M';
	private float money=0.0f;
	private boolean admitted=false ;
	String ifMale;
	String ifAdmitted;

	public String getName (){
		return name;
	}
	public void  setName (String aName ){
		 this.name=aName;
	}

	public int getAge (){
		return age;
	}
	public void  setAge (int aAge ){
		 this.age=aAge;
	}

	public char getSex (){
		return sex;
	}
	public void  setSex (char aSex ){
		 this.sex=aSex;
	}

	public float getMoney (){
		return money;
	}
	public void  setMoney (float aMoney ){
		 this.money=aMoney;
	}

	public boolean isAdmitted (){
		return admitted;
	}
	public void  setAdmitted (boolean aAdmitted ){
		 this.admitted =aAdmitted;
	}

    public Customer3(String aName, int aAge, char aSex) {
		this.name=aName;
		this.age=aAge;
		this.sex=aSex;
    }
    public Customer3(String aName,int aAge, char aSex, float aMoney, boolean aAdmitted) {
		this.name=aName;
		this.age=aAge;
		this.sex=aSex;
		this.money=aMoney;
		this.admitted=aAdmitted;
    }
    public Customer3() {

    }


  public String toString() {

    if(sex == 'M')
    {
    	ifMale = "Male";

    }
    else
    {
    	ifMale = "Female";
    }
    if(admitted)
    {
    	ifAdmitted = "";
    }
    else
    {
    	ifAdmitted = "not ";
    }

	return "Customer " + name + ": a "+age+" year old " +ifMale+ " with $" +money+ " who has "+ifAdmitted+"been admitted";


    }


	public boolean spend(float amount) {
		if (money < amount)
			return false;
		money -= amount;
		return true;
}
/*public void give(Customer2.1 c, float amount) {
	if (money >= amount) {
		money -= amount;
		c.money += amount;
	}
*/
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


