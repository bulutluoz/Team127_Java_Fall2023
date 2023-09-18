package day13_arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {
        int sayi = 10;

        int[] arr = {4,6,1,2};

        // Bu array'i yazdiralim

        System.out.println(sayi); // 10

        System.out.println(arr); // [I@2752f6e2

        // Array'ler direk yazdirilamaz,
        // direk yazdirmak isterseniz, array'i degil referansini yazdirir

        // Array'i yazdirmak icin Arrays class'indan yardim almaliyiz

        System.out.println(Arrays.toString(arr)); // [4, 6, 1, 2]

        String[] kelimeler ={"Ali", ", okula"," gitti."};
        System.out.println(Arrays.toString(kelimeler)); // [Ali, , okula,  gitti.]


        // Array'in tum elementlerini yazdirin
        System.out.println(arr[0]); // 4
        System.out.println(arr[1]); // 6
        System.out.println(arr[2]); // 1
        System.out.println(arr[3]); // 2
        System.out.println("============");

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        } // 4 6 1 2

        /*
            Biz ne zaman array'in tum elementleri ile ilgili bir islem yapmak istesek
            bir for loop olusturup
                 arr[i]
            uzerinden istenen islemleri yapabiliriz
         */
    }
}
