import java.util.*;
public class ScannerTokenizingTest {
    public static void main(String args[]) {
   		String sentence = "Banks, Rob, 34! Indiana 12.67";
		StringTokenizer words = new StringTokenizer(sentence,", "+"!");
		while(words.hasMoreTokens()) {
    		String aWord = words.nextToken();
    		System.out.println(aWord);
		}
   }
}