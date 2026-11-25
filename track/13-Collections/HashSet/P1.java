
import java.util.HashSet;
import java.util.Set;

public class P1 {

    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(10);
        hs.add(40);
        hs.add(99);
        System.out.println(hs);
        hs.remove(99);
        System.out.println(hs);
        System.out.println(hs.contains(99));
        System.out.println(hs.isEmpty());
        hs.clear();
        System.out.println(hs);
    }
}
