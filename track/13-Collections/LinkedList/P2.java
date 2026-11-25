
import java.util.LinkedHashSet;

public class P2 {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Anu");
        lhs.add("Zooni");
        lhs.add("Raju");
        lhs.add("Yuva");
        lhs.add("Anu");
        System.out.println(lhs);

        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
        lhs2.add(100);
        lhs2.add(1);
        lhs2.add(99);
        lhs2.add(13);
        lhs2.add(66);
        System.out.println(lhs2);
    }
}
