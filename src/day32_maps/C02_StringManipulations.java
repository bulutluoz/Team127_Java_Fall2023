package day32_maps;

import java.util.ArrayList;
import java.util.List;

public class C02_StringManipulations {

    public static void main(String[] args) {

        // ogrenci bilgilerini belirli formatta tutan String'lerden olusan bir listemiz var

        // Bu listeden isim verdigimizde,
        // o isme sahip olanlarin isim ve soyisimlerini yazdiran bir method olusturun

        List<String> ogrenciList = new ArrayList<>();
        ogrenciList.add("Beytullah-Yildiz-10-K-Soz");
        ogrenciList.add("Esra-Yilmaz-11-L-Soz");
        ogrenciList.add("Ercan-Yil-10-M-MF");
        ogrenciList.add("Beytullah-Han-12-K-MF");


        //isimSoyisimYazdir(ogrenciList,"esra");

        // sube'si verilen ogrencilerin isim ve soyisimlerini
        // yazdiran bir method olusturun

        subeListesiYazdir(ogrenciList,"M");

    }


    public static void subeListesiYazdir(List<String> ogrenciList, String istenenSube){


        String[] bilgilerArr;

        for (String each :ogrenciList
             ) {
            bilgilerArr = each.split("-"); // [Beytullah, Yildiz, 10, K, Soz]

            if (bilgilerArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println(bilgilerArr[0] + " " + bilgilerArr[1]);
            }
        }

    }




    public static void isimSoyisimYazdir(List<String> ogrenciList, String istenenIsim){
        String ogrenciBilgi ;


        for (int i = 0; i < ogrenciList.size() ; i++) {

            ogrenciBilgi = ogrenciList.get(i); // "Beytullah-Yildiz-10-K-Soz"
            String[] bilgiler = ogrenciBilgi.split("-"); // [Beytullah, Yildiz, 10, K, Soz]

            if (bilgiler[0].equalsIgnoreCase(istenenIsim)){
                System.out.println("Isim soyisim : " + bilgiler[0] + " " + bilgiler[1]);
            }
        }
    }
}
