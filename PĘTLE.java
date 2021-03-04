public class PĘTLE {
    public static void main(String[] args) {
        //pierwsza pętla wypisywanie liczb mniejszych od..
        int i;
        for(i=0; i<6;i++)
        {
            System.out.println("Liczba mniejsza od 6 to "+i);
        }
        //druga pętla wypisywanie elementów z tablicy
        String[] array = {"Ala", "ma", "kota"};
        for (String element : array)
        {
            System.out.println(element + "");
        }
        //trzecia pętla sprawdzanie czy liczba jest parzysta
        int b;
        for(b=1; b<=100;b++)
        {
            if (b%2==0)
            System.out.println("Liczba parzysta "+b);
            else{
                System.out.println("Liczba nie jest parzysta "+b);
            }
        }
        //pętla while wyświetla liczby od 0 do 100
        int c=2;
        while(c<=100)
        {
            System.out.println(c);
            c++;

        }
        //pętla do while




        }

    }

