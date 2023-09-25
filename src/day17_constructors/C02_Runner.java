package day17_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Runner {

    public static void main(String[] args) {
        /*
            Constructor bir class'dan obje olusturmak istedigimizde
            o objeye olusturuldugu class'daki variable ve methodlarla ilgili
            ilk atamayi(initialize) yapan yapidir

         */

        C01 obj = new C01();
        System.out.println(obj.sayi); // 6

        // bana rastgele bir sayi lazim
        obj.rastgeleSayiUret();
        // Bugunku sansli sayi : 798

        // bugun ne yemek pisirsem ?
        obj.bugunNePisireyim();

        Scanner scanner = new Scanner(System.in);
        String str = new String("Java Candir");
        List<Integer> sayilar = new ArrayList<>();


               C01       obj2          =           new            C01()         ;
        // Class adi  obje adi   atama isareti   keyword       Constructor



    }
}
