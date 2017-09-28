import java.util.*;

public class CreatingFilesEX {

    public static void main(String[] args){
//Formatter is a way to put strings into a file (i.e wrtitng stuff to a file)
    	 final Formatter x;

    	 try{
    	 	//this creates the file if one is not found
    	 	x= new Formatter("file_Ex.txt");
    	 	System.out.println("You created a file");
    	 }
    	 catch(Exception e){
    	 	System.out.println("you got a error");
    	 }
    }



}