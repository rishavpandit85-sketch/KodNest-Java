
import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Enter name : ");

            char ch = scan.next().charAt(2);

            System.out.println(ch);
        }
    }
}
