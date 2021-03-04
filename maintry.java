package Zadania_ksiazka;

import java.util.Scanner;

public class maintry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ile stopni chcesz uzyskać Pi/twoja liczba ");
        float a = scanner.nextFloat();
        scanner.close();
        trygonometria alfa = new trygonometria(Math.PI/a);
        System.out.println("Sin(alfa)= "+alfa.sin());
        System.out.println("Cos(alfa)= "+alfa.cos());
        System.out.println("Tan(alfa)= "+alfa.tan());
    }
}
