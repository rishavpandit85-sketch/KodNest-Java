
import java.util.Scanner;

public class P4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long value = sc.nextLong();

            if (value > largest) {
                secondLargest = largest;
                largest = value;
            } else if (value < largest && value > secondLargest) {
                secondLargest = value;
            }
        }

        if (secondLargest == Long.MIN_VALUE) {
            System.out.println("No second largest distinct value");
        } else {
            System.out.println(secondLargest);
        }
    }
}
