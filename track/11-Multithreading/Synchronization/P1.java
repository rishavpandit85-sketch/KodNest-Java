
class Printer implements Runnable {

    @Override
    public synchronized void run() {
        String threadName = Thread.currentThread().getName();
        try {
            System.out.println(threadName + " started using Printer");
            pause(3000);
            System.out.println(threadName + " is using Printer");
            pause(3000);
            System.out.println(threadName + " stopped using Printer");
            pause(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(threadName + " was interrupted");
        }
    }

    private static void pause(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}

public class P1 {

    public static void main(String[] args) {
        Printer pr = new Printer();

        Thread t1 = new Thread(pr, "Java Developer");
        Thread t2 = new Thread(pr, "Python Developer");
        Thread t3 = new Thread(pr, "C Developer");

        t1.start();
        t2.start();
        t3.start();
    }
}
