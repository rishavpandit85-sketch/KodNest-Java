class Demo {

    int a;

    Demo() {
        System.out.println("Constructor executed...");
    }

    static {
        System.out.println("Static Block executed...");
    }

    {
        a = 10;
        System.out.println("NONStatic Block executed...");
    }
}

public class P6 {

    public static void main(String[] args) {

        Demo d1 = new Demo();
        System.out.println("Value of a: " + d1.a);

    }
}
