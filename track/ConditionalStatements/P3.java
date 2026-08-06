
import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = scan.nextInt();

        if (num > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }
}
