
public class P21 {

    public static void main(String[] args) {

        int[] a = {10, 20, 40, 50};

        int index = 2;
        int element = 30;

        int[] res = new int[a.length + 1];

        for (int i = 0; i < res.length; i++) {

            if (i == index) {
                res[i] = element;
            } else if (i < index) {
                res[i] = a[i];
            } else {
                res[i] = a[i - 1];
            }
        }

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
