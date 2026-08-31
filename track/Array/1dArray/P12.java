
import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sorted = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                sorted = 0;
                break;
            }
        }

        System.out.println(sorted);
    }
}
