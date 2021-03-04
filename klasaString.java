import java.util.Locale;

public class klasaString {
    public static void main(String[] args) {
        String text1 = "My name is ";
        String text2 = "Krysia";
        String finalText =  text1 + text2;
        String text3 = "THIs is ";
        String text4= "test";
        String finaltext2=text3.concat(text4);
        System.out.println(finalText.toUpperCase(Locale.ROOT));
        System.out.println(finaltext2.toLowerCase(Locale.ROOT));
        System.out.println(finalText.indexOf("na"));
        System.out.println(finalText.replaceAll("K","F"));


        System.out.println(text1.equals(text2));//porównanie zawartości text1 in text2 czy są takie same
        System.out.println(text1.equals(text3));
        System.out.println(text1 == text2.intern());//porównanie zawartości text1 in text2 czy są takie same
        System.out.println(text1 == text3.intern());

    }

}
