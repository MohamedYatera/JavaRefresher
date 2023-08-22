import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to hold integers
        ArrayList<Integer> integerList = new ArrayList<>();

        // Add elements to the list
        integerList.add(5);
        integerList.add(10);
        integerList.add(15);

        // Access elements
        int element = integerList.get(1); // Gets the element at index 1 (which is 10)
        System.out.println("Element at index 1: " + element);

        // Modify elements
        integerList.set(0, 7); // Changes the element at index 0 to 7

        // Remove elements
        integerList.remove(1); // Removes the element at index 1 (which was 10)

        // Get size and check if the list is empty
        int size = integerList.size(); // Gets the number of elements in the list
        boolean isEmpty = integerList.isEmpty(); // Checks if the list is empty
        System.out.println("Size of the list: " + size);
        System.out.println("Is the list empty? " + isEmpty);

        // Iteration using enhanced for loop
        System.out.println("Elements in the list:");
        for (int num : integerList) {
            System.out.println(num);
        }
    }
}
