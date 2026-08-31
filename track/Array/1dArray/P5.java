
import java.util.Scanner;

public class P5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            int positive = 0;
            int negative = 0;
            int zero = 0;

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();

                if (num > 0) {
                    positive++;
                } else if (num < 0) {
                    negative++;
                } else {
                    zero++;
                }
            }

            System.out.println(positive + " " + negative + " " + zero);
        }
    }
}
