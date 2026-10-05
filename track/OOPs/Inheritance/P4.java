
class Parent {

    int parentA = 10;
}

class Child extends Parent {

    int childA = 20;

    void display() {
        System.out.println("Parent a: " + parentA);
        System.out.println("Child a: " + childA);
    }
}

public class P4 {

    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
