package day34_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMapOlusturma {

    public static void main(String[] args) {

        //        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        //        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        //        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        //        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        //        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");

        Map<Integer, Map<String,String>> ogrenciMap = new HashMap<>();

        ogrenciMap = ogrenciEkle(ogrenciMap,101,"Ali","Can","11","H","MF" );
        ogrenciMap = ogrenciEkle(ogrenciMap,102,"Veli","Cem","10","K","TM" );
        ogrenciMap = ogrenciEkle(ogrenciMap,103,"Ali","Cem","11","K","TM" );


        System.out.println(ogrenciMap);

        /*
            {
            101={sinif=11, sube=H, soyisim=Can, bolum=MF, isim=Ali},
            102={sinif=10, sube=K, soyisim=Cem, bolum=TM, isim=Veli},
            103={sinif=11, sube=K, soyisim=Cem, bolum=TM, isim=Ali}
            }
         */


    }

    private static Map<Integer, Map<String, String>> ogrenciEkle(Map<Integer, Map<String, String>> ogrenciMap, int ogrNo, String isim, String soyisim, String sinif, String sube, String bolum) {

        Map<String , String > ogrMap = new HashMap<>();
        ogrMap.put("isim",isim);
        ogrMap.put("soyisim",soyisim);
        ogrMap.put("sinif",sinif);
        ogrMap.put("sube",sube);
        ogrMap.put("bolum",bolum);

        // ogrMap101 bitince bunu ogrenciMap'e ekleyelim
        ogrenciMap.put(ogrNo,ogrMap);

            return ogrenciMap;
    }
}
