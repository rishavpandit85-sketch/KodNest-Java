
class Parent {

    Parent() {
        System.out.println("Inside Parent constructor");
    }
}

class Child extends Parent {

    Child() {
        this(10);
        System.out.println("Inside 0-par constructor");
    }

    Child(int a) {
        this(10, 20);
        System.out.println("Inside 1-par constructor");
    }

    Child(int a, int b) {
        System.out.println("Inside 2-par constructor");
    }
}

public class P3_Constructor {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child);
    }
}
