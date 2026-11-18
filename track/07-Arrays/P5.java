
import java.util.Scanner;

public class P5 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int[] a = new int[5];

            System.out.println("Enter Array Elements:");

            for (int i = 0; i < a.length; i++) {
                a[i] = scan.nextInt();
            }

            System.out.println("Original Array Elements are:");

            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);
            }

            int[] b = new int[a.length];

            int j = b.length - 1;

            for (int i = 0; i < a.length; i++) {
                b[j] = a[i];
                j--;
            }

            int[] rev = b;

            System.out.println("Reversed Array Elements are:");

            for (int i = 0; i < rev.length; i++) {
                System.out.println(rev[i]);
            }

            System.out.println("Reference Array Elements are:");

            for (int i = 0; i < rev.length; i++) {
                System.out.println(rev[i]);
            }
        }
    }
}
