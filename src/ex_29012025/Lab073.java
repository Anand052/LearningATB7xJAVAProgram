package ex_29012025;

import java.util.Scanner;

public class Lab073 {
    public static void main(String[] args) {
        /**
         * Triangle Classifier:
         * Write a program that classifies a triangle based on its side lengths.
         * Given three input values representing the length of sides.
         * If triangle is equilateral(all sides are equal).
         * If triangle is isosceles(exactly 2 sides are equal).
         * If triangle is scalene(no sides are equal).
         * Use If-else statement to classify the triangle.
         * side1, side2, side3 -->
         */


        // STILL WRONG ALL CONDITION NOT COVER

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1");
        int side1 = sc.nextInt();

        System.out.println("Enter side2");
        int side2 = sc.nextInt();

        System.out.println("Enter side3");
        int side3 = sc.nextInt();

        if (side1 == side2) {
            if (side2 == side3) {

                System.out.println("Triangle is Equilateral");

            } else if (side2 != side3) {
                System.out.println("Triangle is Isosceles");

            }
        } else if (side1 != side2) {
            if (side2 == side3) {

                System.out.println("Triangle is Isoceles");
            } else if (side2 != side3) {
                System.out.println("Triangle is Scalene");
            }

        } else if (side1 == side3) {
            if (side2 != side1) {

                System.out.println("Triangle is Isoceles");
            }
        }
    }
}
