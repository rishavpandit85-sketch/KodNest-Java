
import java.util.ArrayDeque;

public class P2 {

    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(40);
        ad.add(50);
        System.out.println(ad);             // [10, 20, 30, 40, 50]
        System.out.println(ad.poll());      // 10  (removes front)
        System.out.println(ad);             // [20, 30, 40, 50]
        System.out.println(ad.peek());      // 20  (looks at front, no remove)
        System.out.println(ad);             // [20, 30, 40, 50]
        System.out.println(ad.peekLast());  // 50  (looks at back)
        System.out.println(ad);             // [20, 30, 40, 50]
        ad.offer(99);                       // adds to back
        System.out.println(ad);             // [20, 30, 40, 50, 99]
    }
}
