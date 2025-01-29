package ex_29012025;

import java.util.Scanner;

public class Lab083 {
    public static void main(String[] args) {
        // Program to check if Number is Positive or Negative or zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number, Iwill tell it is positive, negative or zero");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("Number is Postive");
        }else if(num < 0){
            System.out.println("Number is Negative");
        }else{
            System.out.println("Number is Zero");
        }
    }
}
