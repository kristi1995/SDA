package Zadania_podstawy;

import java.util.Random;
import java.util.Scanner;

public class zadanie20 {
        public static void main(String[] args) {
            int  i=0;
            int los;
            int odp;
            Random rnd = new Random();
            los = rnd.nextInt(100) + 1;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Zgadnij liczbę od 1 do 100!: ");
            do {
                i++;
                System.out.println(" Podaj liczbę: ");
                odp = scanner.nextInt();
                if (odp>los){
                    System.out.println("Twoja liczba jest za duża :(");
                }else if (odp<los) {
                    System.out.println("Twoja liczba jest za mała :(");
                }

            }while(odp != los);
            System.out.println("BRAWO ZGADŁEŚ!!!!:)");
        }

}
