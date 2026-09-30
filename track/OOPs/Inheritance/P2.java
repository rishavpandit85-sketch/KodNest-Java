
class Demo1 {

    int a = 10;

    void display() {
        System.out.println("Demo1 " + a);
    }
}

class Demo2 extends Demo1 {
}

public class P2 {

    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        d2.display();
    }
}
