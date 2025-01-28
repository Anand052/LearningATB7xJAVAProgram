package ex_27012025;

public class Lab055 {
    public static void main(String[] args) {

        String s1 = "Anand";

        char c = s1.charAt(4);
        System.out.println(c);

        s1.concat("Kumar");

        System.out.println(s1); // Anand as concat value is not storing

        s1 = s1.concat("Singh");

        System.out.println(s1);
    }
}
