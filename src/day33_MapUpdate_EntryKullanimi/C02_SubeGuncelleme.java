package day33_MapUpdate_EntryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C02_SubeGuncelleme {

    public static void main(String[] args) {

        // ogrenci map'in verilen bir sube'deki
        // tum ogrencilerin subesini verilen yeniSube yapin

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        String eskiSube = "K";
        String yeniSube = "C";
        ogrenciMap = MapMethodDepo.subedekiOgrencileriTasi(ogrenciMap,eskiSube,yeniSube);


        System.out.println(ogrenciMap);
        //{
        // 101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-10-C-TM,
        // 103=Ali-Cem-11-C-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-C-MF,
        // 107=Esra-Han-11-M-SOZ,
        // 108=Azim-Kan-12-L-SOZ,
        // 109=Huseyin-Fan-12-H-MF,
        // 110=Azim-Kayisi-11-C-TM
        //    }
    }
}
