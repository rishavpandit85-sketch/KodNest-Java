
public class P17 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");

        System.out.println(sb1);

        sb1.append("Program");

        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder();

        sb2.ensureCapacity(100);

        System.out.println(sb2.capacity());
    }
}
