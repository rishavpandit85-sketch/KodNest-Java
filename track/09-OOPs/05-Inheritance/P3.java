class Parent {

    Parent() {
        System.out.println("Inside Parent Constructor");
    }
}

class Child extends Parent {

    Child() {
        super();
        System.out.println("Inside Child Constructor");
    }
}

public class P3 {

    public static void main(String[] args) {
        Child c1 = new Child();
        System.out.println("Object created successfully: " + c1.getClass().getSimpleName());
    }
}
