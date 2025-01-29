package ex_29012025;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {


        /**
         * Leap Year program --> 2024
         */

//        int year = 2024;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year to check its leap or normal year");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            System.out.println("It's a leap year");
        } else {
            System.out.println("It's not a leap year");
        }
    }
}
