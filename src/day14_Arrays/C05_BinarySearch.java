package day14_Arrays;

import day13_arrays.C06_Arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        int[] arr = {3,6,1,8,2,9,12,-1,4,3};

        // arr'de 5'in olup olmadigini ve varsa kac tane oldugunu yazdirin
        C06_Arrays.elemanSayisiYazdir(arr,5); // Aranan eleman array'de yok

        // arr'de 3'in olup olmadigini ve varsa kac tane oldugunu yazdirin
        C06_Arrays.elemanSayisiYazdir(arr,3); // Aranan eleman array'de 2 kere kullanilmis

        System.out.println("========");
        System.out.println(Arrays.binarySearch(arr, 8)); // -11
        System.out.println(Arrays.binarySearch(arr, 9)); // -11
        System.out.println(Arrays.binarySearch(arr, 2)); // 4  dogru
        System.out.println(Arrays.binarySearch(arr, 1)); // -1
        // binarySearch() kullanmadan once sort() kullanmazsaniz
        // sonucun ne olacagini BILEMEYIZ
        // dogru da olabilir, yanlis da olabilir


        String[] isimler = {"Esra","Ibrahim","Huseyin","Omer","Azim","Azim"};
        // isimler'de Esra'nin olup olmadigini donduren bir method olusturun

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler)); // [Azim, Azim, Esra, Huseyin, Ibrahim, Omer]

        // Array'de arama yapmadan once sort YAPILMALIDIR
        // Aradigimiz element varsa, ilk kullanimin index'ini dondurur
        System.out.println(Arrays.binarySearch(isimler, "Esra")); // 2
        System.out.println(Arrays.binarySearch(isimler, "Azim")); // 0
        System.out.println(Arrays.binarySearch(isimler, "Omer")); // 5

        // eleman yoksa olsaydi hangi sirada olacagini - isareti ile birlikte dondurur

        System.out.println(Arrays.binarySearch(isimler, "Ayca")); // -1
        System.out.println(Arrays.binarySearch(isimler,"Deniz")); // -3



    }
}
