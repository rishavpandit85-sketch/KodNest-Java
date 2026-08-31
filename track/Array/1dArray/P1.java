
import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = scanner.nextInt();
            }

            int largest = numbers[0];
            int secondLargest = 0;
            boolean found = false;

            for (int i = 1; i < n; i++) {
                if (numbers[i] > largest) {
                    secondLargest = largest;
                    largest = numbers[i];
                    found = true;
                } else if (numbers[i] < largest) {
                    if (!found || numbers[i] > secondLargest) {
                        secondLargest = numbers[i];
                        found = true;
                    }
                }
            }

            if (found) {
                System.out.println(secondLargest);
            } else {
                System.out.println("No second largest distinct value");
            }
        }
    }
}
