package day35_Maps_GenelTekrar;

import java.util.Map;
import java.util.TreeMap;

public class C01_TreeMap {

    public static void main(String[] args) {

        Map<String,Integer> harfler1 = new TreeMap<>();

        // bir TreeMap objesi olustururken
        // Data turu olarak Map secersek
        // biz bir TreeMap olustursak da tum Map'lerle ortak olan ozellikleri verir

        TreeMap<String,Integer> harfler = new TreeMap<>();
        harfler.put("B",20);
        harfler.put("P",2);
        harfler.put("S",25);
        harfler.put("F",10);
        harfler.put("Y",12);

        System.out.println(harfler); // {B=20, F=10, P=2, S=25, Y=12}

        System.out.println(harfler.descendingMap()); // {Y=12, S=25, P=2, F=10, B=20}

        System.out.println(harfler); // bu method treeMap'de kalici degisiklik YAPAMAZ

        // harfler = harfler.descendingMap(); treeMap dogal sirali olacagindan,
        //                                    descending siralamayi kabul etmez


        System.out.println(harfler.lowerKey("S")); // P
        System.out.println(harfler.lowerKey("K")); // F
        System.out.println(harfler.lowerKey("A")); // null

        System.out.println(harfler.floorKey("S")); // S
        System.out.println(harfler.floorKey("K")); // F
        System.out.println(harfler.floorKey("A")); // null

        System.out.println(harfler.lowerEntry("D")); // B=20
        System.out.println(harfler.floorEntry("P")); // P=2

        // lower girilen key'den kucuk olan en buyuk key'i verir
        // floor matematikdeki asagi yuvarla gibidir
        // verilen key veya key yoksa ondan kucuk olan en buyuk key'i verir


        // {B=20, F=10, P=2, S=25, Y=12}

        System.out.println(harfler.higherKey("G")); // P
        System.out.println(harfler.higherKey("S")); // Y
        System.out.println(harfler.higherKey("Y")); // null

        System.out.println(harfler.ceilingKey("G")); // P
        System.out.println(harfler.ceilingKey("S")); // S
        System.out.println(harfler.ceilingKey("Z")); // null

        System.out.println(harfler.pollLastEntry()); // Y=12

        System.out.println(harfler); // {B=20, F=10, P=2, S=25}

        System.out.println(harfler.pollFirstEntry()); // B=20

        System.out.println(harfler); //  {F=10, P=2, S=25}

        harfler.put("C",24);
        harfler.put("I",4);
        harfler.put("U",12);

        System.out.println(harfler); // {C=24, F=10, I=4, P=2, S=25, U=12}

        System.out.println(harfler.headMap("P")); // {C=24, F=10, I=4}
        System.out.println(harfler.headMap("M")); // {C=24, F=10, I=4}

        System.out.println(harfler.headMap("P",true)); // {C=24, F=10, I=4, P=2}
        System.out.println(harfler.headMap("M",true)); // {C=24, F=10, I=4}

        System.out.println(harfler.tailMap("I")); // {I=4, P=2, S=25, U=12}
        System.out.println(harfler.tailMap("G")); // {I=4, P=2, S=25, U=12}

        System.out.println(harfler.tailMap("I",false)); // {P=2, S=25, U=12}
        System.out.println(harfler.tailMap("G",false)); // {I=4, P=2, S=25, U=12}


        System.out.println(harfler.firstKey()); // C
        System.out.println(harfler.firstEntry()); // C=24
        System.out.println(harfler.lastKey()); // U
        System.out.println(harfler.lastEntry()); // U=12

        System.out.println(harfler.subMap("D", "L"));// {F=10, I=4}
        System.out.println(harfler.subMap("F","S")); // {F=10, I=4, P=2}
        System.out.println(harfler.subMap("D",true,"L",true)); // {F=10, I=4}
        System.out.println(harfler.subMap("F",true,"S",true));
        //{F=10, I=4, P=2, S=25}

        System.out.println(harfler.clone());
    }
}
