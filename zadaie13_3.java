package Zadania_ksiazka;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadaie13_3 {
    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę ");
        int a,b;
        a = scanner.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        b = scanner.nextInt();
        if(a>b){
            for(int i =(b-1); i<a; i++){
                int c = i;
                c++;
               liczby.add(c);
            }
            System.out.println(liczby);
        } else {
            for(int i =(a-1); i<b; i++){
                int d = i;
                d++;
                liczby.add(d);
            }
            System.out.println(liczby);

        }
    }
}
