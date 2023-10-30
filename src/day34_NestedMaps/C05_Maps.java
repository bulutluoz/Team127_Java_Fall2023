package day34_NestedMaps;

import com.sun.source.tree.IfTree;

import java.util.Map;
import java.util.TreeMap;

public class C05_Maps {

    public static void main(String[] args) {

        //Soru : Verilen bir array’de kullanilan sayilari ve kacar defa kullanildigini yazdirin.
        //
        //Input : {a,b,c,d,e,c,d,b,e,a,c,b,d,a}
        //output : a kullanimi : 3 adet
        //	b kullanimi : 3 adet
        //	c kullanimi : 3 adet
        //	d kullanimi : 3 adet
        //	e kullanimi : 2 adet

        String[] input = {"a","b","c","d","e","c","d","b","e","a","c","b","d","a"} ;
        Map<String , Integer> kullanimMiktarlariMap = new TreeMap<>();
        Integer eskiKullanimMiktari;

        for ( String each : input
             ) {

            // bizim oglanin getirdigi harf map'de yoksa , kullanim miktari 1 olarak map'e eklerim

            if (!kullanimMiktarlariMap.containsKey(each)){

                kullanimMiktarlariMap.put(each, 1);
            }else {
                // bizim oglanin getirdigi harf map'de varsa ,
                // eski kullanim miktarini alip, kullanim miktarinin 1 fazlasini map'e eklerim
                eskiKullanimMiktari = kullanimMiktarlariMap.get(each);

                kullanimMiktarlariMap.put(each , eskiKullanimMiktari+1);
            }
        }

        System.out.println(kullanimMiktarlariMap);
    }
}
