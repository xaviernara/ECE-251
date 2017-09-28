import java.io.*;
import java.lang.*;
import java.util.*;

public class WritingFiles {
	private Formatter x;
	public void openFile(){
		try{
			x= new Formatter("chinesse.txt");
			System.out.println("You created a file");
		}
		catch(Exception e){
			System.out.println("you got a error");
		}
	}
	 public void addRecords(){
	 	//x.format(format, argument);
	 	//depending on ho many %s you put in the format() will determine how many things you can write to a file
	 	x.format("%s%s%s"," 20 ", " xavier ", " nara ");
	 }
	public void closeFile(){
		x.close();
	}
    public static void main(String[] args) {
    	WritingFiles write = new WritingFiles();
    	write.openFile();
    	write.addRecords();
    	write.closeFile();
    }
}