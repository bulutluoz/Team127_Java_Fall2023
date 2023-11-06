package day30_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {

        int[] arr = {3,5,6,2,9,7,4,0,1,3,4,2,5,6,7,2};

        List<Integer> sayilar = new ArrayList<>();
        for (Integer each:arr
        ) {

            sayilar.add(each);
        }

        System.out.println(sayilar); // [3, 5, 6, 2, 9, 7, 4, 0, 1, 3, 4, 2, 5, 6, 7, 2]

        // listedeki elemanlari sondan basa dogru yazdirin

        ListIterator listIterator = sayilar.listIterator();
        // biz iterator olusturdugumuzda, listenin basina konumlanir
        // eger sondan basa dogru islem yapmak istiyorsak,
        // once iterator'i sona yollamaliyiz

        while (listIterator.hasNext()){
            listIterator.next();
        }

        // artik iterator sona gittigi icin, basa dogru istenen islemi yaparak gelebiliriz

        while (listIterator.hasPrevious()){

            System.out.print(listIterator.previous() + " ");
        } // 2 7 6 5 2 4 3 1 0 4 7 9 2 6 5 3
        System.out.println("");

        // tum elementleri 1 artirin
        // iterator ile bir isleme baslamadan once
        // iterator'un son olarak nerede oldugunu bilmeliyiz
        // su an icin iterator basta oldugundan
        Integer eleman;
        while (listIterator.hasNext()){

            eleman = (Integer)listIterator.next();

            listIterator.set(eleman+1);
        }

        System.out.println(sayilar); // [4, 6, 7, 3, 10, 8, 5, 1, 2, 4, 5, 3, 6, 7, 8, 3]

        // tek sayilari silin
        // iterator suan sonda

        while (listIterator.hasPrevious()){

            eleman = (Integer) listIterator.previous();

            if (eleman % 2 == 1){
                listIterator.remove();
            }
        }

        System.out.println(sayilar); // [4, 6, 10, 8, 2, 4, 6, 8]

        // 5'den buyuk olanlari 1 azaltin, diger sayilari 1 artirin
        // iterator basta

        while (listIterator.hasNext()){

            eleman = (Integer)listIterator.next();

            if (eleman>5){
                listIterator.set(eleman-1);
            }else{
                listIterator.set(eleman+1);
            }
        }
        System.out.println(sayilar); // [5, 5, 9, 7, 3, 5, 5, 7]


        // tum sayilari iterator ile silin
        // iterator sonda

        while (listIterator.hasPrevious()){

            listIterator.previous();
            listIterator.remove();
        }

        System.out.println(sayilar); //  []



    }
}
