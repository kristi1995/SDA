package Zadania_podstawy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zadanie11 {
    public static void main(String[] args) {
        List<String> listaSlow = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int dlugoscNajdluzszegoTekstu=0;
        String tekst="";
        String a="";
        do{
        System.out.println("Podaj swój tekst tak długo aż wpiszesz słowo - Starczy który zakończy wpisywanie: ");
        tekst = scanner.nextLine();
        if(tekst.length()>dlugoscNajdluzszegoTekstu && !tekst.equals("Starczy")){
            dlugoscNajdluzszegoTekstu=tekst.length();
            a = tekst;
        }

    }while(!tekst.equals("Starczy"));
        System.out.println(a);
        System.out.println(dlugoscNajdluzszegoTekstu);
    }
}


