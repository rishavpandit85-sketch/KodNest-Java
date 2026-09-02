
import java.util.Scanner;

public class P9 {

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

            while (left < right && a[left] == 0) {
                left++;
            }

            while (left < right && a[right] == 1) {
                right--;
            }

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
