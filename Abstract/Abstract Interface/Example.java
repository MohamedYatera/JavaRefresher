// Defining an interface
interface Vehicle {
    void start();    // Abstract method
    void stop();     // Abstract method
}

// Implementing the interface in a class
class Car implements Vehicle {
    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }
}

class Motorcycle implements Vehicle {
    public void start() {
        System.out.println("Motorcycle started.");
    }

    public void stop() {
        System.out.println("Motorcycle stopped.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        myCar.start();        // Output: Car started.
        myCar.stop();         // Output: Car stopped.

        myMotorcycle.start();  // Output: Motorcycle started.
        myMotorcycle.stop();   // Output: Motorcycle stopped.
    }
}
