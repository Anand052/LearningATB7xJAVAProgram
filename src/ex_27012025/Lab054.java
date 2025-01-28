package ex_27012025;

public class Lab054 {
    public static void main(String[] args) {

        String s1 = new String("Anand");
        String s2 = new String("Anand");
        String s3 = new String("Anand");
        //3, Heap area

        System.out.println(s1==s2); // false as all strings are created so reference is not same, new always create new memory
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equals(s3));
    }
}
