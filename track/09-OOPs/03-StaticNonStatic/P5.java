
class Mobile {

    static {
        System.out.println("1st Static Block Executed");
    }

    static {
        System.out.println("2nd Static Block Executed");
    }

    static {
        System.out.println("3rd Static Block Executed");
    }

    String name = "Mobile";

    {
        System.out.println(name + " display initialized");
    }

    {
        System.out.println(name + " battery initialized");
    }

    {
        System.out.println(name + " camera initialized");
    }
}

public class P5 {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();

        // Use the objects
        System.out.println(m1.name);
        System.out.println(m2.name);
        System.out.println(m3.name);
    }
}
