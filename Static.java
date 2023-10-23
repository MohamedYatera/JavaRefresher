public class ToyCar {
    // A static variable for the number of wheels
    public static int numberOfWheels = 4;

    // Instance variables for other properties of the toy car
    private String color;
    private String model;

    // Constructor to create a toy car with a specific color and model
    public ToyCar(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // Method to describe the toy car
    public void describe() {
        System.out.println("This toy car is a " + color + " " + model + " with " + numberOfWheels + " wheels.");
    }

    public static void main(String[] args) {
        // Create two toy cars
        ToyCar car1 = new ToyCar("Red", "Sports Car");
        ToyCar car2 = new ToyCar("Blue", "SUV");

        // Let's describe the toy cars
        car1.describe();
        car2.describe();
    }

   *\ ssdads /*
}

//Static is a special word that we use in Java to talk about things that are the same for all the objects of a class. Imagine you have a toy box, and all the toys inside the box are the same type of toy. 
//Let's say you have a toy box for cars. The color of the box, the shape, and the design on the box are the same for all the toy cars.
//In Java, when we say something is static, it means it's like the design on the box. It doesn't belong to any specific car (object); instead, it's the same for all the cars (objects) of that type.
//It's like if you change the color or design on the box, all the cars in the box will have the same change.
//For example, if you have a class for toy cars and you make a static variable like "number of wheels," all the toy cars of that class will have the same number of wheels because they share this information, 
//just like all the toy cars from the same box have the same design on the box.
//So, static in Java is like having something that's the same for all the objects of a class, just like the design on a toy box is the same for all the toys in that box.
