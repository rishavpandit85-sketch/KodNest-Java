
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            Deque<String> actions = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                actions.push(sc.next());
            }

            while (!actions.isEmpty()) {
                System.out.println(actions.pop());
            }
        }
    }
}
