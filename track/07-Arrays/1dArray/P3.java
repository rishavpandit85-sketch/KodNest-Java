
import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            int lower = scanner.nextInt();
            int upper = scanner.nextInt();

            int count = 0;

            for (int i = 0; i < n; i++) {
                if (numbers[i] >= lower && numbers[i] <= upper) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
