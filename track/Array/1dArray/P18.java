
import java.util.Scanner;

public class P18 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();

                if (num < smallest) {
                    secondSmallest = smallest;
                    smallest = num;
                } else if (num > smallest && num < secondSmallest) {
                    secondSmallest = num;
                }
            }

            if (secondSmallest == Integer.MAX_VALUE) {
                System.out.println("No second smallest distinct value.");
            } else {
                System.out.println(secondSmallest);
            }
        }
    }
}
