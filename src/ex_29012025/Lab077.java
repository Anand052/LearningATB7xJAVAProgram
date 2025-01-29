package ex_29012025;

import java.util.Scanner;

public class Lab077 {
    public static void main(String[] args) {


//        int itemcode = 010;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter itemcode");
        int itemcode = sc.nextInt();

        switch(itemcode){
            case 001, 002, 003:
                System.out.println("It is Electronic gadget");
                break;
            case 004, 005, 007:
                System.out.println("It is Mechanical gadget");
                break;
            default:
                System.out.println("None");
        }


    }
}
