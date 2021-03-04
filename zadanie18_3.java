package Zadania_ksiazka;

public class zadanie18_3 {
    static int kostka() {
        return 1 + (int) (Math.random() * 6);
    }

    static int suma(int m, int n) {

        return m + n;
    }

    private static int[] wynik = new int[13];

    public static void main(String args[]) {

        System.out.println("Suma oczek w dwukrotnym rzucie kostkæ");

        /* Losowanie */

        for (int i = 0; i < 3000; ++i) {

            wynik[0] += 1;

//licznik losowa wynik[suma(kostka(), kostka())] += 1; // licznik wyników

        } /* Wynik */
        System.out.println("Liczba rzutów: " + wynik[0]);


    }
}
