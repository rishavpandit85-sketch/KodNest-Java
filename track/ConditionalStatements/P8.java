
import java.util.Scanner;

public class P8 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = scan.nextInt();

            switch (num) {
                case 1 -> System.out.println("ONE");
                case 2 -> System.out.println("TWO");
                case 3 -> System.out.println("Three");
                default -> System.out.println("invalid");
            }
        }
    }
}
