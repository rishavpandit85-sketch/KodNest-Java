
class OS {

    OS() {
        System.out.println("OS is installed");
    }

    void checkOS() {
        System.out.println("OS is still executing");
    }
}

class Mobile {

    OS o = new OS();

    Mobile() {
        System.out.println("Mobile created with OS");
    }
}

public class P10 {

    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.o.checkOS();

        m = null;

        if (m == null) {
            System.out.println("Mobile reference is null");
        }
    }
}
