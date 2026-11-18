
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Monkey extends Animal {

    @Override
    void eat() {
        System.out.println("Monkey steals and eats");
    }

    void mSleep() {
        System.out.println("Monkey sleeps");
    }
}

class Tiger extends Animal {

    void tEat() {
        System.out.println("Tiger eats");
    }

    void tSleep() {
        System.out.println("Tiger sleeps");
    }
}

public class P7 {

    public static void main(String[] args) {

        Monkey m = new Monkey();
        m.eat();
        m.mSleep();

        Tiger t = new Tiger();
        t.tEat();
        t.tSleep();
    }
}
