package ex_25012025;

public class Lab034 {
    public static void main(String[] args) {

        byte a = 10;
        byte b = 23;

//        byte c = a+b; // byte + byte = int; so result should be in integer.

        int c = a+b;
        System.out.println(c);

        char a1 = 'A';
        char b1 = 'B';
        int c1 = a1 + b1; // ascii value - 65 + 66 = 131

        System.out.println(c1);
        System.out.println('A' == 65);
        System.out.println('B' == 66);
        System.out.println('B' == 69);

    }
}
