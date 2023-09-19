package day14_Arrays;

import java.util.Arrays;

public class C06_StringSplit {

    public static void main(String[] args) {

        String str = "About 197.000.000 results (0,43 seconds) ";

        // arama sonuc sayisinin 1 milyondan cok oldugunu test edin


        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); // [About, 197.000.000, results, (0,43, seconds)]

         int sonucSayisi= Integer.parseInt(kelimeler[1].replaceAll("\\D",""));

        System.out.println(sonucSayisi); // 197000000

        String[] ayirace = str.split("e");

        System.out.println(Arrays.toString(ayirace)); // [About 197.000.000 r, sults (0,43 s, conds) ]

        String[] ayiracHiclik = str.split("");
        System.out.println(Arrays.toString(ayiracHiclik));
        // [A, b, o, u, t,  , 1, 9, 7, ., 0, 0, 0, ., 0, 0, 0,  , r, e, s, u, l, t, s,  , (, 0, ,, 4, 3,  , s, e, c, o, n, d, s, ),  ]


        String[] ayiracNokta = str.split(",");
        System.out.println(Arrays.toString(ayiracNokta));
        // [About 197.000.000 results (0, 43 seconds) ]

    }
}
