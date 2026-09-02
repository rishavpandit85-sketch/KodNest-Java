
import java.util.*;

public class P3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        while (left < right) {

            // Find odd value from left
            while (left < right && a[left] % 2 == 0) {
                left++;
            }

            // Find even value from right
            while (left < right && a[right] % 2 != 0) {
                right--;
            }

            // Swap
            if (left < right) {
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;

                left++;
                right--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
