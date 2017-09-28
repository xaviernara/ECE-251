public class ArrayTestProgram1 neo {
    public static void main(String args[]) {
    	int arry_sum = 0;
        int total = 0;
        //int[] numbers = new int[12];
        int[] numbers = {1, 45, 23, 87, 89, 213, 54, 11, 76, 98, 23, 5};
      /*  System.out.println("The array looks like this: " + numbers);
        System.out.println("It has " + numbers.length + " elements in it");
        System.out.println("The 5th element in it is: " + numbers[4]);*/
        for(int i = 0 ; i < 12; i++){
        	total += numbers[i];
        }
        System.out.println("The array sum is: " + total);
    }
}
