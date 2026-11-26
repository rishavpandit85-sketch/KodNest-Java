
import java.util.TreeSet;

public class P1 {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);

        System.out.println(ts);

        System.out.println(ts.headSet(75));
        System.out.println(ts.headSet(75, true));
        System.out.println(ts.tailSet(100));
        System.out.println(ts.tailSet(100, false));

        System.out.println(ts.higher(100));
        System.out.println(ts.higher(80));
        System.out.println(ts.higher(200));
        System.out.println(ts.higher(0));

        System.out.println(ts.lower(100));
        System.out.println(ts.lower(30));
        System.out.println(ts.lower(10));

        System.out.println(ts.ceiling(100));
        System.out.println(ts.ceiling(80));
        System.out.println(ts.ceiling(200));

        System.out.println(ts.floor(125));
        System.out.println(ts.floor(70));
        System.out.println(ts.floor(20));
    }
}
