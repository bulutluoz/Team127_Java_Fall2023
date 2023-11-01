package day36_genelTekrar;

import java.util.Arrays;

public class C04_EksikElemaniBulma {

    public static void main(String[] args) {

        /*
        sirali tek pozitif tam sayilardan olusan bir array veriliyor
        array'de eksik olan tek sayiyi bulan bir method olusturun
        input : [1,3,5,7,9,13,15,17] output : 11
        input : [9,7,3] output : 5
        */

        int[] arr =  {1,3,5,7,9,13,15,17};

        System.out.println(eksikSayiyiBul(arr)); // 11

        int[] arr2 = {9,7,3};

        System.out.println(eksikSayiyiBul(arr2)); // 5

    }


    public static int eksikSayiyiBul(int[] input){

        Arrays.sort(input);
        int eksikSayi=0;

        for (int i = 0; i < input.length-2 ; i++) {

            if (input[i+1] - input[i] != 2){
                eksikSayi = input[i]+2;
            }
        }
        return eksikSayi;
    }
}
