
import java.util.Scanner;

public class P7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Swap adjacent pairs: (0,1), (2,3), (4,5)...
        for (int i = 0; i < n - 1; i += 2) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }

        // Print array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
