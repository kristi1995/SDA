package Zadania_podstawy;

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        System.out.println();
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            //System.out.println(i);
            if(i % 3 == 0 && i/7==0){
                System.out.println("Pif paf");
            }
            else if (i % 3 == 0) {
                System.out.println("Pif");
            } else if (i % 7 == 0) {
                System.out.println("Paf");
            } else {
                System.out.println(i);
            }
        }
    }
}
