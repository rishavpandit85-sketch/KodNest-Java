
import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int left = sc.nextInt();
        int right = sc.nextInt();

        // Check if range is valid
        if (left < 0 || right >= n || left > right) {
            System.out.println("-1");
            return;
        }

        // Reverse selected range
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        // Print array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
