
import java.util.Scanner;

public class P16 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            int count = 0;
            int max = 0;

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();

                if (num == 1) {
                    count++;

                    if (count > max) {
                        max = count;
                    }
                } else {
                    count = 0;
                }
            }

            System.out.println(max);
        }
    }
}
