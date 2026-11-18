
public class P9 {

    public static void main(String[] args) {

        String str = "CodeNest Technologies";

        System.out.println(str);

        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());

        System.out.println(str.charAt(2));          // d

        System.out.println(str.contains("Nest"));  // true

        System.out.println(str.contains("nest"));  // false

        System.out.println(str.startsWith("Code")); // true

        System.out.println(str.startsWith("Nest")); // false

        System.out.println(str.endsWith("ies"));    // true

        System.out.println(str.endsWith("Code"));   // false

        System.out.println(str.indexOf("N"));       // 4

        System.out.println(str.indexOf("e"));       // 3

        System.out.println(str.indexOf("z"));       // -1

        System.out.println(str.length());           // 21

        System.out.println(str.replace('e', 'A'));

        System.out.println(str.substring(5));        // est Technologies

        System.out.println(str.substring(5, 14));   // est Techn

    }
}
