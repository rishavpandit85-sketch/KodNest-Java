
import java.util.ArrayList;
import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String first = sc.next();
            String second = sc.next();

            ArrayList<String> names = new ArrayList<>();
            names.add(first);
            names.add(second);

            System.out.println(names);
        }
    }
}
