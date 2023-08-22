import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(10);

        System.out.println(integerList.size()); // Output: 2
        System.out.println(integerList.get(0)); // Output: 5
    }
}
