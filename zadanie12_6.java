package Zadania_ksiazka;

import java.util.Scanner;

public class zadanie12_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wektor postaci [a,b,c] ");
        String wektor = scanner.nextLine().trim();
        scanner.close();
        StringBuilder t = new StringBuilder(wektor);
        t.deleteCharAt(0).deleteCharAt(t.length()-1);
        int poz = t.indexOf(",");
        int poz2 = t.lastIndexOf(",");
        double a = Double.parseDouble(t.substring(0,poz));
        double b = Double.parseDouble(t.substring(poz+1,poz2));
        double c = Double.parseDouble(t.substring(poz2+1));
        System.out.println("Długość wektora o współrzędnych: "+a+" "+b+" "+c+" wynosi "+Math.sqrt(a*a+b*b+c*c));


    }
}
