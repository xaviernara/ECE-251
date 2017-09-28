
public class DictionaryTester {
    public static void main(String[] args) {
        DictionaryReader obj = new DictionaryReader();
       HangModel fr=new HangModel();


		obj.openFile();
		obj.readFile();
		obj.closeFile();

		fr.RandomWords();
		//System.out.println(fr.getCurrentStateOfWord());
		fr.setVisible(true);
		//System.out.println(fr.addGuessedLetters());
		//fr.UserGuess()
		//System.out.println();


    }
}
