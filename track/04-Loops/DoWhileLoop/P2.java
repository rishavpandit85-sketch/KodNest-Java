
public class P2 {

    public static void main(String[] args) {

        int i = 1;

        do {

            int j = 1;

            do {
                System.out.print(i);
                j++;
            } while (j <= 5);

            System.out.println();
            i++;

        } while (i <= 5);
    }
}
