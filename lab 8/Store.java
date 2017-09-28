import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

public class Store {
	private String      		 name;
    private ArrayList<Customer>  customers;

    public Store(String n) {
       name = n;
       customers = new ArrayList<Customer>();
    }

    public String getName() { return name; }
    public ArrayList<Customer> getCustomers() { return customers; }

    public void addCustomer(Customer c) {

    }
    //record the purchase from a customer, and add the customer in the store record.
	public void recordPurchase(Customer c, float price) {

    }

    // List the customers
    public void listCustomers() {
    	for (Customer c: customers)
    		System.out.println(c);
    }

    public void saveTo(java.io.DataOutputStream aFile) throws java.io.IOException {
    		Iterator cIterator = customers.iterator();

		while(cIterator.hasNext())
		{
			Customer c = (Customer)customerIterator.next();
					c.aFile.writeUTF(Customer.getname()) ;// UTF is short for "Unicode Text  Format"
					c.aFile.writeInt(getAge); //etc...
					c.aFile.writeChar(getSex);
					c.aFile.writeFloat(getMoney);
		}
    	//Customer filepass= new Customer();
    	            //Customer.saveTo(aFile);
    				/*aFile.writeUTF(Customer.getname()) ;// UTF is short for "Unicode Text  Format"
					aFile.writeInt(getAge); //etc...
					aFile.writeChar(getSex);
					aFile.writeFloat(getMoney);
                     */
    }

    // Returns a new arraylist of all customers of the store that have the
    // same sex as the one specified in the parameter.
	public ArrayList<Customer> getCustomersOfSex(char sex) {

	}

    // Remove all customers from the store that are broke (i.e., have < $10)
	public void removeBrokeCustomers() {

	}


    // Return all customers in the store that have the same sex and are within the
    // same age group (i.e., +- 3 years of age) as the one specified.
	public ArrayList<Customer> friendsFor(Customer match) {

	}


}