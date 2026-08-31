import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int evenCount = 0;
            int oddCount = 0;

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();

                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println(evenCount + " " + oddCount);
        }
    }
}
