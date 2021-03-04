package Zadania_podstawy;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę pierwszą: ");
        float a = Float.parseFloat(scanner.nextLine());
        System.out.println("Podaj znak z dostępnych + - / *");
        String znak = scanner.nextLine();
        System.out.println("Podaj drugą liczbę ");
        float b = Float.parseFloat(scanner.nextLine());
        switch (znak){
            case "+":
                System.out.println("Wynik dodawania liczby "+a+" "+b+" to "+(a+b));
            break;
            case "-":
                System.out.println("Wynik odejmowania liczby "+a+" "+b+" to "+(a-b));
                break;
            case "*":
            System.out.println("Wynik mnożenia liczby "+a+" "+b+" to "+(a*b));
            break;
            case "/":
                System.out.println("Wynik dzielenia liczby "+a+" "+b+" to "+(a/b));
                break;
            default:
                System.out.println("Błędny znak!!!");
        }
    }
}
