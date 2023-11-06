package day30_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_iterator {

    public static void main(String[] args) {

        int[] arr = {3,5,6,2,9,7,4,0,1,3,4,2,5,6,7,2};

        List<Integer> sayilar = new ArrayList<>();
        for (Integer each:arr
             ) {

            sayilar.add(each);
        }

        System.out.println(sayilar); // [3, 5, 6, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2]

        // index kullanmadan sadece cift elementleri yazdirin

        for (Integer each: sayilar
             ) {

            if (each % 2 == 0){
                System.out.print(each + " ");
            }
        }
        System.out.println("");


        // index kullanmadan listenin elementlerini 2 artirin


        for (Integer each : sayilar
             ) {

            each += 2;
        }

        System.out.println(sayilar); // [3, 5, 6, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2]


        // index kullanmadan cift sayilari silin

        Iterator iterator = sayilar.iterator();

        System.out.println(iterator.hasNext()); // true

        System.out.println(iterator.next()); // 3

        System.out.println(iterator.hasNext()); // true

        iterator.next();
        System.out.println(iterator.next()); // 6
        iterator.remove();

        System.out.println(sayilar); // [3, 5, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2]

        while (iterator.hasNext()){


            if (((Integer)iterator.next()) % 2 == 0    ){
                iterator.remove();
            }

        }
        System.out.println(sayilar); // [3, 5, 9, 7, 1, 3, 5, 7]


        // ayni listede 5'ten buyuk olan sayilari silin
        // iterator olusturduktan sonra sadece ileri gidebilir
        // onceki olusturdugumuz iterator'a yaninda eleman oldukca iterator.hasNext() == true
        // ileriye git dedigimiz icin, loop'un sonunda iterator en sona ulasti
        // Eger yeniden tum elementleri, bastan itibaren taramak istersek
        // yeni bir iterator olusturmaliyiz

        iterator = sayilar.iterator();

        while (iterator.hasNext()){

            int sayi = (Integer)iterator.next();

            if (sayi > 5){
                iterator.remove();
            }

        }

        System.out.println(sayilar); // [3, 5, 1, 3, 5]

        // loop sonunda iterator yine en sona gitti
        // eger bir daha next() kullanirsak
        // gidecegi eleman kalmadigindan exception firlatir

        // iterator.next(); // NoSuchElementException

    }
}
