package ArrayVersion;

import java.util.ArrayList;
/*
Class: ECE25100 Object Oriented Programming
Instructor: aLakeiaoli Yang
Author: xavier Richardson]
Assignment: [No. 3]
File Name: Lake
Date: [04]/[16]/[17]
*/

public class Lake {
    private String name;
    private ArrayList<Fish> fish;


    public String getName() {

        return name;
    }

    public boolean isFull(){
        return false;
    }

    public Lake() {
        fish = new ArrayList<>();
    }

    public Lake(String name, int capacity) {
        this.name = name;
        fish = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name+" containing "+fish.size()+" fish";
    }

    public void add(Fish newFish){
        fish.add(newFish);
    }

    public Fish getHungryFish(){
        Fish result = null;

        for (int i = 0; i < fish.size(); i++) {
            if (fish.get(i).isHungry()) {
                result = fish.get(i);
                fish.remove(result);
                break;
            }
        }

        return result;
    }

    public void listFish(){
        System.out.println(this+" as follows:");
        for (int i = 0; i < fish.size(); i++) {
            System.out.println(i+" - "+fish.get(i));
        }
        System.out.println();
    }
}
