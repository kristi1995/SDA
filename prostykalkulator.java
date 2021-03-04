import java.util.Scanner;

public class prostykalkulator {
    double a, b;

    private static void wynikDzialan(double arg1, double arg2) {
        System.out.println("Wynik dodawania "+(arg1 + arg2));
        System.out.println("Wynik odejmowania "+(arg1 - arg2));
        System.out.println("Wynik mnożenia "+(arg1*arg2));
        System.out.println("Wynik dzielenia :"+(arg1/arg2));
    }

    public static void main(String[] args) {
        wynikDzialan(5,7);
    }
}

