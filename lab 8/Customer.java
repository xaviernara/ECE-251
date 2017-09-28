import java.io.*;
public class Customer {
	private String	name;
	private int		age;
	private char	sex;
	private float	money;


	public Customer() {
		this("", 0, 'M', 0.0f);
	}

	public Customer(String aName) {
		this(aName, 0, 'M', 0.0f);
	}

	public Customer(String aName, int anAge, char aSex) {
		this(aName, anAge, aSex, 0.0f);
	}

	public Customer(String aName, int anAge, char aSex, float aMoney) {
	    name = aName;
	    age = anAge;
	    sex = aSex;
	    money = aMoney;
	}

	public String	getName() { return name; }
	public int		getAge() { return age; }
	public char		getSex() { return sex; }
	public float	getMoney() { return money; }

	public void setName(String n) { name = n; }
	public void setAge(int a) { age = a; }
	public void setSex(char s) { sex = s; }
	public void setMoney(float m) { money = m; }


	public String toString() {
		String result = name + ": a " + age + " year old ";
		if (sex == 'F')
			result += "fe";
		return result + "male with $" + money;
	}

	public boolean spend(float amount) {
		if (money < amount)
			return false;
		money -= amount;
		return true;
	}
	public void give(Customer c, float amount) {
		if (money >= amount) {
			money -= amount;
			c.money += amount;
		}
	}

/*	public void saveTo(java.io.DataOutputStream aFile) throws java.io.IOException {


				aFile.writeUTF(name) ;// UTF is short for "Unicode Text  Format"
				aFile.writeInt(age); //etc...
				aFile.writeChar(sex);
				aFile.writeFloat(money);

    		}

		}

		public static Customer readFrom(java.io.DataInputStream aFile)throws java.io.IOException {

				Customer filepass = new Customer();

				filepass.setName(aFile.readUTF()) ;// UTF is short for "Unicode Text  Format"
				filepass.setAge(aFile.readInt()); //etc...
				filepass.setSex(aFile.readChar());
				filepass.setMoney(aFile.readFloat());

				return filepass;
				}

*/


		//public void saveTo(String fileName){
		public void saveTo(java.io.DataOutputStream aFile) throws java.io.IOException {

              // try{
               	//	DataOutputStream aFile=new DataOutputStream(new FileOutputStream(fileName));
                	aFile.writeUTF(name) ;// UTF is short for "Unicode Text  Format"
					aFile.writeInt(age); //etc...
					aFile.writeChar(sex);
					aFile.writeFloat(money);

			//}catch (FileNotFoundException e) {// Do Nothing
    		//}catch ( IOException e) { // Do Nothing

                }
    		  // }



		//public static Customer readFrom(String fileName){
	public static Customer readFrom(java.io.DataInputStream aFile)throws java.io.IOException {
			Customer filepass = new Customer();
				//try{

				//	DataInputStream aFile = new DataInputStream(new FileInputStream(fileName));
					filepass.setName(aFile.readUTF()) ;// UTF is short for "Unicode Text  Format"
					filepass.setAge(aFile.readInt()); //etc...
					filepass.setSex(aFile.readChar());
					filepass.setMoney(aFile.readFloat());

				//}catch (FileNotFoundException e) {// Do Nothing
    		//	}catch (IOException e) { // Do Nothing
				//}
				return filepass;
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
}