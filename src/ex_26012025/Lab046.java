package ex_26012025;

import java.util.Locale;

public class Lab046 {
    public static void main(String[] args) {
        String name = "Singh";  // Assignment Operator method
        // String? - Bunch of character - collection of  Characters
        String name2 = new String("Singh");  // New Operator method

        // how many ways String can me made - 2

        System.out.println(name.toLowerCase());
        System.out.println(name2.length());
        System.out.println(name2.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(10));  // Index 10 out of bounds for length 5
    }
}
