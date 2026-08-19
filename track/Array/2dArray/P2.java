import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            int[][] a = new int[3][];

            a[0] = new int[4];
            a[1] = new int[3];
            a[2] = new int[5];

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
