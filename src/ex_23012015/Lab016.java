package ex_23012015;

public class Lab016 {
    public static void main(String[] args) {

//        Modulus and division concept

        double a = 27;
        double b = 7;
        double result = a%b; // Modulus operator - Remainder
        double result1 = a/b; // division operator - Quotient with decimal value, but in value will be used
        // with "int" keyword then it will not display decimal value(quotient.0)
        int result2 = (int) ((int) a/b); // first convert double into int then divide the value to get
        // division value in int means without decimal.

        System.out.println(result);
        System.out.println(Lab011.c);
        System.out.println(result1);
        System.out.println(Lab011.c);
        System.out.println(result2);
    }
}
