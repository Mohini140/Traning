
// Abstract class
abstract class Vehicle {
    // Abstract method (does not have a body)
    abstract void start();

    // Concrete method (has a body)
    void fuel() {
        System.out.println("Vehicle needs fuel.");
    }
}

// Subclass (inherits from Vehicle)
class Car extends Vehicle {
    // Providing implementation for abstract method
    void start() {
        System.out.println("Car starts with a key.");
    }
}

public class Abstra {
    public static void main(String[] args) {
        Vehicle myCar = new Car();  // Upcasting
        myCar.start();              // Calls the abstract method implementation
        myCar.fuel();               // Calls the concrete method
    }
}
