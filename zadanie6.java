package Zadania_podstawy;

import java.util.Scanner;

public class zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n ");
        int n = scanner.nextInt();
        float suma=0;
        for (int i = 1; i <= n; i++) {
                suma = suma + (1 / ((float) i));

        }System.out.println(suma);
    }
}

