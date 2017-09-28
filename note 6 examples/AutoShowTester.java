public class AutoShowTester {
public static void main(String args[]) {
    AutoShow  anAutoshow = new AutoShow();

    //First add lots of cars to the show
    anAutoshow.addACar(new Car("959", "Porsche", "Red", 340));
    anAutoshow.addACar(new Car("Grand-Am", "Pontiac", "White", 160));
    anAutoshow.addACar(new Car("Mustang", "Ford", "Blue", 230));
    anAutoshow.addACar(new Car("Rabbit", "Volkswagon", "White", 100));
    anAutoshow.addACar(new Car("Jetta", "Volkswagon", "Silver", 130));
    anAutoshow.addACar(new Car("Storm", "Geo", "Yellow", 140));
    anAutoshow.addACar(new Car("MR2", "Toyota", "Black", 210));
    anAutoshow.addACar(new Car("Escort", "Ford", "Yellow", 10));
    anAutoshow.addACar(new Car("Civic", "Honda", "Black", 180));
    anAutoshow.addACar(new Car("Altima", "Nissan", "Silver", 190));
    anAutoshow.addACar(new Car("525", "BMW", "Gold", 490));
    anAutoshow.addACar(new Car("Prelude", "Honda", "White", 90));
    anAutoshow.addACar(new Car("RX7", "Mazda", "Red", 220));
    anAutoshow.addACar(new Car("MX6", "Mazda", "Green", 180));
    anAutoshow.addACar(new Car("Firebird", "Pontiac", "Black", 140));
    anAutoshow.addACar(new Car("Mustang", "Ford", "Green", 230));
    anAutoshow.addACar(new Car("Mustang", "Ford", "Green", 230));
    anAutoshow.addACar(new Car("Mustang", "Ford", "Green", 230));
    anAutoshow.addACar(new Car("Mustang", "Ford", "Green", 230));
    anAutoshow.addACar(new Car("Mustang", "Ford", "Green", 230));
    anAutoshow.addACar(new Car("Mustang", "Ford", "Green", 230));
    anAutoshow.addACar(new Car("Mustang", "Ford", "Green", 230));
    anAutoshow.addACar(new Car("Mustang", "Ford", "Green", 230));


    //Now test our fun methods
    System.out.println(anAutoshow);

	System.out.println("\n\nThis is the fastest car:");
    System.out.println(anAutoshow.topSpeed());

	System.out.println("\n\nHere are the Pontiac cars:");
    System.out.println(anAutoshow.carsWithMake("Pontiac"));

    System.out.println("\nHere are the Ford cars:");
    System.out.println(anAutoshow.carsWithMake("Ford"));

    System.out.println("\n\nHere are the different makes:");
    System.out.println(anAutoshow.differentMakes());

    System.out.println("\n\nHere are the cars sorted by top speed:");
    anAutoshow.printBySpeed();

    System.out.println("\n\nHere are the cars sorted by make:");
    anAutoshow.printByMake();

    System.out.println("\n\nThe most common color is " +  anAutoshow.mostCommonColor());

}

}
