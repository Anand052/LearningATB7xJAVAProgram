package ex_27012025;

public class Lab053 {
    public static void main(String[] args) {

        String name = "Anand Kumar Singh"; //1, SCP
        String name1 = "Anand Kumar Singh"; //1, SCP

        String name2 = new String("Anand Kumar Singh"); //2, Heap area
        String name3 = new String("Anand Kumar Singh"); //3, Heap area

        System.out.println(name == name1); // true as reference is same, it check for reference
        System.out.println(name == name2); // false as reference is different, it check for reference

        System.out.println(name.equals(name1)); // true as content is same, it check for object to compare the string.
        System.out.println(name.equals(name2)); // true as content is same



    }
}
