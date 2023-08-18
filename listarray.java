import java.util.Arrays;

class listArray {
    public static void main(String[] args) {
        int[] idk = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        idk[3] = 16;
        
        for (int i : idk) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(idk));

        System.out.println(Arrays.binarySearch(idk, 1));

        Arrays.sort(idk);

        System.out.println(Arrays.toString(idk));
    }
}
