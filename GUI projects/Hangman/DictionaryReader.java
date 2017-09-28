import java.io.*;
import java.util.*;

public class DictionaryReader {
//Scanner can be used to read from not only the keyboard but also from files
  private Scanner fileReader;

       public void openFile(){
       		try{
       			fileReader= new Scanner(new File("dictionary.txt"));
       		}
       		catch (Exception e){
       			System.out.println("Could not find file");
       		}
       }
        public void readFile(){

        	while(fileReader.hasNext()){
        		String wordsFromFile = fileReader.next();
				HangModel.addDictionaryList(wordsFromFile);
        		//System.out.printf("%s\n", wordsFromFile);
        		//Math.random(wordsFromFile);
        		//System.out.printf("%d\n",HangModel.sizeDictionaryList());
        		//System.out.printf("Hello this is me\n");
        		//System.out.flush();
        	}

        }

   		public void closeFile(){
   			fileReader.close();
   		}

}