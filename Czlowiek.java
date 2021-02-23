public class Czlowiek {
    String imie;
    String nazwisko;
    int wzrost;
    short wiek;

    void setImie(String imie) {
        this.imie = imie; //this używamy aby rozrurznić co jest klasą a co jest zmienna
    }

    void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    void setWzrost(int wzrost) {
        this.wzrost = wzrost;

    }

    void setWiek(short wiek) {
        this.wiek = wiek;

    }

    String getImie() {
        return this.imie;
    }

    String getNazwisko() {
        return this.nazwisko;
    }
    int getWzrost(){
        return this.wzrost;
    }
    short getWiek(){
        return this.wiek;
    }
}