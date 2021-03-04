package Zadania_ksiazka;

import java.util.Scanner;

public class zadanie12_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe typu całkowitego ");
        int a;
        a = scanner.nextInt();
        scanner.close();
        StringBuilder liczba = new StringBuilder();
        liczba.append(a).reverse();
        StringBuilder wynik = new StringBuilder();
        wynik.append(a).append("-").append(liczba).append("=").append(a-Integer.parseInt(liczba.toString()));
        System.out.println(wynik);
    }
}
