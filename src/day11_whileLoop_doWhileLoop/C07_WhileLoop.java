package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //        While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran
        //        bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen us hesaplamak istediginiz pozitif tamsayiyi giriniz");
        int sayi = scanner.nextInt();

        System.out.println("Lutfen hesaplanacak us degerini pozitif tamsayi olarak giriniz");
        int us = scanner.nextInt();

        usHesapla(sayi,us);

    }


    public static void usHesapla(int sayi, int us){

        // sayi 3  us 5 olsa  3 * 3 * 3 * 3 * 3
        int sonuc =1;
        int geciciUs = us;

        while (geciciUs>0){
            sonuc *= sayi ;
            geciciUs--;
        }

        System.out.println(sayi + " uzeri " + us + " : " + sonuc);
    }
}
