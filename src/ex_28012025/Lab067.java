package ex_28012025;

import java.util.Scanner;

public class Lab067 {
    public static void main(String[] args) {
        // Max num bet 2 inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1");
        int num1 = sc.nextInt();

        System.out.println("Enter Num 2");
        int num2 = sc.nextInt();

//        System.out.println(Math.max(num1,num2));

        if(num1 > num2){
            System.out.println(num1);
        } else if (num1 < num2) {
            System.out.println(num2);

        } else{
            System.out.println("Both are equal");
        }
    }
}
