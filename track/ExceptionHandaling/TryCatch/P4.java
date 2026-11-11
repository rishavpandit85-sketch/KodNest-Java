
import java.util.Scanner;

class P4 {

    public static void main(String[] args) {
        System.out.println("Main method Execution Started....");

        divide();

        System.out.println("Main method Execution Completed....");
    }

    static void divide() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Division Started....");

            System.out.print("Enter a: ");
            int a = scan.nextInt();

            System.out.print("Enter b: ");
            int b = scan.nextInt();

            int res = a / b;
            System.out.println("Result: " + res);

        } catch (ArithmeticException e) {
            System.out.println("Exception handled in divide method");
        }

        System.out.println("Division Completed");
    }
}
