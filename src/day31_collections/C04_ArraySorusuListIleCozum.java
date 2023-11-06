package day31_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraySorusuListIleCozum {

    public static void main(String[] args) {
        // verilen array'den tekrar eden elementleri silip
        // array'i her bir elementin unique oldugu hali ile kaydedin

        int[] arr = {2,4,6,4,1,2,5,7,9,4,5,7,2,6,8,2,1};

        List<Integer> tekrarsizList = new ArrayList<>();

        // array'deki elementleri elden gecirelim
        // list'de yoksa ekleyelim
        for (int i = 0; i < arr.length ; i++) {

            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }
        }

        // array'e list'in uzunlugunu tasiyan yeni bir deger atayalim
        arr = new int[tekrarsizList.size()]; // [0, 0, 0, ....]

        // bir loop ile listedeki elementleri array'e kaydedelim
        for (int i = 0; i < arr.length ; i++) {

            arr[i] = tekrarsizList.get(i);
        }

        System.out.println("List olarak tekrarsiz elementler : " + tekrarsizList);

        System.out.println("Array'in son hali : " + Arrays.toString(arr));
    }


}
