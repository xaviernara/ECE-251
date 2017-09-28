public class CustomerTestProgram3 {
	public static void main(String args[]) {
        Customer3 c =new Customer3();
        c.setName("Steve");
        c.setMoney(20);
        c.setAdmitted(true);
        System.out.println(c.getName());
        System.out.println(c.getMoney());
        System.out.println(c.isAdmitted());
    }
}