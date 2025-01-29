package ex_28012025;

import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {
        // GRADE CALCULATOR(lab090)
        /**
         * Write a program that calculates and displays the letter grade for a given numerical score
         * (e.g., A, B, C, D, E, F) based on following grading scale:
         * A: 90-100
         * B: 80-89
         * C: 70-79
         * D: 60-69
         * E: 50-59
         * F: 0-49
         */

        // User inputs- Score - data type - int -> return - grade - data type - char
        // Scanner class-
        // Basic logic- if(score >=90 && score <= 100) --> return grede - A
        // else if(score >=80 && score <= 89) --> return grede - B
        // else if(score >=70 && score <= 79) --> return grede - C
        // else(score >=0 && score <= 49) --> return grede - F

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter num");
//        int num = sc.nextInt();
//
//        if (num>=90 && num<=100){
//            System.out.println("Grade is --> A");
//        } else if (num>= 80 && num <90) {
//            System.out.println("Grade is --> B");
//        }else if (num>= 70 && num <80) {
//            System.out.println("Grade is --> C");
//        }else if (num>= 60 && num <70) {
//            System.out.println("Grade is --> D");
//        }else if (num>= 50 && num <60) {
//            System.out.println("Grade is --> E");
//        }else {
//            System.out.println("Grade is --> F");
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score");
        int score = sc.nextInt();

        char grade = 'F';

        if(score >= 90 && score <=100){
            grade = 'A';
        } else if (score >=80 && score <= 89) {
            grade = 'B';
        }else if (score >=70 && score <= 79) {
            grade = 'C';
        }else if (score >=60 && score <= 69) {
            grade = 'D';
        }else if (score >=50 && score <= 59) {
            grade = 'E';
        }else if (score < 0 || score > 100) {
            grade = 'O';
        }else {
            grade = 'F';
        }
        System.out.println("Your grade is --> "+ grade);

    }
}
