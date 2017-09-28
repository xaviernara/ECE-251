import java.util.ArrayList;
import java.util.Iterator;

public class Store {
	private String  name;
    private ArrayList<Customer>  customers;
//	Iterator customerIterator = customers.iterator();


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
//c.spend(price)is used to call the Customer class method spend to see if the customer actually spent money (ie sent the price to spend)
//after i saw that the customer has enough money I record the customer in the customer arraylist
		if (c.spend(price))
			customers.add(c);

    }

    // List the customers
    public void listCustomers() {
    	for (Customer c: customers)
    		System.out.println(c);
    }

    // Returns a new arraylist of all customers of the store that have the
    // same sex as the one specified in the parameter.
	public ArrayList<Customer> getCustomersOfSex(char sex) {

	ArrayList<Customer> sexArrayList = new ArrayList<Customer>();
		for (Customer c:customers)
			{
				if (sex ==c.getSex())
				sexArrayList.add(c);
			}
			return sexArrayList;
		}


    // Remove all customers from the store that are broke (i.e., have < $10)
	public void removeBrokeCustomers() {

		Iterator cIterator = customers.iterator();

		while(cIterator.hasNext())
			{

				Customer c= (Customer)cIterator.next();
				if(c.getMoney()<10)

					//customers.remove(c);
					cIterator.remove();
			}

	}


    // Return all customers in the store that have the same sex and are within the
    // same age group (i.e., +- 3 years of age) as the one specified.
	public ArrayList<Customer> friendsFor(Customer match) {

	 int older = match.getAge()+3;
	 int younger = match.getAge()-3;

	 ArrayList<Customer> friendsArrayList = new ArrayList<Customer>();
	 Iterator cIterator = customers.iterator();

//in correct use of iterator
	/*	while(customerIterator.hasNext())
			{
				//Customer c=customerIterator.next(); means that the while loop will interat thru the customer array list (i.e customers in the store)
				Customer c= customerIterator.next();
				if((match.getSex()== (c.getSex())) && (( (c.getAge()>=younger)&&((c.getAge()<=older)) ) ))
					//friendIterator.add(c);
					friendsArrayList.add(c);
			}*/

//correct

			for(Customer c: customers){
				if((match.getSex()== (c.getSex())) && (( (c.getAge()>=younger)&&((c.getAge()<=older)) ) ))
						friendsArrayList.add(c);
			}
//correct use of iterator

			/*while(cIterator.hasNext())
			{
				//Customer c=customerIterator.next(); means that the while loop will interat thru the customer array list (i.e customers in the store)
				Customer c= cIterator.next();
				if((match.getSex()== (c.getSex())) && (( (c.getAge()>=younger)&&((c.getAge()<=older)) ) ))
					//friendIterator.add(c);
					friendsArrayList.add(c);
			}*/

		return friendsArrayList;
}
}