
import java.util.Scanner;

public class P7 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] readings = new int[5];
            // Read 5 integers
            for (int i = 0; i <= readings.length - 1; i++) {
                readings[i] = scanner.nextInt();
            }
            // Calculate total
            int total = 0;
            for (int i = 0; i <= readings.length - 1; i++) {
                total = total + readings[i];
            }

            System.out.println("Total: " + total);
        }
    }
}
