package Zadania_podstawy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanie16 {

    public static void main(String[] args) {
        int licznik = 1, d, b;
        List<Integer> liczby = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę typu int");
            int a = scanner.nextInt();
            liczby.add(a);

        }
        for (int c = 0; c < 10; c++) {
            for (int j = c + 1; j < 10; j++) {
                if (liczby.get(c) < liczby.get(j)) {
                    licznik++;
                } else {
                    System.out.println("Błąd");
                }

            }System.out.println(licznik);

        }
    }
}
