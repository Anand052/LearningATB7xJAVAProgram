package ex_29012025;

import java.util.Scanner;

public class Lab086 {
    public static void main(String[] args) {
        /**
         * FIZZBUZZ Test
         * Write a program that prints number from 1 to 100. However, for multiples of 3, print "FIZZ"
         * insteadof number, and for multiples of 5, print "BUZZ". For number that are multiple of both 3 & 5,
         * print "FIZZBUZZ"
         */

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter num");
//        int num = sc.nextInt();

        for(int num=1; num<= 100;num++) {
                if(num % 3 == 0 && num % 5 == 0){
                    System.out.println("FIZZBUZZ");
                } else if (num % 5 == 0) {
                    System.out.println("BUZZ");
                } else if (num % 3 == 0) {
                    System.out.println("FIZZ");
                }else{
                System.out.println(num);
            }


        }

    }
}
