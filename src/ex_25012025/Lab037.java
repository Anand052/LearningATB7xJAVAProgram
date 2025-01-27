package ex_25012025;

public class Lab037 {
    public static void main(String[] args) {

        long phone_no = 987654321l;

        // short s= phone_no; // Implicit narrwing
        short s1 = (short)phone_no;

        System.out.println(s1);
    }
}
