
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}

public class P1 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            // Read the name and two numbers
            String name = scanner.next();
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            // Create one object
            MethodDemo obj = new MethodDemo();

            // Call all four methods
            obj.sayHello();
            obj.greet(name);

            int lucky = obj.getLuckyNumber();
            int sum = obj.add(first, second);

            System.out.println("Lucky Number: " + lucky);
            System.out.println("Sum: " + sum);
        }
    }
}
