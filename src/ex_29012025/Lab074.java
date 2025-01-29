package ex_29012025;

import java.util.Scanner;

public class Lab074 {
    public static void main(String[] args) {
        // If Else - Condition(If, else, else if) - multiple condition

        // Switch - Better condition for 2+ condition- must be byte,short, int,  long(with its Wropper type),enums
        // and String.
        // Which day it is?- Day from 1 to 7
        // 3 --> Wed, 5 --> Fri
        // MTWTFSS

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1 to 7, will tell what day it is");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("SUN");
                break;
            default:
                System.out.println("No idea what it is");
        }
        System.out.println("Outside the Switch loop");
    }


}
