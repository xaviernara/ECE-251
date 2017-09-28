public class Fish {
    private String species;
    private int size;
    private boolean hungry;


    public Fish() {
    }

    public Fish(int size, String species) {
        this.species = species;
        this.size = size;
        hungry = true;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public String toString(){
        StringBuilder result = new StringBuilder();

        if (isHungry())
            result.append("A hungry ");
        else
            result.append("A full ");

        result.append(size+" cm "+species);

        return result.toString();
    }
}
