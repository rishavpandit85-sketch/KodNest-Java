class Parent5 {

    void disp1() {
        System.out.println("Inside Parent disp1");
    }

    void disp2() {
        System.out.println("Inside Parent disp2");
    }
}

class Child5 extends Parent5 {

    @Override
    void disp2() {
        System.out.println("Inside Child disp2");
    }

    void disp3() {
        System.out.println("Inside Child disp3");
    }
}

public class P5 {

    public static void main(String[] args) {
        Child5 c = new Child5();

        c.disp1();
        c.disp2();
        c.disp3();
    }
}
