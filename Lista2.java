import java.util.ArrayList;
import java.util.List;

public class Lista2 {
    public static void main(String[] args) {
        List<Integer> lista2 = new ArrayList<Integer>();
        lista2.add(10);
        lista2.add(11);
        lista2.add(22);
        for (Integer elementListy:lista2){
            System.out.println(elementListy);

        }
        System.out.println(lista2.size());
        lista2.clear();
        for (Integer elementListy:lista2){
            System.out.println(elementListy);
        }
        System.out.println(lista2.size());


    }
}
