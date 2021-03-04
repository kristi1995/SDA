package Zadania_podstawy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Integer> mojaMapa = new HashMap<>();
        for(int i=0; i<10; i++){
            System.out.println("Podaj liczbę");
            Integer a = scanner.nextInt();
            if(mojaMapa.containsKey(a)){
               Integer iloscWystapien = mojaMapa.get(a);
               mojaMapa.put(a,iloscWystapien+1);
            }else{
                mojaMapa.put(a,1);
            }
        }
        System.out.println(mojaMapa);
        for(Integer klucz:mojaMapa.keySet()){
            if(mojaMapa.get(klucz)>1){
                System.out.println(klucz);
            }
        }
    }
}
