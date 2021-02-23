public class Punkty2 {
    int x, y;
    Punkty2(){
        this.x = 0;
        this.y = 0;
    }
    Punkty2(int x, int y){
        this.x = x;
        this.y = y;

    }
    void volume(){
        System.out.println("Punkty x y to :"+x +" "+y);
    }
}
class Punkt3 extends Punkty2 {
    int z;
    Punkt3(){
        this.x = 0;
        this.y =0;
        this.z = 0;
    }
    Punkt3(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;

    }
    void volume3(){
        System.out.println("Punkty z to :"+z);
    }
    void sumapunkt(){
        System.out.println("suma punktów to: "+(x+y+z));
    }

}
class Punktyrazem {
    public static void main(String[] args) {
        Punkty2 dwawymiary = new Punkty2();
        Punkt3 trzywymiary = new Punkt3();
        Punkty2 dwawymiary_2 = new Punkty2(10,11);
        Punkt3 trzywymiary_2 = new Punkt3(20,25,30);

        System.out.println("Punkty 2D to x,y : ");
        dwawymiary.volume();
        System.out.println("Punkty 3D to x,y,x: ");
        trzywymiary.volume();
        trzywymiary.volume3();
        System.out.println("Suma punktów x,y,x wynosi: ");
        trzywymiary.sumapunkt();
        System.out.println();
        System.out.println("Teraz dane dla konstruktora z parametrami: ");

        System.out.println("Punkty 2D to x,y : ");
        dwawymiary_2.volume();
        System.out.println("Punkty 3D to x,y,x: ");
        trzywymiary_2.volume();
        trzywymiary_2.volume3();
        System.out.println("Suma punktów x,y,x wynosi: ");
        trzywymiary_2.sumapunkt();

    }
}

