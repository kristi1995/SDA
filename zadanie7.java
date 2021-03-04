package Zadania_podstawy;

import java.util.Scanner;

public class zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę a>1: ");
        int a = scanner.nextInt();
        int jeden = 1;
        int dwa = 1;
        int pomoc = 1;
            for(int i=2;i<a;i++){
                pomoc = jeden +dwa;
                jeden= dwa;
                dwa = pomoc;

            }
        System.out.println(pomoc);
    }
}
