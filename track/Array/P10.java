
import java.util.Scanner;

public class P10 {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter Array size :");
            int n = scan.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter Array Elements :");
            for (int i = 0; i <= arr.length - 1; i++) {
                arr[i] = scan.nextInt();
            }

            System.out.println("Enter key to search :");
            int key = scan.nextInt();

            P10 p10 = new P10();
            p10.search(arr, key);
        }
    }

    void search(int arr[], int key) {

        boolean found = false;

        for (int i = 0; i <= arr.length - 1; i++) {

            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }
    }
}

class ArraySearch extends P10 {
}
