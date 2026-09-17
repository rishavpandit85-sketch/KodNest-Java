class Student {

    static int count = 0;
    int id;

    Student() {
        count++;
        id = count;
    }
}

public class P4 {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println("Student 1 ID: " + s1.id);
        System.out.println("Student 2 ID: " + s2.id);
        System.out.println("Student 3 ID: " + s3.id);

        System.out.println("Number of students: " + Student.count);
    }
}
