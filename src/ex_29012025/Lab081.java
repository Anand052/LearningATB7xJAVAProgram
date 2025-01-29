package ex_29012025;

import java.util.Scanner;

public class Lab081 {
    public static void main(String[] args) {
        // Write a program name, age, salary - print it

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.next();

        System.out.println("Enter Age");
        int age = sc.nextInt();

        System.out.println("Enter Salary");
        double salary = sc.nextDouble();

        System.out.println("Your name is --> " + name);
        System.out.println("Your age is --> " + age);
        System.out.println("Your salary is --> " + salary);


        sc.close();


    }
}
