package ex_24012025;

public class Lab018 {
    public static void main(String [] args){

        // Escape Character
        char c = '\n'; // Two new lines will be added
        char c1 = '\t';
        char c2 = '\b';
        char c3 = '\r';



        /**
         * '\n' - Two new lines will be added
         * '/t' - Add tab space
         * '\b' - Backlash, delete 1 character
         * '\r' - Backlash, print things after this value -- carriage return()
         * '\f' - Form Feed
         * '\'' - single quote
         * '\"' - double quote
         * '\r' -
         */

        System.out.println("Anand" + c2 + "Singh");
        System.out.println(c);
        System.out.println("Anand" + c3+ "Kumar"+ c3 + "Singh");
        System.out.println(c);
        System.out.println("Anand" + c1 + "Singh");
        System.out.println(c);
        System.out.println("Anand" + c + "Singh");


    }
}
