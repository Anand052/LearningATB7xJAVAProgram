package ex_26012025;

public class Lab040 {
    public static void main(String[] args) {

        int a = 10;
        int result = a++;

        System.out.println(a);

//        Exp: 10 , a= 11
        System.out.println(result);

        System.out.println("-------------------------");

        int b= 10;
        int result1 = ++b;

        System.out.println(b);

//      Exp: 11, a = 11
        System.out.println(result1);
    }
}
