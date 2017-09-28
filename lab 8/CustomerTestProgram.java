import java.io.*;
public class CustomerTestProgram {
	public static void main(String args[]) {

        Customer c1 = new Customer("Amie", 14, 'F', 100);
        Customer c2 =new Customer("Brad", 15, 'M', 0);

//this try is used to output files
	/*	try{
// ... your code here ...

			DataOutputStream out;
			out = new DataOutputStream(new FileOutputStream("customer1.txt"));
			c1.saveTo(out);
			out.close();

			out = new DataOutputStream(new FileOutputStream("customer2.txt"));
			//FileOutputStream out =new FileOutputStream("customer2.txt");
			out.writeUTF(c2.getName());// UTF is short for "Unicode Text  Format"
			out.writeInt(c2.getAge()); //etc...
			//out.write("Amie");
			out.close();

   			}catch (FileNotFoundException e) {// Do Nothing
    		}catch ( IOException e) { // Do Nothing

    }
*/
//this try is used to input files
    /*	try{
// ... your code here ...

			DataInputStream in;
			in = new DataInputStream(new FileInputStream("customer1.txt"));
			System.out.println(c1.readFrom(in));
			in.close();

			in = new DataInputStream(new FileInputStream("customer2.txt"));
			System.out.println(c1.readFrom(in));
   			in.close();

   			}catch (FileNotFoundException e) {// Do Nothing
    		}catch ( IOException e) { // Do Nothing

    }
    */
    try{
    		DataOutputStream out = new DataOutputStream(new FileOutputStream("customers.txt"));
			c1.saveTo(out);
			c2.saveTo(out);
			out.close();

    		}catch (FileNotFoundException e) {
    			// Do Nothing
    		}catch ( IOException e) {
    			// Do Nothing
    		}

    try{
    		DataInputStream in = new DataInputStream(new FileInputStream("customers.txt"));
			System.out.println(Customer.readFrom(in));
			System.out.println(Customer.readFrom(in));
			in.close();

    		}catch (FileNotFoundException e) {
    			// Do Nothing
    		}catch ( IOException e) {
    			// Do Nothing
    		}

    }
}