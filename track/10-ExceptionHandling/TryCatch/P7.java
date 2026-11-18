
import java.util.Scanner;

public class P7 {

    public static void main(String[] args) {

        // try-with-resources
        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Enter a : ");

            int a = scan.nextInt();

            System.out.println("Entered number is : " + a);

        }

    }

}
