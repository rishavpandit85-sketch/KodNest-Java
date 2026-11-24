
import java.util.ArrayList;
import java.util.Scanner;

public class P5 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = scan.nextInt();

        System.out.println("Enter the element : ");
        for (int i = 1; i <= n; i++) {
            int element = scan.nextInt();
            al.add(element);
        }

        System.out.print("Array List : ");
        System.out.println(al);

        System.out.println("Traverse using for loop : ");
        for (int i = 0; i <= al.size() - 1; i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();

        System.out.println("Traverse using ADV-for loop : ");
        for (Integer x : al) {
            System.out.print(x + " ");
        }
    }
}
