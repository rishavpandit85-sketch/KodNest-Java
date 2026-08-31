import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            int num = scanner.nextInt();
            int min = num;
            int max = num;

            for (int i = 1; i < n; i++) {
                num = scanner.nextInt();

                if (num < min) {
                    min = num;
                }

                if (num > max) {
                    max = num;
                }
            }

            System.out.println(min + " " + max);
        }
    }
}
