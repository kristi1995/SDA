import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ulica {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w{2}\\.(\\w{1}\\s?[a-z]+\\s\\w+\\W\\w+)");
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz na jakiej ulicy mieszkasz ");
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

