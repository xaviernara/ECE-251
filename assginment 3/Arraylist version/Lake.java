/*
Class: ECE25100 Object Oriented Programming
Instructor: aLakeiaoli Yang
Author: xavier Richardson]
Assignment: [No. 3]
File Name: Lake
Date: [04]/[16]/[17]
*/

public class Lake {


	private String name= "White Lake"; //a String representing the name of the lake
	private int capacity = 10; //an int indicating the maaLakeimum number of fish that can be kept in the lake
	private int numFish = 0; //an int indicating the number of fish that are currently in the lake
    private Fish[] fishArray = new Fish[capacity];//an array which will contain all Fish objects that are in the lake


//the get methods for the private instance variables are defined here
	public String getName(){
		return name;
	}
	public int getNumFish(){
		return numFish;
	}
//a method called isFull() which returns a boolean indicating whether or not the lake has reached its capacity of fish
	public boolean isFull(){
		if (capacity >= numFish)
			return false;
		else
			return true;
	}

	 public Fish[] getFishArray(){
	 	return fishArray;
	 }

//a constructor that takes the name of the fish and the capacity
    public Lake(String aName, int aCapacity) {
    	name=aName;
    	capacity=aCapacity;
    }
//a constructor that takes zero-arguments and calls above constructor
    public Lake(){
    	this(" ", 0);
    }
//a toString() method that returns a string in the following format: "White Lake containing 8 fish"
	public String toString(){
		return (name + " containing " + numFish + " fish as follows:");
	}
 	public void add(Fish aFish){
 		int pos ;
 			if (isFull() != true){
 				//System.out.println("IN_CHECK");
 				pos = spot_finder(fishArray);
 				System.out.println(" nigga this be the position "+ pos);
 				fishArray[pos] = aFish;
 				numFish++;
 			}

 	}
 	public int spot_finder(Fish[] AfishArray){
 		int pos = 0;
 		for(int i = 0; i < AfishArray.length; i++){
 			if(AfishArray[i] == null){
 				pos = i;
 				break;
 			}
 		}
 		return pos;
 	}
	public Fish getHungryFish(Fish[] aFish){
 		Fish hungry_fish= new Fish();

 		for (int i=0;i< aFish.length; i++){
 			if(aFish[i].isHungry())
 			{
 				aFish[i]=hungry_fish;
 				hungry_fish=null;
 				System.out.println("this is a hungey fish " +hungry_fish);
 				numFish--;
 				//return hungry_fish;
 				//return i.fishObj.getSpecies();
 				//fishArray[i].getSpecies()=null;
 			}	//fishArray[i]capacity];
 			else
 				aFish[i]=null;
 		}
 		return hungry_fish;
 	}
 	public void listFish(Lake aLake){
 		//Fish fishObj= new Fish();
 		System.out.println(aLake);
 		//System.out.println(fishArray.length);
 		for(int i=0;i<aLake.fishArray.length;i++){
 			if(aLake.fishArray[i] != null)
				System.out.println(i +" - " + aLake.fishArray[i]);
			//else
			//	System.out.println((i+1) +" - " + aLake.fishArray[i]);
 			}
 		}

 	}
//}
