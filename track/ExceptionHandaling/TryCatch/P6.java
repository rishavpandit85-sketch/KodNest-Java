
import java.util.Scanner;

class UnderAgeException extends Exception {

    UnderAgeException() {
        super("You are too young... still have time");
    }
}

class OverAgeException extends Exception {

    OverAgeException() {
        super("You are too old... take rest");
    }
}

class DrivingLicence {

    int age;

    void takeUserAge(Scanner scan) {

        System.out.print("Enter your age: ");
        age = scan.nextInt();
    }

    void verify() throws UnderAgeException, OverAgeException {

        if (age < 18) {

            throw new UnderAgeException();

        } else if (age > 65) {

            throw new OverAgeException();

        } else {

            System.out.println("Driving Licence will be issued...");
        }
    }
}

public class P6 {

    public static void main(String[] args) {

        DrivingLicence dl = new DrivingLicence();

        try (Scanner scan = new Scanner(System.in)) {

            dl.takeUserAge(scan);

            try {

                dl.verify();

            } catch (UnderAgeException | OverAgeException e1) {

                System.out.println(e1.getMessage());
            }
        }
    }
}
