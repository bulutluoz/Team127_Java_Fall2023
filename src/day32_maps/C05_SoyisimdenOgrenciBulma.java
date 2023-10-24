package day32_maps;

import java.util.Map;

public class C05_SoyisimdenOgrenciBulma {

    public static void main(String[] args) {

        // ogrenci map'inde istenen soyisimdeki ogrencilerin
        // sinif, sube, isim, soyisim bilgilerini yazdiran bir method olusturun

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        MapMethodDepo.soyisimdenOgrenciBulma(ogrenciMap,"Can");


    }
}
