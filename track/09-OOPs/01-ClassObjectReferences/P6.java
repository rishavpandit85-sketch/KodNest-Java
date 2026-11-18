
class Student {

    String name;
    int age;
    double height;

    void input(String a, int b, double c) {
        name = a;
        age = b;
        height = c;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class P6 {

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.input("Raja", 18, 5.5);

        s1.display();
    }
}
