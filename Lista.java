import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> pierwszaLista = new ArrayList<String>();
        pierwszaLista.add("Element 1");
        pierwszaLista.add("Element 2");
        for (String elementListy:pierwszaLista){
            System.out.println(elementListy);
        }
        pierwszaLista.remove("Element 2");
        for (String elementListy:pierwszaLista){
            System.out.println(elementListy);
        }
    }
}
