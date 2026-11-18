
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

public class P6 extends Animal {

    @Override
    void eat() {
        System.out.println("Tiger hunts and eats");
    }
}
