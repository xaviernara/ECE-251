

public class LakeTester {

    public static void main(String[] args) {


    	Fish f0 = new Fish(13,"Richardson");
    	Fish f1 = new Fish(14,"Baker");
    	Lake L1 = new Lake("Lake Richardson", 10);

		f1.setHungry(true);
		f1.setHungry(false);

        L1.add(f0);
        L1.add(f1);

		L1.getHungryFish(L1.getFishArray());
        L1.listFish(L1);

    	//System.out.println(L1);
        // TODO code application logic here
    }
}