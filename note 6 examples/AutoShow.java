import java.util.*;
public class AutoShow{
	ArrayList<Car> cars;

	public AutoShow(){
		cars=new ArrayList<Car>();
	}

	public void addACar(Car c){
		cars.add(c);
	}

	public String toString(){
		return ("The Chicago Autoshow has "+cars.size() +" cars in 2017.");
	}

	public Car topSpeed(){
		Car top=cars.get(0);
		for(int i=0; i<cars.size(); i++){
			if(top.getTopSpeed()<(cars.get(i).getTopSpeed())){
				top=cars.get(i);
			}
		}
		return top;

	}

	public ArrayList<Car> carsWithMake(String m){
		ArrayList<Car> sameMake=new ArrayList<Car>();

		for(Car aCar: cars){
			if((aCar.getMake()).equals(m)){
				sameMake.add(aCar);
			}
		}
		return sameMake;
	}

	public ArrayList<String> differentMakes(){
		ArrayList<String> differentMakes=new ArrayList<String>();
		for(Car c: cars){
			if(!differentMakes.contains(c.getMake()))
				differentMakes.add(c.getMake());
		}
		return differentMakes;
	}
	//bubble sorting
	public void printBySpeed() {
		ArrayList<Car> copy=new ArrayList<Car>(cars);
	/*	for(int j=copy.size()-1; j>0; j--){

		for(int i=copy.size()-1; i>0; i--){
			if((copy.get(i)).getTopSpeed()>((copy.get(i-1)).getTopSpeed())){
				Car temp=copy.get(i);
				copy.set(i, copy.get(i-1));
				copy.set(i-1,temp);
			}
		}
		}*/

		for(int j=0; j<copy.size(); j++){

		for(int i=0; i<copy.size()-1-j; i++){
			if((copy.get(i)).getTopSpeed()<((copy.get(i+1)).getTopSpeed())){
				Car temp=copy.get(i);
				copy.set(i, copy.get(i+1));
				copy.set(i+1,temp);
			}
		}
		}

		for(int j=0; j<copy.size(); j++){
			System.out.println(copy.get(j));
		}
	}
//selection sorting
	public void printByMake() {
		ArrayList<Car> copy=new ArrayList<Car>(cars);

		for(int j=0; j<copy.size(); j++){
			int indexMin=j;
			String minMake=(copy.get(indexMin)).getMake();
			for(int i=j; i<copy.size(); i++){
			//	if(((copy.get(i)).getMake()).compareTo(minMake)<0){
				if(((copy.get(i)).getMake()).compareTo(minMake)>0){
					indexMin=i;
					minMake=(copy.get(i)).getMake();
				}
			}

			Car temp=copy.get(j);
			copy.set(j, copy.get(indexMin));
			copy.set(indexMin,temp);
		}




		for(int j=0; j<copy.size(); j++){
			System.out.println(copy.get(j));
		}
	}

	public String mostCommonColor(){
		String mostCommon=(cars.get(0)).getColor();
		int mostCount=1;

		for(int i=0; i<cars.size(); i++){
			String color=(cars.get(i)).getColor();
			int colorCount=0;
			for(int j=0; j<cars.size(); j++){
				if(((cars.get(j)).getColor()).equals(color)){
					colorCount++;
				}
			}

			if(colorCount>mostCount){
				mostCommon=color;
				mostCount=colorCount;
			}
		}
		return mostCommon;
	}
}