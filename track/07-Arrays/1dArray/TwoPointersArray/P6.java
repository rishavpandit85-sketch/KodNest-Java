
import java.util.Scanner;

public class P6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;
        int isPalindrome = 1;

        while (left < right) {
            if (a[left] != a[right]) {
                isPalindrome = 0;
                break;
            }

            left++;
            right--;
        }

        System.out.println(isPalindrome);
    }
}
