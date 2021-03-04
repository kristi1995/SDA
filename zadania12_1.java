package Zadania_ksiazka;

import java.util.Scanner;

public class zadania12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współczynniki a,b,c ");
        double a,b,c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        double delta = Math.pow(b,2)-4*b*c;
        StringBuilder point =
                new StringBuilder("Wierzchołek Paraboli wynosi (");
        point.append(-b / (2 * a)).append(", ").
                append(-delta/(4*a)).append(")");
        System.out.println(point);

    }
}
