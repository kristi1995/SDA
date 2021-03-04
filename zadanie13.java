package Zadania_podstawy;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój tekst 4 słowa ");
        String a = scanner.nextLine();
        Scanner input = new Scanner(a);
        String a1 = input.next();
        String a2 = input.next();
        String a3 = input.next();
        String a4 = input.next();
        System.out.println("Twój jąkający się tekst to: "+a1+" "+a1+" "+a2+" "+a2+" "+a3+" "+a3+" "+a4+" "+a4);

    }
 }

