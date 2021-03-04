package Zadania_ksiazka;

import java.util.Scanner;

public class zadanie12_5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Podaj wektor postaci [liczba,liczba] ");
        String wektor = scanner.nextLine().trim();
        scanner.close();
        StringBuilder temp = new StringBuilder(wektor);
        temp.deleteCharAt(0).deleteCharAt(temp.length()-1);
        int poz = temp.indexOf(",");
        double a = Double.parseDouble(temp.substring(0,poz));
        double b = Double.parseDouble(temp.substring(poz+1));
        System.out.println("Długość wektora wynosi "+ Math.sqrt(a*a+b*b));
    }
}

