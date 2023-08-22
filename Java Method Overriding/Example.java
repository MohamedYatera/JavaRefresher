class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Creating a Dog object using the Animal reference
        myAnimal.makeSound(); // This will call the overridden method in Dog class
    }
}
