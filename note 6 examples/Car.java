public class Car{
	private String name, make, color;
	private int topSpeed;

	public Car(String n, String m, String c, int t){
		name=n;
		make=m;
		color=c;
		topSpeed=t;
	}

	public String getName(){
		return name;
	}

	public String getMake(){
		return make;
	}
	public String getColor(){
		return color;
	}
	public int getTopSpeed(){
		return topSpeed;
	}

	public void setName(String n){
		name=n;
	}

		public void setMake(String n){
		make=n;
	}

		public void setColor(String n){
		color=n;
	}
		public void setTopSpeed(int n){
		topSpeed=n;
	}

	public String toString(){
		return ("make: "+make+ " ,name: "+name+" ,color: "+color+" has the top speed of " + topSpeed);
	}

}