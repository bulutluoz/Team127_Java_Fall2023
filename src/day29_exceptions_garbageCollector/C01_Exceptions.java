package day29_exceptions_garbageCollector;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {

    public static void main(String[] args) {

        // kullanicidan toplanmak uzere sayilar isteyin
        // kullanici islemi bitirmek icin Q'ya basmalidir
        // kullanici Q'ya bastiginda,
        // kac sayi girildigini ve toplamin ne oldugunu yazdirin

        double girilenSayi=0;
        double toplam=0;
        int sayac=0;
        Scanner scanner = new Scanner(System.in);
        boolean devamEdelimMi= true;

        while(devamEdelimMi){

            System.out.println("Toplanmak uzere sayi giriniz\nBitirmek icin Q'ya basiniz");

            try { // giris sorunsuz oldugunda calisacak
                girilenSayi = scanner.nextDouble();
                toplam += girilenSayi;
                sayac++;

            } catch (InputMismatchException e) { // kullanici sayi disinda bir deger girerse
                String sayiOlmayanDeger = scanner.nextLine();
                if (sayiOlmayanDeger.equalsIgnoreCase("Q")){
                    devamEdelimMi=false;
                }else{
                    System.out.println("Hatali giris, Sayi girmelisiniz, Bitirmek icin de Q'ya basmalisiniz");
                }
            }
        }

        System.out.println("Girilen "+ sayac + " adet sayinin toplami : " + toplam);


    }
}
