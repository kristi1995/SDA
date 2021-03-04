package Zadania_podstawy;

import java.util.Scanner;

public class zadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą małą literę ");
        char c = scanner.next().charAt(0);
        System.out.println("Podaj drugą małą literę " );
        char d = scanner.next().charAt(0);
        int a = (int) c;
        int b = (int) d;
        if(a>b){
            System.out.println(a-b);
        }else{
            System.out.println(b-c);
        }

    }
}
