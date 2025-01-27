package ex_25012025;

public class Lab036 {
    public static void main(String[] args) {

        //Casting -- Source & Destination conversion
        // Type -> Widening - Implicit, Explicit  - lossless
        // -> Narrowing - Implicit, Explicit(with data type) - loss of data

    byte b = 10;
    // Widening

    int a = b; // Valid Implicit Casting - JVM to this, widening

        int a1 = (int)b;  // Valid Explicit Casting

        // Narrowing

        int val = 300;
//        byte b1 = val; // Invalid Implicit casting can't be done to smaller bucket called as narrowing

        byte b2 = (byte)val;  // Invalid Explicit casting, only 44 value will be stores -- Loss of data


        System.out.println(b2);
    }
}
