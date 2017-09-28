import java.lang.*;
public class Person {

	private String firstName;
	private String lastName;
	private String email;
	//private char[] firstName_Array=first.toCharArray();
	//StringBuilder sb = new StringBuilder();

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setFirstName(String aFirst){
		firstName=aFirst;
	}

	public void setLastName(String aLast){
		lastName=aLast;
	}

	public String getEmail(){
		return email;
	}

	public void setEmail(String aEmail){
		email=aEmail;
	}

	public String toString(){
		return (email+ "@yahoo.com");
	}

    public Person(String aFirst, String aLast) {
    	firstName=aFirst;
    	lastName=aLast;
    	//email=sb.deleteCharAt(firstName.length()+1)+sb.deleteCharAt(lastName.length()+5);
    	email = aFirst.charAt(0)+aLast.substring(0,4);
    }


}