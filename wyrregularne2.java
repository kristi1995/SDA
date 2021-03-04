import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class wyrregularne2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[-\\w\\.]+@([-\\w]+\\.)+[a-z]+$");
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz swój adres mailowy ");
        String textLine = scan.nextLine();
        Matcher matcher = pattern.matcher(textLine);
        // boolean matchFound = matcher.find();
        boolean matchFound = matcher.matches();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
