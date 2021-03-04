import java.util.Scanner;

public class wejscia_wyjscia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ilu jest użytkowników:?");
        Integer users = Integer.valueOf(scan.nextLine());
        for (int i = 1; i <= users; i++) {
            System.out.println("Użytkowniku numer :"+ i +" Wpisz swoje imię: ");
            String textLine = scan.nextLine();
            System.out.println( textLine +" Wpisz ile masz lat: ");
            Integer userNumber = Integer.valueOf(scan.nextLine());
            System.out.println( textLine +" Który jest teraz rok?");
            Integer rok = Integer.valueOf(scan.nextLine());
            System.out.println(textLine + " za rok będziesz miał/a " + (userNumber + 1) + " lat");
            System.out.println(textLine + " Urodziłeś/aś się w  " + (rok - userNumber) + " roku");
        }
    }
}
