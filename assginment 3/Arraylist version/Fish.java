/*
Class: ECE25100 Object Oriented Programming
Instructor: Xiaoli Yang
Author: [Xavier Richardson]
Assignment: [No. 3]
File Name: Fish
Date: [04]/[16]/[17]
*/
public class Fish {

    	private String species;
    	private int size;
    	private boolean hungry = true;

//the get methods for the private instance variables are defined here
    	public int getSize()
    	{
    		return size;
    	}

    	public String getSpecies(){
    		return species;
    	}

    	public boolean isHungry(){
    		return hungry;
    	}

//the set method for the private instance variable hungry are defined here
    	public void setHungry (boolean aHungry){
    		hungry=aHungry;
    	}

//a constructor that takes the size of the fish, the species
    	public Fish ( int aSize, String aSpecies ){
    		species=aSpecies;
    		size=aSize;
    	}

//a constructor that takes zero-arguments and calls above constructor
		public Fish(){
			this(0, " ");
		}
//a toString() method that returns a string in the following format, depending on whether the fish is hungry or not: "
    	public String toString(){
    		if (isHungry()==true)
    			return ("A hungry " + size +" cm " + species);
    		else
    			return ("A full " + size +" cm " + species);
    	}
    }

