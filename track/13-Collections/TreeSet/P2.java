
import java.util.Scanner;
import java.util.TreeSet;

public class P2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            TreeSet<Integer> marks = new TreeSet<>();

            for (int i = 0; i < n; i++) {
                marks.add(sc.nextInt());
            }

            for (int mark : marks) {
                System.out.println(mark);
            }
        }
    }
}
