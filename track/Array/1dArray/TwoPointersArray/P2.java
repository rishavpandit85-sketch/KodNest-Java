
import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int write = 0;

            // Move all non-zero elements to the front
            for (int read = 0; read < n; read++) {

                if (a[read] != 0) {
                    a[write] = a[read];
                    write++;
                }
            }

            // Fill remaining positions with zeros
            while (write < n) {
                a[write] = 0;
                write++;
            }

            // Print the same array
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
