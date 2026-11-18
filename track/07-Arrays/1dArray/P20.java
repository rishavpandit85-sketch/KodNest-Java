
public class P20 {

    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40};

        int[] b = new int[a.length + 1];

        int element = 50;

        System.arraycopy(a, 0, b, 0, a.length);

        b[b.length - 1] = element;

        for (int i : b) {
            System.out.println(i);
        }
    }
}
