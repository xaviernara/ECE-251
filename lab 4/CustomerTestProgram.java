
public class
 CustomerTestProgram {
	public static void main(String args[]) {
        Customer1 c1 =new Customer1();
     	c1.name ="Bob";
        c1.age = 17;
        c1.money = 10;
        Customer1 c2 =new Customer1();
        c2.name ="Dottie";
        c2.age = 3;
        c2.money = 0;
        Customer1 c3 =new Customer1();
        c3.name ="Steve";
        c3.age = 67;
        c3.money = 30;
        Customer1 c4 =new Customer1();
        c4.name ="Jane";
        c4.age = 64;
        c4.money = 0;

		System.out.println("Before going into the circus:");
		System.out.println("  Bob has $"+ c1.money);
		System.out.println("  Dottie has $" + c2.money);
		System.out.println("  Steve has $" + c3.money);
		System.out.println("  Jane has $"+ c4.money);
		System.out.println("						");

		// Simulate people going into the circus
		c1.payAdmission();
		c2.payAdmission();
		c3.payAdmission();
		c4.payAdmission();
		c3.give(c4, 15.0f);
		c4.payAdmission();

		System.out.println("After going into the circus:");
		System.out.println("  Bob has $"+ c1.money);
		System.out.println("  Dottie has $"+ c2.money);
		System.out.println("  Steve has $"+ c3.money);
		System.out.println("  Jane has $"+ c4.money);
		}
}


