package day15_multiDimensionalArrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C10_set {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Deniz");
        isimler.add("Omer");
        isimler.add("Esra");
        isimler.add("Hamza");
        isimler.add("Basak");

        System.out.println(isimler); // [Deniz, Omer, Esra, Hamza, Basak]

        System.out.println(isimler.get(1)); // Omer
        // System.out.println(isimler.get(8)); // IndexOutOfBoundsException

        isimler.add(3,"Azim");

        System.out.println(isimler); // [Deniz, Omer, Esra, Azim, Hamza, Basak]

        // set()'u bir elementi UPDATE (yeni deger atamak) icin kullanilir

        isimler.set(3,"Gulnur");

        System.out.println(isimler); // [Deniz, Omer, Esra, Gulnur, Hamza, Basak]


        // Method'larin yaptigi is ile bize döndürdüğü sonuç FARKLI OLABILIR
        System.out.println(isimler.set(2, "Yusuf"));  // Esra

        System.out.println(isimler); // [Deniz, Omer, Yusuf, Gulnur, Hamza, Basak]

        isimler.set(0,"Ayca");

        System.out.println(isimler); // [Ayca, Omer, Yusuf, Gulnur, Hamza, Basak]


    }
}
