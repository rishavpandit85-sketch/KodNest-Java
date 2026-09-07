
import java.util.Scanner;

public class P24 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            long expectedSum = (long) n * (n + 1) / 2;
            long actualSum = 0;

            for (int i = 0; i < n - 1; i++) {
                actualSum += sc.nextInt();
            }

            long missing = expectedSum - actualSum;

            System.out.println(missing);
        }
    }
}
