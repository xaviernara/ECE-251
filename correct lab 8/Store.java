import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Store implements java.io.Serializable {
	private String      		 name;
    private ArrayList<Customer>  customers;
    private ArrayList<Customer>  samesex;
    private ArrayList<Customer>  friends;

    /*
    public static Store readFrom(java.io.BufferedReader aFile) throws java.io.IOException{
    	Store s = new Store("?");
    	while(aFile.ready()){
    		String space;
    	    Customer c = new Customer();
    	    String[] read_cust = aFile.readLine().split(",");

    		c.setName(read_cust[0]);
    		c.setAge(Integer.parseInt(read_cust[1]));
    		c.setSex(read_cust[2].charAt(0));
    		c.setMoney(Float.parseFloat(read_cust[3]));

    		s.addCustomer(c);

    	}
    	return s;

    }
    public void saveTo(java.io.PrintWriter aFile) throws java.io.IOException{
    	Iterator customerIterator = getCustomers().iterator();
		while(customerIterator.hasNext()){
			Customer c = (Customer)customerIterator.next();
			aFile.println(c.getName()+","+c.getAge()+","+c.getSex()+","+c.getMoney());
		}

    }*/
    public Store(String n) {
       name = n;
       customers = new ArrayList<Customer>();
    }

    public String getName() { return name; }
    public ArrayList<Customer> getCustomers() { return customers; }

    public void addCustomer(Customer c) {
    	customers.add(c);

    }

    //record the purchase from a customer, and add the customer in the store record.
	public void recordPurchase(Customer c, float price) {
		float cusMoney = c.getMoney();
		if(c.spend(price)){
			c.setMoney(cusMoney - price);
			addCustomer(c);
		}

    }

    // List the customers
    public void listCustomers() {
    	for (Customer c: customers)
    		System.out.println(c);
    }

    // Returns a new arraylist of all customers of the store that have the
    // same sex as the one specified in the parameter.
	public ArrayList<Customer> getCustomersOfSex(char sex) {
		samesex = new ArrayList<Customer>()  ;
		for(Customer c: customers){
			if(c.getSex()== sex){
				samesex.add(c);
			}

		}
		return samesex;

	}

    // Remove all customers from the store that are broke (i.e., have < $10)
	public void removeBrokeCustomers() {
		Iterator customerIterator = getCustomers().iterator();
		while(customerIterator.hasNext()){
			Customer c = (Customer)customerIterator.next();
			if( c.getMoney() < 10){
				customerIterator.remove();
			}


		}


	}


    // Return all customers in the store that have the same sex and are within the
    // same age group (i.e., +- 3 years of age) as the one specified.
	public ArrayList<Customer> friendsFor(Customer match) {
		friends = new ArrayList<Customer>()  ;
		for(Customer c: customers){

			if(compareSex(match,c)){
				if(compareAge(match,c)){
					if(samePerson(match,c)){
						friends.add(c);
					}
				}
            }

		}
		return friends;
	}
	//compareAge method to compare two customers ages and return true if the age within 3 years
	//of each other
	public boolean compareAge(Customer a , Customer b){
		int x = Math.abs(a.getAge() - b.getAge());

		if(x <= 3)
		{
			return true;
		}
		else{
			return false;
		}


	}
	//compareSex function to compare two customers sex and return true if the sex is the same.
	public boolean compareSex(Customer a, Customer b){
		if(a.getSex()== b.getSex()){
			return true;
		}
		else{
			return false;
		}

	}
	public boolean samePerson(Customer a, Customer b){
		if(a.equals(b)){

			return false;
		}
		else{
			return true;
		}

	}
	public boolean broke(Customer a){
		if(a.getMoney() < 10){
			return true;
		}
		else{
			return false;
		}

	}



}