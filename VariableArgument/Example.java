public class VarargsExample {
    static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        int result1 = sum(1, 2, 3, 4, 5);
        int result2 = sum(10, 20, 30);

        System.out.println("Sum 1: " + result1);
        System.out.println("Sum 2: " + result2);
    }
}
