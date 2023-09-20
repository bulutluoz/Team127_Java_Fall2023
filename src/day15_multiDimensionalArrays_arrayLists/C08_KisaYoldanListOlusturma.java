package day15_multiDimensionalArrays_arrayLists;


import java.util.ArrayList;
import java.util.List;

public class C08_KisaYoldanListOlusturma {

    public static void main(String[] args) {

        int[] arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

        // yukardaki elementlerin oldugu bir arrayList olusturun

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar); // 3, 2, 5, 6, 7, 2, 8, 9, 0, 1, 2, 3, 4, 7, 5, 4]


    }
}
