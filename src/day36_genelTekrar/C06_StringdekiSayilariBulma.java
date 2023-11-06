package day36_genelTekrar;

public class C06_StringdekiSayilariBulma {

    public static void main(String[] args) {

        // verilen bir metindeki rakamlarin toplamini yazdiran bir method olusturun
        // ornek : input = Istanbul1453.  output = 13

        metindekiSayilariTopla("Istanbul1453.");

    }

    public static void metindekiSayilariTopla(String metin){

        // 1.yol : replaceAll ile digit olmayanlari yok edip
        // kalanlari int'a parse edip
        // sayinin rakamlar toplamini bulabiliriz

        // Character wrapper class'indan method'lar kullanabilirim

        int toplam = 0;
        char karakter;

        for (int i = 0; i <metin.length() ; i++) {

            karakter = metin.charAt(i);

            if (Character.isDigit(karakter)){

                toplam += Character.getNumericValue(karakter);
            }
        }
        System.out.println("Metindeki sayilarin toplami : " + toplam);
    }
}
