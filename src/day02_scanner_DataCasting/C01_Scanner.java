package day02_scanner_DataCasting;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        //Soru 1- Kullanicidan uc farkli data turunde deger alip,
        //        girilen degerleri aciklamalariyla yazdirin.


        // adim 1 - scanner objesi olusturalim
        Scanner scanner = new Scanner(System.in);

        // adim 2 - kullaniciya ne istediginizi soyleyin
        System.out.println("Lutfen isminizi giriniz");

        // adim 3 - girilen bilgiye uygun bir variable olusturup
        //          data turune uygun next....() ile bilgiyi alip kaydedin
        // String girilenIsim= scanner.next(); // sadece ilk ismi alir

        String  girilenIsim = scanner.nextLine();



        // ikinci olarak bir tamsayi isteyelim mesela yasini isteyelim

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();



        // emekli misiniz? true / false

        System.out.println("Emekli misiniz ? true veya false olarak giriniz");
        boolean emekliMi = scanner.nextBoolean();


        System.out.println("Girdiginiz isim : " + girilenIsim );
        System.out.println("Yasiniz : " + yas);
        System.out.println("Emekli misiniz : " + emekliMi);


    }
}
