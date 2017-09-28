/**
 * @(#)LakeTester.java
 *
 *
 * @author
 * @version 1.00 2017/4/14
 */

public class LakeTester3 {

    public static void main(String[] args) {

    	Fish f0 = new Fish(13,"Richardson");
    	Fish f1 = new Fish(14,"Baker");
    	Lake L1 = new Lake("Lake Richardson", 10);

		f1.setHungry(true);
		f1.setHungry(false);

        L1.add(f0);
        L1.add(f1);

		L1.getHungryFish(L1.getFishArray());
		System.out.print
        //L1.listFish(f0);

    	//System.out.println(L1);
        // TODO code application logic here
    }
}
