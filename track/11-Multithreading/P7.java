
import java.util.Scanner;

// Approach 2: implementing Runnable
class RunnableActivity implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        switch (threadName) {
            case "ADD" ->
                addition();
            case "CHAR" ->
                printChar();
            default ->
                printNum();
        }
    }

    void addition() {
        System.out.println("Addition activity started...");
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a :");
            int a = scan.nextInt();
            System.out.println("Enter b :");
            int b = scan.nextInt();
            int res = a + b;
            System.out.println("Addition result is : " + res);
        }
        System.out.println("Addition activity completed...");
    }

    void printChar() {
        System.out.println("Printing char activity started...");
        for (char i = 'A'; i <= 'E'; i++) {
            System.out.println(i);
            if (!pause(3000)) {
                return;
            }
        }
        System.out.println("Printing char activity Completed...");
    }

    void printNum() {
        System.out.println("Printing num activity started...");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (!pause(3000)) {
                return;
            }
        }
        System.out.println("Printing num activity completed...");
    }

    // Sleep kept in its own method, outside the loops
    static boolean pause(long ms) {
        try {
            Thread.sleep(ms);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return false;
        }
    }
}

public class P7 {

    public static void main(String[] args) {
        RunnableActivity ac = new RunnableActivity();   // one task object
        Thread t1 = new Thread(ac);                     // shared by three threads
        Thread t2 = new Thread(ac);
        Thread t3 = new Thread(ac);
        t1.setName("ADD");
        t2.setName("CHAR");
        t3.setName("NUM");
        t1.start();
        t2.start();
        t3.start();
    }
}
