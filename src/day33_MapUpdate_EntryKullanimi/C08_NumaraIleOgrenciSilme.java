package day33_MapUpdate_EntryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C08_NumaraIleOgrenciSilme {

    public static void main(String[] args) {

        // verilen numaradaki ogrenciyi
        // map'den silelim

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        ogrenciMap.remove(101);

        System.out.println(ogrenciMap.remove(102)); // Veli-Cem-10-K-TM

        System.out.println(ogrenciMap.remove(103, "Ali-Cem-11-K-TM")); // true

        System.out.println(ogrenciMap.remove(104, "Ali-Cem-11-K-TM")); // false


        ogrenciMap.replace(104,"Ali-Cem-11-K-TM");
        // hic bir kontrol yapmadan degeri verdigimiz deger olarak update eder

        ogrenciMap.replace(104,"Ali-Cem-11-K-TM","Ali-Yan-10-S-TM");
        // eger eski deger verdigimiz ile ayni ise yeni degeri atama yapar


        System.out.println(ogrenciMap.containsKey(103)); // false
        System.out.println(ogrenciMap.containsKey(107)); // true

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // value'nun icindeki degerlere degil
        // bir butun olarak value'ya bakar
        // value'su "Ali" olan yoksa false doner


        System.out.println(ogrenciMap);
    }
}
