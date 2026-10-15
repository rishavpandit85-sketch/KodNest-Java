
interface Calculator1 {

    void add();

    void sub();
}

interface Calculator2 extends Calculator1 {

    void mul();

    void div();
}

class MyCalculator implements Calculator2 {

    @Override
    public void add() {
        System.out.println("ADD");
    }

    @Override
    public void sub() {
        System.out.println("SUB");
    }

    @Override
    public void mul() {
        System.out.println("MUL");
    }

    @Override
    public void div() {
        System.out.println("DIV");
    }
}

public class P3 {

    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();

        calculator.add();
        calculator.sub();
        calculator.mul();
        calculator.div();
    }
}
