package ex_29012025;

import java.util.Scanner;

public class Lab076 {
    public static void main(String[] args) {

        // Take a user input as char and tell the user if it is a vowel

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char character = sc.next().charAt(0);
        System.out.println(character);
        character = Character.toLowerCase(character);


        switch(character){
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Vovel");
            default:
                System.out.println("Consonant");


        }



    }
}
