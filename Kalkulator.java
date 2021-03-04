import java.util.Scanner;

public class Kalkulator {


    private Integer[] tabLiczb;

    public Kalkulator(Integer[] tabLiczb) {
        this.tabLiczb = tabLiczb;
    }

    public int getSum() {
        int sum = 0;
        for (int i : this.tabLiczb) {
            sum += i;
        }
        return sum;
    }

    public int getOdej() {
        int odej = 0;
        for (int i = 1; i < tabLiczb.length; i++) {
            odej -= i;
        }
        return odej;

    }
    public int getIloczyn() {
        int iloczyn= 0;
        for(int i=1; i<tabLiczb.length; i++) {
            iloczyn *= this.tabLiczb[i];
        }
        return iloczyn;
    }
    public int getIloraz() {
        int iloraz=0;
        for (int i=1; i<tabLiczb.length; i++) {
            iloraz= iloraz/tabLiczb[i];
        }
        return iloraz;
    }
    public int getModulo() {
        int modulo=0;
        for (int i=1; i<tabLiczb.length; i++) {
            modulo= modulo%tabLiczb[i];
        }
        return modulo;
    }
}
    class NowyPomysl {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj ilość wprowadzanych liczb ");
        Integer iloscLiczb = Integer.valueOf(scan.nextLine());
        Integer[] tabLiczb = new Integer[iloscLiczb];


        for (int i = 0; i < iloscLiczb; i++){
            System.out.println("Podaj liczbę: ");
            Integer liczba1 = Integer.valueOf(scan.nextLine());
            tabLiczb[i]=liczba1;
        }
        System.out.println("Jakie działanie chcesz wykonać?");
        String dzialanie=scan.nextLine();
        Kalkulator kalkulator= new Kalkulator(tabLiczb);


        if (dzialanie.equalsIgnoreCase("dodawanie")) {
            System.out.println("Suma liczb to: " + kalkulator.getSum());}
        else if(dzialanie.equalsIgnoreCase("odejmowanie")){
            System.out.println("Różnica liczb to: "+ kalkulator.getOdej());}
        else if(dzialanie.equalsIgnoreCase("mnozenie")) {
            System.out.println("Iloczyn liczb to: "+ kalkulator.getIloczyn()); }
        else if(dzialanie.equalsIgnoreCase("dzielenie")) {
            System.out.println("Iloraz liczb to: "+ kalkulator.getIloraz()); }
        else if (dzialanie.equalsIgnoreCase("modulo")) {
            System.out.println("Modulo liczb to: "+ kalkulator.getModulo());
        }
    }


}

