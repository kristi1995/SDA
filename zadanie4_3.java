package Zadania_ksiazka;

public class zadanie4_3 {
    public static void main(String[] args) {
        int i,j,n=10,suma=0;
        int macierz[][]= new int[n][n];
        for(i=0;i<n;i++){
            for (j=0;j<n;j++){
                if(i==j){
                    macierz[i][j]=1;
                }else{
                    macierz[i][j]=0;
                }

            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(macierz[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<n;i++){
            suma = suma+macierz[i][i];
        }
        System.out.println("Suma wynosi: "+suma);
    }
}
