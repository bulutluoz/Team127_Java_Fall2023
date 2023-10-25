package day33_MapUpdate_EntryKullanimi;

import day32_maps.MapMethodDepo;

import java.util.Map;

public class C01_SoyisimGuncelleme {

    public static void main(String[] args) {

        // ogrenci numarasi verilen elemanin,
        // soyismini verilen yeni deger olarak update edin

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        ogrenciMap = MapMethodDepo.numaraIleSoyisimUpdate(ogrenciMap,103,"Celik");

        System.out.println(ogrenciMap.get(103)); // Ali-Celik-11-K-TM

        ogrenciMap = MapMethodDepo.numaraIleSoyisimUpdate(ogrenciMap,105,"Kanki");

        System.out.println(ogrenciMap.get(105)); // Sevgi-Kanki-11-M-TM




    }
}
