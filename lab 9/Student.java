
public class Student extends Person implements Comparable <Student> {

	private double myGpa  = 0;
	private static  int lastIdAssigned = 10000;
	private int myStudentId  ;



	public int getMyStudentId(){
		return myStudentId;
	}
	public double getMyGpa(){
		return myGpa;
	}

	public void setMyStudentId(int aMyStudentId){
		myStudentId=aMyStudentId;
	}

	public void setMyGpa(double aMyGpa){
		myGpa=aMyGpa;
	}

	public String toString(){
		return ("The students ID number is: "+ myStudentId+ " and their GPA is " + myGpa );
	}

	public int compareTo(Student students){
		return Double.compare(this.myGpa, students.myGpa);
	}

    public Student(String aFirst, String aLast) {
    	super (aFirst,aLast);
    	 myStudentId=lastIdAssigned+1;
        lastIdAssigned++;
    }

    public void rank_student(Student[] x ){
        Student temp;
    	for(int i = 0; i < x.length; i++){
    		for (int j = 1; j< x.length;j++){
    			if(x[j-1].getMyGpa() < x[j].getMyGpa() ){
    				temp = x[j-1];
    				x[j-1] = x[j];
    				x[j] = temp;
    			}
    		}
    	}

    }



}