public class Lab0014 {
    public static void main(String[] args) {
        // Calculator

//        int a= 23;
//        int b= 47; "int should not be used as in calculator decimal value will also available in result"


        double a = 23;
        double b = 47;
        double sum = a+b;
        double sub = a-b;
        double mul = a*b;
        double div = a/b;

//      System.out.printf("Sumation is %f", sum);  "%d" is used for int, for float and double "%f" is used
//        "\n" will make the output in each line otherwise they will display as one after other due to "printf" formating concept is used
        System.out.printf("Sumation is %f\n", sum);
        System.out.printf("Substraction is %f\n", sub);
        System.out.printf("Multiply is %f\n", mul);
        System.out.printf("Division is %f\n", div);
    }
}
