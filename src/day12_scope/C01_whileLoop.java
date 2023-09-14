package day12_scope;

import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere tam sayilar isteyin
        // toplam 500 oldugunda veya gectiginde islemi durdurup
        // kac sayi girildigini ve toplamlarini yazdirin

        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int sayac = 0 ;

        while (toplam < 500){

            System.out.println("Lutfen toplanmak uzere sayi giriniz");
            sayi = scanner.nextInt();
            toplam += sayi ;
            sayac++;
        }


        System.out.println(sayac+ " adet sayi girdiniz, sayilarin toplamlari : " + toplam);

    }
}
