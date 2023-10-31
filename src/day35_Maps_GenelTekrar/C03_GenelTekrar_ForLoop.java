package day35_Maps_GenelTekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_GenelTekrar_ForLoop {
    public static void main(String[] args) {
        /*
        soru --- Anne, baba ve çocuktan oluşan çekirdek ailenin
                 Süper aile olup olmadığını bulan kodu yazın.
                 isimleri kullanıcıdan isteyin.
                 (Çocuğun ismindeki sessiz harflerin hepsi,
                 anne ve babanın isimlerinde var ise bu aile süper ailedir.
                 (Not: anne ve baba isminden en az bir tane olmalı.).
                 örn1: baba adı = "Halil", anne adı= "Merve", çocuk adı= "Veli" >> Süper aile.
                 ("v" anneden, "l" babadan)
                 örn2: baba adı = "Murat", anne adı= "Songül", çocuk adı= "Mert" >>
                 Süper aile değil. Anneden harf yok.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("sirasi ile anne,baba ve cocugun isimlerini giriniz");
        String anne = scanner.nextLine();
        String baba = scanner.nextLine();
        String cocuk= scanner.nextLine();


        String anneB  = anne.toLowerCase().replaceAll("\\s","");
        String babaB  = baba.toLowerCase().replaceAll("\\s","");
        String cocukB = cocuk.toLowerCase().replaceAll("\\s","");


        String[] anneHarfler = anneB.split("");
        String[] babaHarfler = babaB.split("");
        String[] cocukHarfler = cocukB.split("");

        List<String> anneSessizler = new ArrayList<>();
        List<String> babaSessizler = new ArrayList<>();
        List<String> cocukSessizler = new ArrayList<>();
        String[] sesliHarfler ={"a","e","i","ı","o","ö","u","ü"};


    }
}
