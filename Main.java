package Zadania_podstawy;


import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj średnice d: ");
        Scanner scanner = new Scanner(System.in);
        float wynik = Float.parseFloat(scanner.nextLine());
        System.out.println("obwod wynosi "+ obwodOkregu.obwodOkregu(wynik));


    }

}
