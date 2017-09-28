

package ArrayVersion;

public class LakeTest {
    public static void main(String[] args) {
        // Create a full lake with 10 fish
        Lake whiteLake = new Lake("White Lake", 10);
        whiteLake.add(new Fish(4, "Sunfish"));
        whiteLake.add(new Fish(25, "Pickerel"));
        whiteLake.add(new Fish(20, "Bass"));
        whiteLake.add(new Fish(30, "Perch"));
        whiteLake.add(new Fish(4, "Sunfish"));
        whiteLake.add(new Fish(15, "Pickerel"));

        whiteLake.add(new Fish(9, "Pickerel"));
        whiteLake.add(new Fish(12, "Bass"));
        whiteLake.add(new Fish(5, "Sunfish"));
        whiteLake.add(new Fish(12, "Sunfish"));
        whiteLake.listFish();

        // Create another lake with 3 fish
        Lake silverLake = new Lake("Silver Lake", 5);
        silverLake.add(new Fish(35, "Pike"));
        silverLake.add(new Fish(6, "Pike"));
        silverLake.add(new Fish(10, "Pike"));
        silverLake.listFish();

        // Create two people to fish in the lakes
        Fisherperson fred = new Fisherperson("Fred");
        Fisherperson suzy = new Fisherperson("Suzy");
        for (int i=0; i<5; i++) {
            System.out.println("Fred tries to catch a fish in White Lake");
            fred.tryToCatchFishIn(whiteLake);
            whiteLake.listFish();
            fred.listFishCaught();
        }
        for (int i=0; i<2; i++) {
            System.out.println("Suzy tries to catch a fish in White Lake");
            suzy.tryToCatchFishIn(whiteLake);
            whiteLake.listFish();
            suzy.listFishCaught();
        }
        System.out.println("Suzy tries to catch a fish in Silver Lake");
        suzy.tryToCatchFishIn(silverLake);
        silverLake.listFish();
        suzy.listFishCaught();
        System.out.println("Now Suzy and Fred will throw back their fish into Silver Lake");
        suzy.throwBackFish(silverLake);
        suzy.listFishCaught();
        fred.throwBackFish(silverLake);
        fred.listFishCaught();
        silverLake.listFish();
    }
}
