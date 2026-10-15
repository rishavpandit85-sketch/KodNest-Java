
abstract class Parent {

    abstract void disp1();

    abstract void disp2();
}

class Child1 extends Parent {

    @Override
    void disp1() {
        System.out.println("Inside Child1 disp1");
    }

    @Override
    void disp2() {
        System.out.println("Inside Child1 disp2");
    }
}

class Child2 extends Parent {

    @Override
    void disp1() {
        System.out.println("Inside Child2 disp1");
    }

    @Override
    void disp2() {
        System.out.println("Inside Child2 disp2");
    }
}

public class P1 {

    public static void main(String[] args) {

        Parent ref1 = new Child1();
        Parent ref2 = new Child2();

        ref1.disp1();
        ref1.disp2();

        ref2.disp1();
        ref2.disp2();
    }
}
