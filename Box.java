public class Box {
    double widht;
    double height;
    double depth;

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
class OverloadCons{
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
}

