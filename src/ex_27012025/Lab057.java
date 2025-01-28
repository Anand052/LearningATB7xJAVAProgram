package ex_27012025;

public class Lab057 {
    public static void main(String[] args) {

        String password = "Anand@123";
        String pass_u = password.toLowerCase();
        String pass_u1 = "Anand @123";
        //2, SOP
        // pass_u == password -> false,

        System.out.println(pass_u == password); // false
        System.out.println(pass_u.equals(password)); // false, one on lower & one in upper
        System.out.println(pass_u.equalsIgnoreCase(password)); // true, as now it's not checking case-sensitive
        // Anand@123, AnAnd@123, anand@123, AnanD@123, Anand@123, all will be pass
        // if there is space, then it will not match, we can use trim for this.
        System.out.println(pass_u.equalsIgnoreCase(pass_u1));


        System.out.println("---------------------------------");


        System.out.println(password.substring(0,3)); // range from 0 -(n-1) means 0-2
        System.out.println(password.indexOf('d'));
        System.out.println(pass_u.length());
        System.out.println(pass_u1.length());

    }
}
