
class P2 {

    static int a;
    static int b;

    int p;
    int q;

    static {
        System.out.println("Inside static-Block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("Inside nonStatic-Block");
        p = 100;
        q = 200;
    }

    static void disp1() {
        System.out.println("Inside static-Method");
        System.out.println(a);
        System.out.println(b);
    }

    void disp2() {
        System.out.println("Inside nonStatic-method");
        System.out.println(p);
        System.out.println(q);
    }

    public static void main(String[] args) {
        P2 pg = new P2();
        P2.disp1();
        pg.disp2();
    }
}
