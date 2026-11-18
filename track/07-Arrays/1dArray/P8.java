
import java.util.Scanner;

public class P8 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            long sum = 0;

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                sum += num;
            }

            double average = (double) sum / n;

            System.out.println(sum);
            System.out.printf("%.2f%n", average);
        }
    }
}
