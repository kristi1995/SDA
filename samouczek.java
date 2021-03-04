import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class samouczek {

    private static int getMyAge(){
        return 25;
    }
    private static String getMyName(){
        return "Krysia";
    }
    private static void printMatEquationResults(double arg1, double arg2) {
        System.out.println(arg1 + arg2);
        System.out.println(arg1 - arg2);
        System.out.println(arg1 * arg2);
    }
    private static boolean isEven(double number) {
        return number % 2 == 0;
    }
    private static double potega(double z){
        return Math.pow(z,3);
    }
    private static double pierw(double z){
        return Math.sqrt(z);
    }

    private static boolean troj(double a, double b, double c){
        return a+b>c;
    }
    public static void main(String[] args) {
        System.out.println(getMyAge());
        System.out.println(getMyName());
        printMatEquationResults(5, 7);
        System.out.println(isEven(8));
        System.out.println(potega(2));
        System.out.println(pierw(9));
        System.out.println(troj(3,4,5));



    }
}
