package day35_Maps_GenelTekrar;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<String> sesliHarflerList = Arrays.asList(sesliHarfler);


        for (String each:anneHarfler
             ) {

            if (!sesliHarflerList.contains(each)){
                anneSessizler.add(each);
            }
        }

        for (String each:babaHarfler
        ) {

            if (!sesliHarflerList.contains(each)){
                babaSessizler.add(each);
            }
        }

        for (String each:cocukHarfler
        ) {

            if (!sesliHarflerList.contains(each)){
                cocukSessizler.add(each);
            }
        }

        // cocugun ismindeki harfleri anne ve babanin harfleri ile karsilastirip
        // ortak harfleri sayalim

        boolean anneOrtakHarf = false;
        boolean babaOrtakHarf = false;

        String cocukHarf="";
        boolean cocukHerHarf = true;
        boolean cocukHarfKontrol = false;

        for (int i = 0; i <cocukSessizler.size() ; i++) {

            cocukHarf = cocukSessizler.get(i);

            if (anneSessizler.contains(cocukHarf)){
                anneOrtakHarf =true;
                cocukHarfKontrol = true;
            }

            if (babaSessizler.contains(cocukHarf)){
                babaOrtakHarf = true;
                cocukHarfKontrol = true;
            }

            if (!cocukHarfKontrol){ // if parantezinde true veya false olmali
                cocukHerHarf = false;       // cocukHarfKontrol zaten boolean
                                            // cocukHarfKontrol == false yerine !cocukHarfKontrol
            }

            cocukHarfKontrol = false;

        }


        // artik anne ve baba isimleri ile ortak sessiz harf olup olmadigini biliyorum
        // anneOrtakHarf =true  ve babaOrtakHarf = true ise anne babadan harf var demektir


        // artik cocugun her harfinin anne babada olup olmadigini biliyorum
        // cocukHerHarf = false ise tum harfler anne babada yok
        // cocukHerHarf = true ise tum harfler anne babada var


        if (anneOrtakHarf && babaOrtakHarf && cocukHerHarf){
            System.out.println("Super aile");
        }else{
            System.out.println("Super aile degil");
        }
    }
}
