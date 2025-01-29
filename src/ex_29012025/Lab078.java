package ex_29012025;

import java.util.Scanner;

public class Lab078 {
    public static void main(String[] args) {
//        int itemcode = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter itemcode");
        int itemcode = sc.nextInt();

        switch (itemcode){
            case 001 -> System.out.println("It's a laptop");
            case 002, 003 -> System.out.println("It's a desktop");
            case 004, 005, 006 -> System.out.println("It's a mobile");
            case 007 -> System.out.println("It's a mobile");
            default -> System.out.println("None");
        }

    }
}
