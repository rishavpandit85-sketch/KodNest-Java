
import java.util.Scanner;

class Addition extends Thread {

    @Override
    public void run() {
        System.out.println("Addition activity started and using a File");
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a :");
            int a = scan.nextInt();
            System.out.println("Enter b :");
            int b = scan.nextInt();
            int c = a + b;
            System.out.println("Addition Result is : " + c);
        }

        System.out.println("Addition activity completed and stopped using the File");
    }
}

class PrintChar extends Thread {

    @Override
    public void run() {
        System.out.println("Printing char activity started and using a file");

        for (char i = 'A'; i <= 'G'; i++) {
            System.out.println(i);
            if (!pause(3000)) {
                return;
            }
        }

        System.out.println("Printing char activity completed and stopped using file");
    }

    // Sleep kept in its own method, outside the loop
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

class PrintNum extends Thread {

    @Override
    public void run() {
        System.out.println("Printing num activity started and using a file");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (!PrintChar.pause(3000)) {
                return;
            }
        }

        System.out.println("Printing num activity completed and stopped using file");
    }
}

public class P5 {

    public static void main(String[] args) {
        System.out.println("Main Thread started and Opened a file");

        Addition ad = new Addition();
        PrintNum pn = new PrintNum();
        PrintChar pc = new PrintChar();

        ad.start();
        pn.start();
        pc.start();

        try {
            ad.join();
            pn.join();
            pc.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main Thread execution completed and closed a file");
    }
}
