package day15_multiDimensionalArrays_arrayLists;


import java.util.ArrayList;
import java.util.List;

public class C07_ArrayList {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        System.out.println(sayilar); // []

        System.out.println(sayilar.size()); // 0

        System.out.println("Liste bos mu : " + sayilar.isEmpty());



        sayilar.add(5);
        sayilar.add(0,7);

        System.out.println(sayilar); // [7, 5]

        System.out.println(sayilar.size()); // 2

        System.out.println("Liste bos mu : " + sayilar.isEmpty());


        System.out.println(sayilar.contains(5)); // true
        System.out.println(sayilar.contains(3)); // false


        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(8);
        System.out.println(sayilar); // [7, 5, 3, 2, 8]

        List<Integer> rakamlar = new ArrayList<>();
        rakamlar.add(3);
        rakamlar.add(8);
        rakamlar.add(5);

        System.out.println(sayilar.containsAll(rakamlar)); // true

        rakamlar.add(9);
        System.out.println(rakamlar); // [3, 8, 5, 9]

        System.out.println(sayilar.containsAll(rakamlar)); // false

    }
}
