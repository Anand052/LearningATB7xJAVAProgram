package ex_29012025;

import java.util.Scanner;

public class Lab084 {
    public static void main(String[] args) {
        // Larger number between 3 numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1");
        int num1 = sc.nextInt();

        System.out.println("Enter the Num2");
        int num2 = sc.nextInt();

        System.out.println("Enter the Num3");
        int num3 = sc.nextInt();

        // num1 > num2 && num1>num3 --> num1
        // num2 > num1 && num1>num2 --> num2
        // num3 > num1 && num3>num2 --> num3

        if(num1 > num2 && num1 > num3){
            System.out.println(num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }


    }
}
