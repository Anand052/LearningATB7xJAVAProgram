package ex_27012025;

public class Lab050 {
    public static void main(String[] args) {

        String s1 = "Anand";
        String s2 = s1;

        System.out.println(s2); // Anand
        String s3 = s2.toLowerCase();

        System.out.println(s3); // anand
        System.out.println(s1); // Anand

        //2, SCP -> Anand, anand
    }
}
