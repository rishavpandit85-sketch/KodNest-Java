
class Student {

    String name;
    int age;
    double height;

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class P9 {

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Raja";
        s1.age = 18;
        s1.height = 5.5;

        s1.display();

        Student s2 = new Student();

        s2.name = "Rani";
        s2.age = 18;
        s2.height = 4.4;

        s2.display();
    }
}
