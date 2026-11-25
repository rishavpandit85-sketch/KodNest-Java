
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String first = sc.next();
            String second = sc.next();
            String newTask = sc.next();
            List<String> jobs = new LinkedList<>();
            jobs.add(first);
            jobs.add(second);
            jobs.add(1, newTask);
            jobs.remove(0);
            System.out.println(jobs);
        }
    }
}
