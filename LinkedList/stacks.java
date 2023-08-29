import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop elements from the stack
        int poppedElement = stack.pop(); // Removes and returns 30
        System.out.println("Popped element: " + poppedElement);

        // Peek at the top element
        int topElement = stack.peek(); // Returns 20 (top element)
        System.out.println("Top element: " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty(); // Returns false
        System.out.println("Is the stack empty? " + isEmpty);
    }
}
