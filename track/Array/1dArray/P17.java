
import java.util.Scanner;

public class P17 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int previous = scanner.nextInt();

            int currentLength = 1;
            int maxLength = 1;

            for (int i = 1; i < n; i++) {
                int num = scanner.nextInt();

                if (num > previous) {
                    currentLength++;
                } else {
                    currentLength = 1;
                }

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }

                previous = num;
            }

            System.out.println(maxLength);
        }
    }
}
