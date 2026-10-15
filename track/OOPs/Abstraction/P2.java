
interface Shape {

    void input();

    void disp();
}

class Square implements Shape {

    @Override
    public void input() {
        System.out.println("Input");
    }

    @Override
    public void disp() {
        System.out.println("disp");
    }
}

public class P2 {

    public static void main(String[] args) {
        Square s = new Square();
        s.input();
        s.disp();

        Shape ref = s;

        ref.input();
        ref.disp();
    }
}
