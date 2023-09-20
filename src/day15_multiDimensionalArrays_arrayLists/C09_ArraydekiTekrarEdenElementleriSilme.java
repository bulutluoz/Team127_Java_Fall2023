package day15_multiDimensionalArrays_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydekiTekrarEdenElementleriSilme {

    public static void main(String[] args) {

        // Verilen bir int array'de,
        // tekrar eden elementleri silip
        // array'i her elementin unique oldugu bir hale getirin

        int[] arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

        // bir list olusturalim
        List<Integer> uniqueList = new ArrayList<>();
        // array'in tum elemanlarini tek tek ele alalim
        // liste'de olup olmadigina bakalim, listede yoksa ekleyelim

        for (int i = 0; i < arr.length ; i++) {

            if (!uniqueList.contains(arr[i])){
                uniqueList.add(arr[i]);
            }
        }
        System.out.println("Unique list : " + uniqueList);
        // Unique list : [3, 2, 5, 6, 7, 8, 9, 0, 1, 4]

        // yeni bir array olusturalim
        int[] yeniArr = new int[uniqueList.size()];
        System.out.println(Arrays.toString(yeniArr)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        // listedeki elementleri yeni array'e atayalim

        for (int i = 0; i < yeniArr.length ; i++) {

            yeniArr[i] = uniqueList.get(i);
        }

        // yeni array'i de eski array'e deger olarak atayalim
        arr = yeniArr ;

        Arrays.sort(arr);
        System.out.println("Array'in son hali : " + Arrays.toString(arr));
        // Array'in son hali : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
