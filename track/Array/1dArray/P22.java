
public class P22 {

    public static void main(String[] args) {

        int[] a = {12, 23, 34, 45};

        int first = a[0];

        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        a[a.length - 1] = first;

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
