package ex_21092025;

public class Lab008 {
    public static void main(String [] args){

        byte a = 127;
        System.out.println(a+'\n'); // 10 added as ASCII value of '\n' is 10
        System.out.println('\n');
        System.out.println(a);
        System.out.println('\n');

//        byte b = 128; // greater than 127 and byte contains from -127 to 127, must convert to int
        int b = 128;
        System.out.println(b);

        char c = 'c';
        System.out.println(c);

        char c1 = '$';
        System.out.println(c1);

        char c2 = '\n';
        System.out.println(c2); // It will print a new line in response

        char c3 = '\u1F6A';
        System.out.println(c3);
    }
}
