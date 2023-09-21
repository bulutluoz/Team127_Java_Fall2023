package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_FibonacciSayilari {
    public static void main(String[] args) {

        //Soru 5- Verilen pozitif tamsayidan kucuk
        //        Fibonacci sayilarini bir liste olarak bize donduren
        //        bir method olusturun.

        System.out.println(fibonacciListesi(500));
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377]

        System.out.println(fibonacciListesi(1000));
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987]

    }

    public static List<Integer> fibonacciListesi(int ustSinir){


        List<Integer> fibonacciListesi = new ArrayList<>();

        if (ustSinir == 0){
            fibonacciListesi.add(0);
        } else if (ustSinir == 1) {
            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
            fibonacciListesi.add(1);
        }else { // ust sinir 1'den buyuk
            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
            fibonacciListesi.add(1);

            int yeniSayi;
            int index = 3;

            do {
                yeniSayi = fibonacciListesi.get(index-2) + fibonacciListesi.get(index-1);

                if (yeniSayi <= ustSinir){
                    fibonacciListesi.add(yeniSayi);
                }
                index++;

            }while(yeniSayi<=ustSinir);
        }

        return fibonacciListesi;
    }
}
