
public class Robot {
	double  d;
	public Robot()
	{
		d=50;
	}
	public void computestuff (double xx, double yy, double tt )
	{
		double location;
		double location2;
		double vv;
		vv=(Math.PI/180)*tt;
		location= (xx+d*Math.cos(vv));
		location2= (yy+d*Math.sin(vv));
		System.out.println("Your location is (" + location + "," + location2 + ")" );
		//return location;
	}
	
}

