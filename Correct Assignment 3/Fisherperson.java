
public class Fisherperson {
    private String name;
    private Fish[] fishCaught;
    private int numFishCaught;

    public static int LIMIT=3;
    public static int MIN_KEEP_FISH_SIZE=10;

    public Fisherperson(String name) {
        this.name = name;
        fishCaught = new Fish[LIMIT];
    }

    public String getName() {
        return name;
    }

    public Fish[] getFishCaught() {
        return fishCaught;
    }

    public int getNumFishCaught() {
        return numFishCaught;
    }

    public boolean shouldKeep(Fish fish){
        if (fish.getSpecies().equals("SunFish")||fish.getSize()<=MIN_KEEP_FISH_SIZE)
            return false;
        return true;
    }

    public void throwBackFish(Lake lake){
        for (int i = 0; i < LIMIT; i++) {
            if (fishCaught[i]!=null) {
                if (lake.isFull())
                    return;
                    lake.add(fishCaught[i]);
                fishCaught[i] = null;
            }
        }
    }

    public void tryToCatchFishIn(Lake lake){
        Fish fishCaught = lake.getHungryFish();

        if (fishCaught!=null&&shouldKeep(fishCaught))
            for (int i = 0; i < LIMIT; i++) {
                if (this.fishCaught[i]==null) {
                    this.fishCaught[i] = fishCaught;
                    fishCaught.setHungry(false);
                    return;
                }
            }
        fishCaught.setHungry(false);
        lake.add(fishCaught);
    }

    public void listFishCaught(){
        System.out.println("Fish that "+name+" has:");

        boolean none = true;
        for (int i = 0; i < LIMIT; i++) {
            if (fishCaught[i]!=null) {
                System.out.println(fishCaught[i]);
                none = false;
            }
        }

        if (none)
            System.out.println("NONE");
        System.out.println();
    }

    @Override
    public String toString() {
        return name+" with "+numFishCaught+" fish";
    }
}
