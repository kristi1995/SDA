package Zadania_podstawy;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanie10 {
    public static void main(String[] args) {
        int x, wynik;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wartosc x");
        x = scanner.nextInt();

        wynik = 0;
        while (x != 0) {
            wynik += x%10;
            x /= 10;
        }

        System.out.println("suma cyfr podanej liczby wynosi " + wynik);
    }
}
