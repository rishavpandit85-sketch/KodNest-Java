
import java.util.Scanner;

public class P8 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String firstText = scanner.nextLine();
            String secondText = scanner.nextLine();

            boolean exactMatch = firstText.equals(secondText);
            boolean ignoreCaseMatch = firstText.equalsIgnoreCase(secondText);

            System.out.println("Exact match: " + exactMatch);
            System.out.println("Ignore-case match: " + ignoreCaseMatch);
        }
    }
}
