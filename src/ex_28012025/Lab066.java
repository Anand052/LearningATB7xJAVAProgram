package ex_28012025;

import java.util.Scanner;

public class Lab066 {
    public static void main(String[] args) {
        // Take user input and check if it is even or odd

        // logic building
        /**
         * 1. Figure out the inputs-- Scanner class will help to take input- prebuild class
         * 2. Data type -- int
         * // nextInt() - Input
         * Do we need conversion or directory
         * Rough logic
         * optimize
         */
// Only work with 1 one
        Scanner sc = new Scanner(System.in); // Object of the scanner class - OOPs Concept
        System.out.println("Enter the num 1");
        int user_input = sc.nextInt();

        System.out.println("Enter the num 2");
        int user_input2 = sc.nextInt();
//        System.out.println(user_input%3);
//        System.out.println(user_input%2);
//        System.out.println(user_input%4);
        System.out.println(user_input);

        if (user_input%2 == 0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
}
