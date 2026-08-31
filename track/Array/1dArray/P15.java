
import java.util.Scanner;

public class P15 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int target = scanner.nextInt();

            int closest = arr[0];
            long minDiff = Math.abs((long) arr[0] - target);

            for (int i = 1; i < n; i++) {
                long diff = Math.abs((long) arr[i] - target);

                if (diff < minDiff || (diff == minDiff && arr[i] < closest)) {
                    minDiff = diff;
                    closest = arr[i];
                }
            }

            System.out.println(closest);
        }
    }
}
