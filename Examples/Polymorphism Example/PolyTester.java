
public class PolyTester {

    public static void main(String[] args) {
    //you can assign different objects to variables as long as the reference variable is of the super class
    //so that way you dont have to keep making new objects from the different classes to use their functions now you can just use one to call other class functions
      PolymorphismExample example[] = new PolymorphismExample[2];
      example[0]=new Poly1();
      example[1]=new Poly2();

	//creating a polymorphic array
      //what this is going to do is loop thru each of the objects and cause the eat method for each one
      for(int i=0; i<2; i++){
      	example[i].eat();
      }

    }
}
