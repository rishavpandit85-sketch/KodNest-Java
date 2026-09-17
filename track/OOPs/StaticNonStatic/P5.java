class Mobile {

    static {
        System.out.println("Mobile class loaded");
    }

    static {
        System.out.println("Mobile OS loaded");
    }

    static {
        System.out.println("Mobile software loaded");
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

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();
    }
}
