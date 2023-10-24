package day32_maps;

import java.util.Collection;
import java.util.Map;

public class MapMethodDepo {

    // verilen sube'deki ogrencilerin isim ve soyisimlerini yazdiran bir method olusturun

    public static void subeListesiyazdir(Map<Integer,String> ogrenciMap, String istenenSube){

         Collection<String> valueCollection = ogrenciMap.values();
         // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF]
        String[] valueArr;
        System.out.println("========"+istenenSube + " subesi ogrenci Listesi"+"======");

        for (String each: valueCollection
             ) { // each ==> Ali-Can-11-H-MF

            valueArr = each.split("-"); // [Ali, Can, 11, H, MF]

            if (valueArr[3].equalsIgnoreCase(istenenSube)){
                System.out.println(valueArr[0] + " "+ valueArr[1]);
            }


        }


    }
}
