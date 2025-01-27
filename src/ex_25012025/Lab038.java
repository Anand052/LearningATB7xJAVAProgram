package ex_25012025;

public class Lab038 {
    public static void main(String[] args) {

        int course = 100;
        float GST = 18.45F;
//        int total_price = course + GST;  // Implicit Narrowing - JVM
        int total_price = course + (int)GST;  // Loss of decimal value

        float full_price = course + GST;

        System.out.println(total_price);
        System.out.println(full_price);
    }
}
