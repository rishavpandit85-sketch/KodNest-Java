
import java.util.ArrayList;
import java.util.Scanner;

public class P8 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            names.add(sc.next());
        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
