
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P7 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> courses = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            courses.add(sc.next());
        }
        int changeIndex = sc.nextInt();
        String newCourse = sc.next();
        int removeIndex = sc.nextInt();

        courses.set(changeIndex, newCourse);
        courses.remove(removeIndex);
        System.out.println(courses);
    }
}
