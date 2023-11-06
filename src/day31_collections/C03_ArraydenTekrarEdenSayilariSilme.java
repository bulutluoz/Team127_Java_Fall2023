package day31_collections;

import java.util.Arrays;

public class C03_ArraydenTekrarEdenSayilariSilme {
    public static void main(String[] args) {
        // verilen array'den tekrar eden elementleri silip
        // array'i her bir elementin unique oldugu hali ile kaydedin

        int[] arr = {2,4,6,4,1,2,5,7,9,4,5,7,2,6,8,2,1};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // [1, 2, 2, 2, 4, 4, 4, 5, 5, 6, 7, 7, 9]

        // 1.yontem- once bir forloop ile kac tane silinecek sayi var bulup
        // sonra bos bir array olusturup uygun olan elementleri ona tasiyabiliriz

        // 2.yontem bir loop ile elemanlari gozden gecirip
        // bir oncekine esit olan element varsa, olusturacagim ayri bir method'la
        // o elemnti silip, arrayi degistiririm

        //1. yontemle yapalim

        int silinecekElemanSayisi=0;
        for (int i = 0; i < arr.length-1 ; i++) {

            if (arr[i] == arr[i+1]){
                silinecekElemanSayisi++;
            }
        }

        int[] yeniArr = new int[arr.length-silinecekElemanSayisi]; // 13-6 = 7 [0, 0, 0, 0, 0, 0, 0]

        int konulacakIndex=0;

        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] != arr[i+1]) {
                yeniArr[konulacakIndex] = arr[i];
                konulacakIndex++;
            }
        }

        if (arr[arr.length-1] != yeniArr[yeniArr.length-1]){
            yeniArr[yeniArr.length-1] = arr[arr.length-1];
        }

        arr = yeniArr;
        System.out.println(Arrays.toString(arr));
    }
}
