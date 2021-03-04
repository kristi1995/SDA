package Zadania_podstawy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ZADANIE12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj tekst w jednej linii: ");
        String a = scanner.nextLine();
        double b = a.length();
        a=a.replaceAll(" ","");
        double c = a.length();
        System.out.println("Ilość spacji w tekście to: "+(b-c));
        System.out.println("Spacje to "+ ((b-c)/b)*100+"%");
    }
}
