abstract class Animal {
    public abstract void makeSound(); // Abstract method
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks"); // Concrete implementation for Dog
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat meows"); // Concrete implementation for Cat
    }
}

class Snake extends Animal {
    public void makeSound() {
        // Snakes do not produce a typical animal sound,
        // so we provide an empty implementation
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal snake = new Snake();

        dog.makeSound();  // Output: Dog barks
        cat.makeSound();  // Output: Cat meows

        // Snake does not produce a sound, but it satisfies the contract of the abstract class
    }
}
