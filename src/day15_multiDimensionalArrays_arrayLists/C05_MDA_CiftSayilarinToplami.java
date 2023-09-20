package day15_multiDimensionalArrays_arrayLists;



public class C05_MDA_CiftSayilarinToplami {
    public static void main(String[] args) {

        // Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip,
        //         sonucu yazdiran bir method olusturun.

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{5,2}}; // Array'deki cift sayilarin toplami : 14

        ciftSayilarToplaminiYazdir(arr);

    }

    public static void ciftSayilarToplaminiYazdir(int[][] arr){

        int toplam = 0 ;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] % 2 == 0){
                    toplam += arr[i][j];
                }
            }
        }

        System.out.println("Array'deki cift sayilarin toplami : " + toplam);
    }

}
