package Zadania_podstawy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class BMI {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Podaj twoj wzrost: ");

        Double wzrost = userInput.nextDouble();

        System.out.print("Podaj twoja mase ciala: ");

        Double masa = userInput.nextDouble();

        Double bmi = masa/((wzrost/100)*(wzrost/100));

        System.out.print("Twoje BMI wynosi: "+bmi);
        System.out.println();
        if(bmi<18.5){
            System.out.println("BMI NIEOPTYMALNE!!!!");
        }else if (bmi>24.9){
            System.out.println("BMI NIEOPTYMALNE!!!");
        }else System.out.println("BMI OPTYMALNE");
    }


}
