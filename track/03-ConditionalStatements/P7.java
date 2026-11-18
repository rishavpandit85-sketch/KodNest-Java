
import java.util.Scanner;

public class P7 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();

            switch (num) {
                case 1 -> System.out.println("ONE");
                case 2 -> System.out.println("TWO");
                case 3 -> System.out.println("THREE");
                default -> System.out.println("Invalid");
            }
        }
    }
}
