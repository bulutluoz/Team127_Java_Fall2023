package day06_stringManipulations;

import java.util.Locale;

public class C01_toUpperCase {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        // String method'lari ile yapilan degisiklikler
        // String'i kalici olarak degistirmez.

        System.out.println(str); // Java Candir

        // degisikligin kalici olmasini isterseniz
        // String'de atama yapmalisiniz

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR


        System.out.println(str.toLowerCase()); // java candir

        // I yerine kucuk harf sectigimizde i gelir
        // I yerine Turkce karakter olarak ı gelmesini isterseniz

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // java candır
    }
}
