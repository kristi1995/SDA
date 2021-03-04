package Zadania_podstawy;

import java.util.Scanner;

public class Rownaniekwadratowe {
    public static void main(String[] args) {


        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartość a ");
        a = scanner.nextFloat();
        System.out.println("Podaj wartość b ");
        b = scanner.nextFloat();
        System.out.println("Podaj wartość c ");
        c = scanner.nextFloat();
        if(a != 0){
            double delta = b*b;
            if (delta<0){
                System.out.println("BRAK ROZIĄZAŃ!!!");
            }else if (delta == 0){
                double x = (-b/(2*a));
                System.out.println("MAMY JEDNO ROZWIĄZANIE x "+x);
            }else {
                double x1 = ((-b+Math.sqrt(delta))/2*a);
                double x2 = ((-b-Math.sqrt(delta))/2*a);
                System.out.println("Mamy dwa różne rozwiązania x1 i x2 "+x1+" "+x2);

            }

        }else if (a==0) {
            System.out.println("Parametr a =0 to nie jest równanie kwadratowe!!!!");

        }

    }
}
