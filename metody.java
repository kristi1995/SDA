import java.util.Scanner;

public class metody {
    //piszemy metody przed psvm
    static int dzial1(int arg1, int arg2){
        return arg1 +arg2;
    }
    static int dzial2(int arg1, int arg2){
        return arg1 - arg2;
    }
    static int dzial3(int arg1, int arg2){
        return arg1*arg2;
    }
    static int dzial4(int arg1, int arg2){
        return arg1/arg2;
    }
    //wywolujemy tutaj
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę?");
        Integer pierwLicz = Integer.valueOf(scan.nextLine());
        System.out.println("Podaj drugą liczbę?");
        Integer drugLicz = Integer.valueOf(scan.nextLine());


        System.out.println("Wynik dodawania " +dzial1(pierwLicz,drugLicz));
        System.out.println("Wynik odejmowania "+ dzial2(pierwLicz,drugLicz));
        System.out.println("Wynik mnożenia "+ dzial3(pierwLicz,drugLicz));
        System.out.println("Wynik dzielenia "+ dzial4(pierwLicz,drugLicz));
    }
}
