
public class P23 {

    public static void main(String[] args) {

        int[] a = {12, 23, 34, 45};

        int last = a[a.length - 1];

        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = last;

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
