
import java.util.Scanner; //StringReverse

public class P20 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = scan.next();

        char arr[] = str.toCharArray();
        char newArr[] = new char[arr.length];

        int j = newArr.length - 1;

        for (int i = 0; i <= arr.length - 1; i++) {
            newArr[j] = arr[i];
            j--;
        }

        String revStr = new String(newArr);

        System.out.println("Original String is " + str);
        System.out.println("Reversed String is " + revStr);
    }
}
