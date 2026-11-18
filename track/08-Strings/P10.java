
public class P10 {

    public static void main(String[] args) {

        String s1 = "Raja";

        System.out.println(s1.isEmpty());  // false
        System.out.println(s1.isBlank());  // false

        String s2 = "";

        System.out.println(s2.isEmpty());  // true
        System.out.println(s2.isBlank());  // true

        String s3 = " ";

        System.out.println(s3.isEmpty());  // false
        System.out.println(s3.isBlank());  // true
    }
}
