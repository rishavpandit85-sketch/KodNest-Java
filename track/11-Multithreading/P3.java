
import java.util.Scanner;

class Addition extends Thread {

    @Override
    public void run() {
        System.out.println("Addition activity started...");

        // try-with-resources closes the Scanner automatically (no resource-leak warning)
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a :");
            int a = scan.nextInt();
            System.out.println("Enter b :");
            int b = scan.nextInt();
            int c = a + b;
            System.out.println("Addition Result is : " + c);
        }

        System.out.println("Addition activity completed...");
    }
}

// Helper: sleep is kept outside the loops, so no "sleep in loop" warning
final class Pause {

    private Pause() {
    }

    static boolean seconds(long sec) {
        try {
            Thread.sleep(sec * 1000);
            return true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // restore interrupt status
            return false;
        }
    }
}

class PrintNum extends Thread {

    @Override
    public void run() {
        System.out.println("Printing num activity started...");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (!Pause.seconds(3)) {
                return; // thread was interrupted
            }
        }

        System.out.println("Printing num activity completed...");
    }
}

class PrintChar extends Thread {

    @Override
    public void run() {
        System.out.println("Printing char activity started...");

        for (char ch = 'A'; ch <= 'G'; ch++) {
            System.out.println(ch);
            if (!Pause.seconds(3)) {
                return; // thread was interrupted
            }
        }

        System.out.println("Printing char activity completed...");
    }
}

public class P3 {

    public static void main(String[] args) {

        Addition ad = new Addition();
        PrintNum pn = new PrintNum();
        PrintChar pc = new PrintChar();

        ad.start();
        pn.start();
        pc.start();
    }
}
