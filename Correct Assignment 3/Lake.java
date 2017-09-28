
public class Lake {
    private String name;
    private Fish[] fish;
    private int capacity;
    private int numFish;

    public int getNumFish() {
        return numFish;
    }

    public String getName() {

        return name;
    }

    public boolean isFull(){
        return numFish==capacity;
    }

    public Lake() {
        this.capacity = 4;
        fish = new Fish[capacity];
    }

    public Lake(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        fish = new Fish[capacity];
    }

    @Override
    public String toString() {
        return name+" containing "+numFish+" fish";
    }

    public void add(Fish newFish){
        if (isFull())
            return;
        for (int i = 0; i < capacity; i++) {
            if (fish[i]==null) {
                fish[i] = newFish;
                numFish++;
                return;
            }
        }
    }

    public Fish getHungryFish(){
        Fish result = null;

        for (int i = 0; i < capacity; i++) {
            if (fish[i]!=null&&fish[i].isHungry()) {
                result = fish[i];
                fish[i] = null;
                numFish--;
                break;
            }
        }

        return result;
    }

    public void listFish(){
        System.out.println(this+" as follows:");
        for (int i = 0; i < capacity; i++) {
            if (fish[i]!=null)
                System.out.println(i+" - "+fish[i]);
        }
        System.out.println();
    }
}
