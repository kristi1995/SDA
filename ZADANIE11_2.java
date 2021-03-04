package Zadania_ksiazka;

import java.util.Scanner;

public class ZADANIE11_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperature w stopniach Fahrenheita ");
        int a = scanner.nextInt();
        float C = (float) ((a-32)/1.8);
        System.out.println("Temperatura w stopnich Celsujsza wynosi: "+C);
    }
}
