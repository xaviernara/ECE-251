public class ArrayTestProgram2neo {
    public static void main(String args[]) {
        int true_tot = 0;
        int false_tot = 0;

        int count = 0;
        int arry_size;
        boolean[] values = {true, true, false, true, false, true,false};

        for(int i = 0; i < values.length; i++){

        if(values[i] == true)
        {
        	count++;
        }
        else{
        count--;
        }
        }
        if(count > 0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}
