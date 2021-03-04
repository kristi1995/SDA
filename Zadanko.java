import java.io.InputStream;
import java.util.Scanner;

public class Zadanko {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz tekst: ");
        String textLine = scan.nextLine();
        System.out.println(textLine);
        System.out.println(textLine.length());
    // zliczanie danego znaku ile razy jest tutaj akurat spacja
        int spacja = 0;
        for (int i = 0; i < textLine.length(); i++)
        {
            if (textLine.charAt(i) == ' ') {

                spacja++;
            }

        }System.out.println((spacja));
    }
}







