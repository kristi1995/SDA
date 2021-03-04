import java.util.Scanner;

public class Box {
    private double widht;
    private double height;
    private double depth;

    Box(Box ob){
        widht = ob.widht;
        height = ob.height;
        depth = ob.depth;
    }

    //tworzenie konstruktorów
    Box(double w, double h, double d){
        widht = w;
        height = h;
        depth = d;
    }
    Box(){
        widht = -1;
        height = -1;
        depth = -1;
    }
    Box(double len){

        widht = height = depth = len;
    }
    //metoda
    double volume(){

        return widht*height*depth;
    }
}
class BoxWeight extends Box{
    double weight;
    BoxWeight(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }
}
class BoxColor extends Box{
    int color;

    BoxColor(double w, double h, double d, int c){
        super(w,h,d);
        color = c;
    }

}
class Shipment extends  BoxWeight{
    double cost;
    Shipment(double w, double h, double d, double m,double k){
        super(w,h,d,m);
        cost =k;
    }
}

/*class OverloadCons{
    public static void main(String[] args) {
        Box mybox1 = new Box(10,25,13);
        Box mybox2 = new Box();
        Box mybox3 = new Box(15);
        //kopia obiektu mybox1
        Box myclone = new Box(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Objętość 1 wynosi "+ vol);
        vol = mybox2.volume();
        System.out.println("Objętość 2 wynosi "+vol);
        vol = mybox3.volume();
        System.out.println("Objętość 3 wynosi "+vol);
        vol = myclone.volume();
        System.out.println("Objętość klona wynosi: "+vol);
    }
    class DemoBoxWeight{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj szerokość :");
            double a = scanner.nextDouble();
            System.out.println("Podaj wysokość :");
            double b = scanner.nextDouble();
            System.out.println("Podaj głębokość :");
            double c = scanner.nextDouble();
            System.out.println("Podaj wagę : ");
            double e = scanner.nextDouble();
            BoxWeight mybox1 = new BoxWeight(a,b,c,e);
            Box plainbox = new Box();
            //BoxWeight mybox2 = new BoxWeight(a,3,4,6.9);
            double vol;

            vol = mybox1.volume();
            System.out.println("Objętość pudełka nr.1 wynosi "+vol);
            System.out.println("Waga pudełka nr.1 wynosi "+mybox1.weight);

            plainbox = mybox1;
            double vol1 = plainbox.volume();
            System.out.println("Objętość plainbox wynosi: "+vol1);

            /*vol = mybox2.volume();
            System.out.println("Objętość pudełka nr.2 wynosi "+vol);
            System.out.println("Waga pudełka nr.2 wynosi "+mybox2.weight);
}
        }*/
class DemoShipment{
    public static void main(String[] args) {
        Shipment shipment = new Shipment(10,20,15,10,3.41);
        double vol2;
        vol2 =shipment.volume();
        System.out.println("objętość wynosi "+vol2+" Ciężar wynosi "+shipment.weight+" koszt przesyłki wynosi "+shipment.cost);
    }
}

