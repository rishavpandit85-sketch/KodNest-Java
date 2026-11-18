
import java.util.Scanner;

class Employee {

    public void displayRole(String role) {
        System.out.println("Employee " + role);
    }
}

class Developer extends Employee {

    @Override
    public void displayRole(String role) {
        System.out.println("Developer " + role);
    }
}

public class P8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String role = scanner.next();

        Developer developer = new Developer();
        developer.displayRole(role);
    }
}
