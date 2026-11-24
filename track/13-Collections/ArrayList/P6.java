
import java.util.*;

public class P6 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anu");
        names.add("Banu");
        System.out.println(names);

        names.add(1, "Dhoni");
        System.out.println(names);

        names.add(2, "Sachin");
        System.out.println(names);

        names.remove(0);
        System.out.println(names);
    }
}
