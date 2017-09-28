
public class UnderstandingIFProgram {
	private char input;
	private boolean male;
	public void question(){
	System.out.print("Are you (M)ale or (F)emale ? ... ");
	input = new java.util.Scanner(System.in).nextLine().charAt(0);
	//final long startTime = System.nanoTime();
	male = (input == 'M') || (input == 'm');
	if (!male)
	 System.out.println("OK, now I know that you are a female.");
	else
	 System.out.println("OK, now I know that you are a male.");
	//final long endTime = System.nanoTime();
	//System.out.println("execution time " + (endTime-startTime));
	}
	

}
