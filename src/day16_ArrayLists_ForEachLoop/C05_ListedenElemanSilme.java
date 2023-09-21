package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_ListedenElemanSilme {

    public static void main(String[] args) {
        //Soru 3- Verilen String bir listede
        //        istenmeyen harf iceren elementleri silip,
        //        kalan kismini list olarak bize donduren bir method olusturun

        /*
            Listenin elemanlarini index ile kontrol edip
            silmemiz isteniyorsa
            silme islemi yaptigimizda aradan bir element cikarilacagi icin
            index bir elemani atlar

            bunu engellemek icin
                - silme yapinca i bir azaltilabilir
                - verilen listede silme yapilmaz. yeni bir liste olusturulup
                  silinmeyecek elemanlar yeni listeye eklenebilir
         */

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");
        isimler.add("Ayca");
        isimler.add("Mehmet");

        String silinecekHarf = "a";

        System.out.println(istenmeyenleriSil(isimler, silinecekHarf));

    }

    public static List<String> istenmeyenleriSil(List<String> isimler, String silinecekHarf ){

        List<String> silinmeyeceklerListesi = new ArrayList<>();

        for (int i = 0; i < isimler.size() ; i++) {

            /*
            if (isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){

                isimler.remove(isimler.get(i));
                i--;
            }
             */

            if (!isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){
                silinmeyeceklerListesi.add(isimler.get(i));
            }

        }

        return silinmeyeceklerListesi;
    }
}
