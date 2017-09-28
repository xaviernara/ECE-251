public class ArrayTestProgram1{
	public static void main (String arqs[])
	{
		/*int total=0;
		int[] numbers= {1, 45, 23, 87, 89, 213, 54, 11, 76, 98, 23, 5}; ;
		//int[] numbers=new Array[];
		//int[] numbers=new Array[0];
		//int[] numbers=new Integer[];
		//int[] numbers=new Integer[0];
		//int[] numbers=new int[];
		//int[] numbers=new int[0];

		System.out.println("The array looks like this: "+numbers);
		System.out.println("It has "+ numbers.length +" elements in it");
		System.out.println("The 5th element in it is: "+ numbers[4]);
		*/

		int arry_sum = 0;
        int total = 0;
        //int[] numbers = new int[12];
        int[] numbers = {1, 45, 23, 87, 89, 213, 54, 11, 76, 98, 23, 5};
      /* System.out.println("The array looks like this: " + numbers);
        System.out.println("It has " + numbers.length + " elements in it");
        System.out.println("The 5th element in it is: " + numbers[4]);*/
        for(int i = 0 ; i < 12; i++)
        {
        	total += numbers[i];
        }
        /*for (int element: numbers )

        {
        	total += numbers[i];
        		System.out.println(total)
        */}
        System.out.println("The array sum is: " + total);
	}

}