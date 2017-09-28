/*
Class: ECE25100 Object Oriented Programming
Instructor: aLakeiaoli Yang
Author: Xavier Richardson]
Assignment: [No. 3]
File Name: Fisherperson
Date: [04]/[16]/[17]
*/

package ArrayVersion;

import java.util.ArrayList;

public class Fisherperson {
    private String name;
    private ArrayList<Fish> fishCaught;

    public static int LIMIT=3;
    public static int MIN_KEEP_FISH_SIZE=10;

    public Fisherperson(String name) {
        this.name = name;
        fishCaught = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getNumFishCaught() {
        return fishCaught.size();
    }

    public boolean shouldKeep(Fish fish){
        if (fish.getSpecies().equals("SunFish")||fish.getSize()<=MIN_KEEP_FISH_SIZE)
            return false;
        return true;
    }

    public void throwBackFish(Lake lake){
        for (int i = 0; i < fishCaught.size(); i++) {
            lake.add(fishCaught.get(i));
        }
        fishCaught.clear();
    }

    public void tryToCatchFishIn(Lake lake){
        Fish fishCaught = lake.getHungryFish();

        if (this.fishCaught.size()<LIMIT&&fishCaught!=null&&shouldKeep(fishCaught))
            for (int i = 0; i < fishCaught.getSize(); i++) {
                this.fishCaught.add(i,fishCaught);
                fishCaught.setHungry(false);
                return;
            }
        fishCaught.setHungry(false);
        lake.add(fishCaught);
    }

    public void listFishCaught(){
        System.out.println("Fish that "+name+" has:");

        boolean none = true;
        for (int i = 0; i < fishCaught.size(); i++) {
                System.out.println(fishCaught.get(i));
                none = false;
        }

        if (none)
            System.out.println("NONE");
        System.out.println();
    }

    @Override
    public String toString() {
        return name+" with "+fishCaught.size()+" fish";
    }
}
