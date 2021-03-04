public class wielowymtablice {
    public static void main(String[] args) {
        int[][] x = new int[5][5];
        for(int i=0; i<5; i++)
            for(int j=0; j<5; j++)
                x[i][j] = i*5+j;

        for(int[] wiersz: x)
            for(int element: wiersz)
                System.out.println(element);
        int wiersz = 0;
        int kolumna = 0;
        while(wiersz < x.length) {
            kolumna = 0;
            while(kolumna < x[wiersz].length) {
                System.out.println(x[wiersz][kolumna]);
                kolumna++;
            }
            wiersz++;
        }
    }
}
