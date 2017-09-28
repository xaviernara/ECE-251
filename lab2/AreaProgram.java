// package lab2;

public class AreaProgram {
	double a;
	double area;
	public AreaProgram (double f)
	{
		a=f;
		area=computeArea();
		}

	public double computeArea()
	{

	//COMPUTE THE AREA
	return (Math.sqrt(3)/4)*(a*a);
	}

}
