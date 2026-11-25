
import java.util.HashSet;
import java.util.Scanner;

public class P2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            HashSet<Integer> ids = new HashSet<>();
            for (int i = 0; i < n; i++) {
                ids.add(sc.nextInt());
            }
            System.out.println(ids.size());
        }
    }
}
