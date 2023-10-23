
public class MathUtilities {
    // A static method to add two numbers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        int result = MathUtilities.add(5, 3); // You can call the static method directly on the class
        System.out.println("The result is: " + result);
    }
}

//In this example, the add method is static, so you don't need to create an instance of the MathUtilities class to use it. You can call it directly on the class, as shown in the main method. This method is the same for all uses, and it doesn't depend on any //specific instance of the class.
