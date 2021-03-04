package Zadania_podstawy;

import java.util.*;

public class zadanie15 {
    public static void main(String[] args) {
        List<Integer> liczby= new ArrayList<>();
        //Set struktura podpobna do listy.Jeżeli jakiś element jest w liście to już tego elementu nie dodaje
        Set<Integer> wynik = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Podaj liczbe " + i);
            int a = scanner.nextInt();
            liczby.add(a);

        }
        Collections.sort(liczby);
        //System.out.println(liczby);
        for (int z = 0; z < liczby.size(); z++) {
            for (int j = z + 1; j < 10; j++) {
                {
                    if (liczby.get(z) == liczby.get(j)) {
                        wynik.add(liczby.get(z));

                    }

                }

            }


        }System.out.println("Liczby które się powtarzają to: " + wynik);
    }
}



