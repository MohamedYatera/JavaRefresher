import java.util.List;
import java.util.ArrayList;

public class MyListImplementation<E> implements List<E> {
    private ArrayList<E> internalList = new ArrayList<>();

    @Override
    public int size() {
        return internalList.size();
    }

    @Override
    public boolean isEmpty() {
        return internalList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return internalList.contains(o);
    }

    @Override
    public boolean add(E e) {
        return internalList.add(e);
    }

    @Override
    public E get(int index) {
        return internalList.get(index);
    }

    // Implement the other List methods...

    public static void main(String[] args) {
        List<Integer> myList = new MyListImplementation<>();
        myList.add(5);
        myList.add(10);

        System.out.println("Size: " + myList.size()); // Output: Size: 2
        System.out.println("Element at index 1: " + myList.get(1)); // Output: Element at index 1: 10
    }
}
