package Zadania_ksiazka;

import java.util.Scanner;

public class zadanie11_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię nazwisko pracownika oraz  ilość przepracowanych godzini i stawkę godzinową ");
        String a = scanner.nextLine();
        Scanner input = new Scanner(a);
        String a1 = input.next();
        String a2 = input.next();
        int a3 = input.nextInt();
        double a4 = input.nextDouble();
        System.out.println("Pracownik "+a1 +" " +a2+" zarabia "+ a3*a4);
    }
}
