package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C09_DoWhileLoop {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere sayilar isteyin
        // Kullanici 0'a basincaya kadar islemi tekrar ettirin
        // Kullanici 0'a bastiginda girilen sayilarin toplamini yazdirin

        Scanner scanner = new Scanner(System.in);
        int toplam= 0 ;
        int sayi;

        do {
            System.out.println("Lutfen toplanmak uzere bir sayi giriniz\nislemi bitirmek icin 0'a basin");
            sayi = scanner.nextInt();

            toplam += sayi;
        }while (sayi != 0);

        System.out.println("Girilen sayilarin toplami : " + toplam);

    }
}
