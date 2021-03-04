package Zadania_podstawy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zadanie18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst ");
        String tekst = scanner.nextLine();
        Pattern pattern = Pattern.compile("a+\\s+psik");
        Matcher matcher = pattern.matcher(tekst);
        boolean matchFound = matcher.matches();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
