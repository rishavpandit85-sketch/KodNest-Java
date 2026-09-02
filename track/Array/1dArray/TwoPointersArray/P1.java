
import java.util.*;

public class P1 {

    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50, 60};

        int left = 0;
        int right = a.length - 1;

        System.out.println("Original Array :");
        System.out.println(Arrays.toString(a));

        while (left < right) {

            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        System.out.println("After swapping :");
        System.out.println(Arrays.toString(a));
    }
}
