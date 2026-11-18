
import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            int[][][] a = new int[3][5][5];

            System.out.println("Enter Array Elements:");

            // Input
            for (int[][] matrix : a) {
                for (int[] row : matrix) {
                    for (int k = 0; k < row.length; k++) {
                        row[k] = scan.nextInt();
                    }
                }
            }

            System.out.println("Array Elements are:");

            // Output
            for (int[][] matrix : a) {
                for (int[] row : matrix) {
                    for (int elem : row) {
                        System.out.print(elem + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}
