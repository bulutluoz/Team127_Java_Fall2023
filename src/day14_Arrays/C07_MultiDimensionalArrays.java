package day14_Arrays;

public class C07_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] arr = {3,6,8,1};

        // arr'nin tum elementlerini yazdirin

        for (int i = 0; i < arr.length ; i++) {

            System.out.print(arr[i] + " ");
        } // 3 6 8 1

        System.out.println("");

        int[][] sayilar = {{3,5,6},{2,7},{1,5,8},{1}};
        // sayilar array'indeki tum elementleri yazdirin

        for (int i = 0; i < sayilar.length ; i++) { // outer loop outer array'i kontrol eder

            for (int j = 0; j < sayilar[i].length ; j++) { // inner loop da inner array'i kontrol edecek

                System.out.print(sayilar[i][j] + " ");
            }
        } // 3 5 6 2 7 1 5 8 1

    }
}
