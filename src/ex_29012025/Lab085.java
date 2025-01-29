package ex_29012025;

import java.util.Scanner;

public class Lab085 {
    public static void main(String[] args) {

//        char ch = 'a';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check character is vowel or Consonant");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Character is Vowel");
        }else{
            System.out.println("Character is Consonants");
        }
    }
}
