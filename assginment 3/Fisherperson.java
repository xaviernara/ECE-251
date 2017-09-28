/*
Class: ECE25100 Object Oriented Programming
Instructor: aLakeiaoli Yang
Author: [aLakeavier Richardson]
Assignment: [No. 3]
File Name: Fisherperson
Date: [04]/[09]/[17]
*/
public class Fisherperson {

	public static int LIMIT=3;//which is the maximum number of fish that all fisherpersons are allowed to keepby "law"
	public static int MIN_KEEP_FISH_SIZE=10; //which is the mimimum size of fish that can be kept if caught.Anything smaller than this must be thrown back
	private String name; //a String representing the name of the Fisherperson
	private Fish[] fishCaught; //an array which will contain all Fish objects that were caught and kept by this person
	private int numFishCaught; //an int indicating the number of fish that were caught and are currently being kept by this person


	public int getNumFishCaught(){
		return numFishCaught;
	}

	public Fish[] getFishCaught(){
		return fishCaught;
	}

	public String toString(){
		return (name + " with " + numFishCaught + "fish");
	}

	 public void Fisherperson(String aName) {
    	name=aName;
    }


	public boolean shouldKeep(Fish aFish){
		if ((numFishCaught<=LIMIT) && (aFish.getSpecies () != "Sunfish") && (aFish.getSize() >= MIN_KEEP_FISH_SIZE )){
			System.out.println("You should keep the fish");
			return true;
		}
		else{
			System.out.println("You should not keep the fish");
			return false;
		}

	}

	public void throwBackFish(Lake fish_from_lake){
		Lake aLake = new Lake();
		Fish removedFish=new Fish();

		for (int i=0;i<LIMIT;i++){
			if ((aLake.isFull()==true || fishCaught[i]!=null )){
				//if()){
					fish_from_lake.add(fishCaught[i]);
					fishCaught[i] = null;
			}
				//numFishCaught--;
			}
		}
//}

	public void tryToCatchFishIn(Lake aLake){
		//Fish hungry_Fish=new Fish();
		//Fish removedFish=new Fish();

		Fish removedFish = aLake.getHungryFish();
		if((removedFish!=null) && (shouldKeep(removedFish)==true)){
			for(int i=0;i<LIMIT;i++){
				if((fishCaught==null) //&& (shouldKeep(fishCaught)==true)){
						//fishCaught[i]=removedFish;
						//fishCaught[i]=aLake.getHungryFish();
						fishCaught[i]=removedFish;
						//removedFish=numFishCaught;
						//numFishCaught++;
						removedFish.setHungry(false);
						System.out.println("this is the removed fish form the lake" + removedFish);

				}
				removedFish.setHungry(false);
				aLake.add(removedFish);

			/*
			if (shouldKeep(removedFish)==false){
				aLake.add(removedFish);
				removedFish.isHungry()=false;
			}
			*/
		}
	}

	public void listFishCaught(){
		Fish fishObj= new Fish();
		boolean nothing = true;
		System.out.println("Fish that " + name+ "has:");
		for (int i=0; i<LIMIT; i++ ){
			 if (fishCaught[i]!=null) {
			//System.out.println("Fish that " + gatName()+ "has:");
			//System.out.println(fishObj.toString());
			System.out.println(fishCaught[i]);
			nothing = false;
		}
		if (nothing ==true)
			System.out.println( "NONE");

	}

	}
}