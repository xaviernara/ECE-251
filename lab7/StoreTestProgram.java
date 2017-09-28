public class StoreTestProgram {
	public static void main(String args[]) {
		Store s1 = new Store("Walmart off Innes");

    	s1.addCustomer(new Customer("Amie", 14, 'F', 100));
    	s1.addCustomer(new Customer("Brad", 15, 'M', 0));
    	s1.addCustomer(new Customer("Cory", 10, 'M', 100));
    	s1.addCustomer(new Customer("Dave", 5, 'M', 48));
    	s1.addCustomer(new Customer("Earl", 21, 'M', 500));
    	s1.addCustomer(new Customer("Flem", 18, 'M', 1));
    	s1.addCustomer(new Customer("Gary", 8, 'M', 20));
    	s1.addCustomer(new Customer("Hugh", 65, 'M', 30));
    	s1.addCustomer(new Customer("Iggy", 43, 'M', 74));
    	s1.addCustomer(new Customer("Joan", 55, 'F', 32));
    	s1.addCustomer(new Customer("Kyle", 16, 'M', 88));
    	s1.addCustomer(new Customer("Lore", 12, 'F', 1000));
    	s1.addCustomer(new Customer("Mary", 17, 'F', 6));
    	s1.addCustomer(new Customer("Nick", 13, 'M', 2));
    	s1.addCustomer(new Customer("Omar", 18, 'M', 24));
    	s1.addCustomer(new Customer("Patt", 24, 'F', 45));
    	s1.addCustomer(new Customer("Quin", 42, 'M', 355));
    	s1.addCustomer(new Customer("Ruth", 45, 'F', 119));
    	s1.addCustomer(new Customer("Snow", 74, 'F', 20));
    	s1.addCustomer(new Customer("Tamy", 88, 'F', 25));
    	s1.addCustomer(new Customer("Ulsa", 2, 'F', 75));
    	s1.addCustomer(new Customer("Vern", 9, 'M', 90));
    	s1.addCustomer(new Customer("Will", 11, 'M', 220));
    	s1.addCustomer(new Customer("Xeon", 17, 'F', 453));
    	s1.addCustomer(new Customer("Ying", 19, 'F', 76));
    	s1.addCustomer(new Customer("Zack", 22, 'M', 35));

    	System.out.println("Here are the customers:\n");
    	s1.listCustomers();

		// Find male/female customers
		System.out.println("\n\nHere are all the male customers:");
		java.util.ArrayList<Customer> result = s1.getCustomersOfSex('M');
    	for (Customer c: result) System.out.println(c);

		System.out.println("\n\nHere are all the female customers:");
		result = s1.getCustomersOfSex('F');
    	for (Customer c: result) System.out.println(c);

		// Find friends for Amie
    	System.out.println("\n\nFriends for 14 year old female Amie:");
    	result = s1.friendsFor(s1.getCustomers().get(0));
    	for (Customer c: result) System.out.println(c);

		// Find friends for Brad
    	System.out.println("\n\nFriends for 15 year old male Brad:");
    	result = s1.friendsFor(s1.getCustomers().get(1));
    	for (Customer c: result) System.out.println(c);

		// Remove the broke customers
    	System.out.println("\n\nHere are the customers after broke ones are removed:\n");
		s1.removeBrokeCustomers();
    	s1.listCustomers();


	}
}