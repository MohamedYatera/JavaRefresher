public class WrapperExample {
    public static void main(String[] args) {
        // Creating an int primitive
        int primitiveInt = 42;

        // Wrapping the int inside an Integer wrapper class
        Integer wrappedInt = Integer.valueOf(primitiveInt);

        // Now, you can use the wrappedInt like an object
        System.out.println("Wrapped Integer: " + wrappedInt);

        // You can also perform operations on it
        Integer anotherWrappedInt = wrappedInt + 10;
        System.out.println("Another Wrapped Integer: " + anotherWrappedInt);

        // Unwrapping to get the primitive int back
        int unwrappedInt = wrappedInt.intValue();
        System.out.println("Unwrapped Integer: " + unwrappedInt);
    }
}
