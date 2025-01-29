package ex_29012025;

import java.util.Scanner;

public class Lab080 {
    public static void main(String[] args) {

        // Switch can return something (Lab100)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code");
        char code = sc.next().charAt(0);
        code = Character.toUpperCase(code);
//        char code = 'A';
        int val = switch(code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;
            case 'G':
                yield 69;
            case 'Z':
                yield 86;
            default:
                throw new IllegalStateException("Unexpected value" + code);
        };
        System.out.println(val);

    }
}
