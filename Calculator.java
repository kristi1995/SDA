import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

    private String[] history = new String[0];

    public double add(double num1, double num2){
        addToHistory("Dodanie "+num1+" do "+num2+ " daje wynik "+(num1+num2));
        return num1+num2;
    }

    public double multiply(double num1, double num2){
        addToHistory("mnożenie "+num1+" z "+num2+ " daje wynik "+(num1*num2));
        return num1*num2;
    }

    public double subtract(double num1, double num2){
        addToHistory("odejmowanie "+num1+" od "+num2+ " daje wynik "+(num1-num2));
        return num1-num2;
    }

    public double divide(double num1, double num2){
        if(num2 == 0){
            System.out.println("Błąd - próba dzielenia przez zero");
            addToHistory("Błąd - próba dzielenia przez zero");
            return 0;
        }
        addToHistory("dzielenie "+num1+" przez "+num2+ " daje wynik "+(num1/num2));
        return num1/num2;
    }

    public void printOperations(){
        for (String s : history) {
            System.out.println(s);
        }
    }

    public void clearOperations(){
        this.history = Arrays.copyOf(this.history, 0);
    }


    public void addToHistory(String text){
        this.history = Arrays.copyOf(this.history, this.history.length+1);
        this.history[this.history.length-1] = text;
    }


    public static void main(String[] args) {

        Calculator c = new Calculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile licz chcesz wpisać:?");
        Integer users = Integer.valueOf(scan.nextLine());
        for (int i = 1; i <= users; i++) {
            System.out.println("podaj liczbe");
            Integer num = Integer.valueOf(scan.nextLine());




        }


    }
}