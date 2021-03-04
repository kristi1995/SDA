package Zadania_ksiazka;

import sun.jvm.hotspot.ui.tree.FloatTreeNodeAdapter;

import java.util.Scanner;

public class zadanie11_1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Podaj temperature w stopniach Celsujsza ");
        float a = scaner.nextFloat();
        float F = (float) (a*1.8+32);
        System.out.println("Temperatura zamieniona wskali Fahrenheita wynosi: "+F);
    }
}
