
import java.util.PriorityQueue;

public class P1 {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(99);
        pq.add(1);
        System.out.println(pq);         // [1, 10, 5, 30, 99, 20]  heap order, NOT sorted
        System.out.println(pq.poll());  // 1  (smallest)
        System.out.println(pq.poll());  // 5  (next smallest)
    }
}
