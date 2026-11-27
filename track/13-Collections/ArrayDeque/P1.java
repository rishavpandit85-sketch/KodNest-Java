
import java.util.ArrayDeque;

public class P1 {

    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.push(10);   // [10]
        ad.add(20);    // [10, 20]          add -> back
        ad.push(30);   // [30, 10, 20]      push -> front
        ad.push(40);   // [40, 30, 10, 20]
        ad.push(50);   // [50, 40, 30, 10, 20]
        System.out.println(ad);        // [50, 40, 30, 10, 20]
        System.out.println(ad.pop());  // 50
        System.out.println(ad.pop());  // 40
    }
}
