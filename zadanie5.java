package Zadania_podstawy;

import java.util.Scanner;

public class zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę ");
        int licznik=0;
        int a = scanner.nextInt();
        for(int i = 2; i<=a; ++i){
            System.out.println("liczba "+i);
            for(int j=1;j<i;++j){
                if(i%j==0){
                   licznik++;
                }
                if(licznik >2){
                    System.out.println("Liczba "+i+" nie jest liczbą pierwszą");
                    licznik =0;
                    break;
                }
            }

        }

    }
}
