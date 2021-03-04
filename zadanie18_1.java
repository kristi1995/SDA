package Zadania_ksiazka;

public class zadanie18_1 {
    static int kostka(){
        return 1+(int)(Math.random()*6);
    }

    public static void main(String args[]) {

        for(int i = 0; i < 100; ++i)

            System.out.print(kostka()+" ");

    }
}
