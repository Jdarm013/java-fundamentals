//Abstract Class
abstract class Vehicle {

    // The method to test
    public void startEngine() {
        System.out.println("Vehicle Engine Starting... Vroom!");
    }

}


class Car extends Vehicle {

    public void drive() {

    }
}


public class Main {
    public static void main(String[] args) {

        // Create the Car object.
        Car myCar = new Car();

        // Test
        System.out.println("Testing the method inherited from the abstract class:");

        // Call the method )
        myCar.startEngine();
    }
}