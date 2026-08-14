
class Student {

    String name;
    int age;
    double height;

    // No-argument constructor
    Student() {
        name = null;
        age = 0;
        height = 0.0;
    }

    // One-parameter constructor
    Student(String name) {
        this.name = name;
    }

    // Three-parameter constructor
    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class P1 {

    public static void main(String[] args) {
        // Using three-parameter constructor
        Student s1 = new Student("Raja", 18, 5.5);
        System.out.println("Student 1:");
        s1.display();

        System.out.println();

        // Using one-parameter constructor
        Student s2 = new Student("Rani");
        System.out.println("Student 2:");
        s2.display();

        System.out.println();

        // Using no-argument constructor
        Student s3 = new Student();
        System.out.println("Student 3:");
        s3.display();
    }
}
