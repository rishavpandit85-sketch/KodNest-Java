
import java.util.ArrayList;
import java.util.Scanner;

public class P9 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<Integer> marks = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                marks.add(sc.nextInt());
            }
            int total = 0;
            for (int i = 0; i < marks.size(); i++) {
                total = total + marks.get(i);
            }
            System.out.println(total);
        }
    }
}
