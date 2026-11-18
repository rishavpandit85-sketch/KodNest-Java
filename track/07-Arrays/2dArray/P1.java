
import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            int[][] a = new int[3][5];

            System.out.println("Enter Array Elements :");

            // Input
            for (int[] row : a) {
                for (int j = 0; j < row.length; j++) {
                    row[j] = scan.nextInt();
                }
            }

            System.out.println("Array Elements are :");

            // Output
            for (int[] row : a) {
                for (int elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
        }
    }
}
