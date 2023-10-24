package day32_maps;

import java.util.Collection;
import java.util.HashMap;
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

    public static Map<Integer, String> okulMapDondur() {

        Map<Integer,String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");
        ogrenciMap.put(108,"Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109,"Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110,"Azim-Kayisi-11-K-TM");

        return ogrenciMap;
    }

    public static void bolumListesiYazdir(Map<Integer, String> ogrenciMap, String istenenBolum) {
        // istenen bolumdeki ogrencilerin sinif, sube, isim, soyisim'lerini yazdiran
         Collection<String> valueCollection = ogrenciMap.values();

         String[] valueArr;

        System.out.println("======="+ istenenBolum + " bolumu ogrenci listesi=========");

        for (String each : valueCollection
             ) { // each ==> "Azim-Kayisi-11-K-TM"

            valueArr = each.split("-"); // [Ali, Can, 11, H, MF]

            if (valueArr[4].equalsIgnoreCase(istenenBolum)){

                System.out.println(valueArr[2] + " " + valueArr[3] + " " + valueArr[0] + " "+valueArr[1]);
            }

        }
    }
}
