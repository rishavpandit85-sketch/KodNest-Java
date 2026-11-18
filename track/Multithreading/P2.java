
import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {

            // Activity 1
            System.out.println("Enter a: ");
            int a = scan.nextInt();
            System.out.println("Entered number is : " + a);

            // Activity 2
            System.out.println("Enter first number : ");
            int n1 = scan.nextInt();
            System.out.println("Enter second number : ");
            int n2 = scan.nextInt();

            int res = n1 + n2;
            System.out.println("Addition result is : " + res);
        }
    }
}
