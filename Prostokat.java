public class Prostokat {
    double x,y;
    Prostokat(double x, double y){
        this.x = x;
        this.y = y;
    }
    void pole(){
        System.out.println("Pole prostokąta wynosi: "+(x*y));
    }
    void obwod(){
        System.out.println("Obwód prostokąta wynosi: "+(2*x+2*y));
    }
}
class ProstokatWyniki{
    public static void main(String[] args) {
        Prostokat prostokata = new Prostokat(2,3);
        prostokata.pole();
        prostokata.obwod();
    }
}
