package Zadania_podstawy;


import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ZADANIE17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj datę najblizszych zajęć w SDA");
        String a = scanner.nextLine();
        LocalDate zajecia = LocalDate.parse(a);
        LocalDate dzisiaj = LocalDate.now();
        Duration diff3 = Duration.between(zajecia.atStartOfDay(), dzisiaj.atStartOfDay());
       // long diff1 = zajecia.getMonthValue() - dzisiaj.getMonthValue();
        //long diff = zajecia.getDayOfMonth()- dzisiaj.getDayOfMonth();
       // long b = zajecia - dzisiaj;
        System.out.println(dzisiaj);
        System.out.println(zajecia);
        System.out.println(diff3.toDays());
    }
}
