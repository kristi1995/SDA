public class Punkt2D {
    int x, y;
    void showxy() {
        System.out.println("x oraz y:" + x + " " + y);
    }
}
    class Punkt3D extends Punkt2D {
    int z;
    void showz(){
        System.out.println("z : " + z);
    }
    void sum(){
        System.out.println("x,y,z: "+(x+y+z));
    }
}
    class wymiar {
        public static void main(String[] args) {

            Punkt2D dwuwymiar = new Punkt2D();
            Punkt3D trojwymiar = new Punkt3D();

            dwuwymiar.x = 10;
            dwuwymiar.y = 29;
            System.out.println("Punkt 2D to: ");
            dwuwymiar.showxy();
            System.out.println();

            trojwymiar.x = 1;
            trojwymiar.y = 2;
            trojwymiar.z = 5;
            System.out.println("Punkt 3D ");
            trojwymiar.showxy();
            trojwymiar.showz();
            System.out.println();

            System.out.println("Suma: ");
            trojwymiar.sum();

        }
    }