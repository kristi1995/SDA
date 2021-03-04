package Zadania_ksiazka;

import java.util.Scanner;

public class zadanie11_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość pierwszej przyprostokątnej: ");
        int a = scanner.nextInt();
        System.out.println("Podaj długość drugiej przyprostokątnej: ");
        int b = scanner.nextInt();
        float c2 = (float) (Math.pow(a,2)+Math.pow(b,2));
        float c = (float) Math.sqrt(c2);
        System.out.format("Długość przeciwprostokątnej wynosi: %1.3f",c);
    }
}
