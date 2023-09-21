package day16_ArrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C09_ArrayiListeCevirme {
    public static void main(String[] args) {

        Integer[] arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};
        /*
            uzun bir array'i list'e cevirmenin
            en kullanisli yolu
            bir for-loop ile elementleri tasimaktir

            Arrays class'inda asList() method'u da array'i list'e cevirir
            ANCAK 2 buyuk problemi vardir

            1- array'den cevirdigimiz list'e ekleme cikarma gibi
               size'i degistiren islemler yapamazsiniz
            2- bu method array ve cevirdigi list'i eslestirir
               array'de yaptiginiz degisiklik list'e
               list'te yaptiginiz degisiklik array'e islenir
         */

        List<Integer> sayilar = Arrays.asList(arr);

        System.out.println("Sayilar Listesi : " + sayilar);
        // Sayilar Listesi : [3, 2, 5, 6, 7, 2, 8, 9, 0, 1, 2, 3, 4, 7, 5, 4]

        // sayilar.add(10); // UnsupportedOperationException
        // sayilar.remove(3); // UnsupportedOperationException


        System.out.println("Array : "+Arrays.toString(arr));
        // Array : [3, 2, 5, 6, 7, 2, 8, 9, 0, 1, 2, 3, 4, 7, 5, 4]


        // Array'in 0.index'indeki sayiyi 33 yapin
        arr[0] = 33;
        System.out.println("Array : "+Arrays.toString(arr));
        // Array : [33, 2, 5, 6, 7, 2, 8, 9, 0, 1, 2, 3, 4, 7, 5, 4]

        System.out.println("array'i degistirdikten sonra Sayilar Listesi : " + sayilar);



    }
}
