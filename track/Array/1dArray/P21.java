
public class P21 {

    public static void main(String[] args) {

        int[] a = {10, 20, 40, 50};

        int index = 2;
        int element = 30;

        int[] b = new int[a.length + 1];

        // Copy elements before index
        System.arraycopy(a, 0, b, 0, index);

        // Insert element
        b[index] = element;

        // Shift remaining elements
        System.arraycopy(a, index, b, index + 1, a.length - index);

        // Print result
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
