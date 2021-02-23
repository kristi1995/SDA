public class Samochod {
    String rodzaj;
    int rok;
    Samochod (String rodzaj, int rok) {

        this.rodzaj = rodzaj;
        this.rok = rok;
    }



    @Override
    public String toString() {
        return "Samochod to " + "rodzaj " + rodzaj + " " + ",a rok " + rok ;
    }
}

    class Samochod2 {
    public static void main(String[] args) {
        Samochod samochod  = new Samochod("Kombi" , 2020);
        System.out.println(samochod.toString());


    }
}
