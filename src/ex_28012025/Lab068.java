package ex_28012025;

import java.util.Scanner;

public class Lab068 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("You can go GOA");
        } else if (age < 18) {
            System.out.println("You cannot go GOA");
        }else {
            System.out.println("Wait");
        }
    }
}
