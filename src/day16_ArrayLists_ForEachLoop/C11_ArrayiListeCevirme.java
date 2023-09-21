package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C11_ArrayiListeCevirme {

    public static void main(String[] args) {

        Integer[] arr = {3,2,5,6,7,2,8,9,0,1,2,3,4,7,5,4};

        List<Integer> sayilar = new ArrayList<>();

        for (Integer each : arr
             ) {

            sayilar.add(each);
        }

        System.out.println("Liste : " + sayilar);
    }
}
