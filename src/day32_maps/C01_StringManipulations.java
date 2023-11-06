package day32_maps;

import java.util.Arrays;

public class C01_StringManipulations {

    public static void main(String[] args) {

        // bir ogrencinin bilgileri arada - olarak String bir variable'a atanistir
        // isim-soyisim-sinif-sube-bolum
        // bu formatta verilen bilgiden, subeyi yazdiran bir method olusturun

        String bilgi = "Ali Can-Yildiz-10-K-Soz";

        subeYazdir(bilgi); // K

        // ogrencinin isim ve soyismini yazdiran bir method olusturun
        isimSoyisimYazdir(bilgi);


    }

    public static void subeYazdir (String bilgi){

        String[] bilgilerArr = bilgi.split("-"); // [Ali Can, Yildiz, 10, K, Soz]

        System.out.println("Ogrenci sube : " + bilgilerArr[3]);

    }

    public static void isimSoyisimYazdir(String bilgi){

        String[] bilgilerArr = bilgi.split("-"); // [Ali Can, Yildiz, 10, K, Soz]
        System.out.println("Isim soyisim : " + bilgilerArr[0] + " " + bilgilerArr[1]);

    }
}
