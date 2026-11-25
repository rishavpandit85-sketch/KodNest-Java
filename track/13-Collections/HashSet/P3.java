
import java.util.HashSet;
import java.util.Set;

public class P3 {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("Anu");
        hs.add("Zooni");
        hs.add("Raju");
        hs.add("Yuva");
        hs.add("Anu");
        System.out.println(hs);

        Set<Integer> hs2 = new HashSet<>();
        hs2.add(100);
        hs2.add(1);
        hs2.add(99);
        hs2.add(13);
        hs2.add(66);
        System.out.println(hs2);
    }
}
