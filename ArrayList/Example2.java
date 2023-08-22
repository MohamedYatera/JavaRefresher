import java.util.ArrayList;
import java.util.List;

public class ListOfExample {
    public static void main(String[] args) {
        // Create an array
        Integer[] array = {1, 2, 3, 4, 5};

        // Create an ArrayList using List.of
        List<Integer> arrayList = new ArrayList<>(List.of(array));

        // Add more elements to the ArrayList
        arrayList.add(6);
        arrayList.add(7);

        // Print the ArrayList
        System.out.println("ArrayList: " + arrayList);
    }
}
