
class Hospital implements Runnable {

    private static final String RES1 = "Bed";
    private static final String RES2 = "Doctor";

    private final Object bedLock = new Object();
    private final Object doctorLock = new Object();

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        if (threadName.equals("TOM")) {
            tomTreatment();
        } else {
            jerryTreatment();
        }
    }

    void tomTreatment() {
        try {
            synchronized (bedLock) {
                System.out.println("Tom has occupied " + RES1);
                pause(3000);

                synchronized (doctorLock) {
                    System.out.println("Tom has occupied " + RES2);
                    pause(3000);
                }
                System.out.println("Tom has released " + RES2);
            }
            System.out.println("Tom has released " + RES1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Tom was interrupted");
        }
    }

    void jerryTreatment() {
        try {
            synchronized (doctorLock) {
                System.out.println("Jerry has occupied " + RES2);
                pause(3000);

                synchronized (bedLock) {
                    System.out.println("Jerry has occupied " + RES1);
                    pause(3000);
                }
                System.out.println("Jerry has released " + RES1);
            }
            System.out.println("Jerry has released " + RES2);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Jerry was interrupted");
        }
    }

    private static void pause(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }
}

public class P2 {

    public static void main(String[] args) {
        Hospital h = new Hospital();

        Thread t1 = new Thread(h, "TOM");
        Thread t2 = new Thread(h, "JERRY");

        t1.start();
        t2.start();
    }
}
