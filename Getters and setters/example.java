public class Main {
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("Alice", 30);

        // Use getters to retrieve values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Use setters to modify values
        person.setName("Bob");
        person.setAge(25);

        // Retrieve and print updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        // Try to set a negative age (validation in the setter)
        person.setAge(-5);

        // Retrieve and print the age after the unsuccessful update
        System.out.println("Age after unsuccessful update: " + person.getAge());
    }
}



public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) { // Check for a non-negative age
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}
