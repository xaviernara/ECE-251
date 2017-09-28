import java.util.ArrayList;
import java.util.Iterator;
	public class ArrayListTestProgram2 {
	 	public static void main(String args[]) {

			ArrayList<Integer> numbersArrayList = new

			 ArrayList<Integer>(java.util.Arrays.asList(1, 45, 23, 87, 89, 213, 54, 11, 76, 98,23, 5));

	 Iterator numsIterator = numbersArrayList.iterator();

		System.out.println("The ArrayList looks like this beforehand:" + numbersArrayList);

int num;
		while(numsIterator.hasNext())  {

			//num=(Integer)numsIterator.next();
			//(Integer)numsIterator.next() this used to go thru th array list and analyze each element and test if its even or odd
			if ((Integer)numsIterator.next()%2 != 0)
				numsIterator.remove();
	 	}
		System.out.println("The ArrayList looks like this afterwards:" + numbersArrayList);
	}
//(int num: numbersArrayList)

}