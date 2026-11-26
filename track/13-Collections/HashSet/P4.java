
import java.util.HashSet;
import java.util.Objects;

class Student {

    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student s = (Student) obj;
        return this.roll == s.roll && Objects.equals(this.name, s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    @Override
    public String toString() {
        return roll + " " + name;
    }
}

public class P4 {

    public static void main(String[] args) {
        Student s1 = new Student(11, "Arjun");
        Student s2 = new Student(12, "Ravi");
        Student s3 = new Student(11, "Arjun");

        HashSet<Student> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        System.out.println(hs);

        for (Student s : hs) {
            s.display();
        }
    }
}
