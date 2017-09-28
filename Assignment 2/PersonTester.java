public class PersonTester {
	public static void main(String args[]) {
		Person mary = new Person(4.9f, 20.00f);
		System.out.println(mary.getHeight());
		System.out.println(mary.getMoney());
		System.out.println(mary.getTicketCount());
		System.out.println(mary.hasPass());
		System.out.println(mary);
		mary.setTicketCount(3);
		System.out.println(mary);
		mary.useTickets(2);
		System.out.println(mary);
		mary.setPass(true);
		System.out.println(mary);

		}

}