package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //         Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //         Cinsiyet ve yasini dikkate alarak
        //         “Emekli olabilirsin” veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.


        // once degiskenlerden birini ana degisken kabul edip, ona gore yapi olusturalim
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E: Erkek K:Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0); // kullanici nasil girerse girsin, buyuk harfe cevirir

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scanner.nextDouble();


        if ( cinsiyet == 'E'){ // sadece erkekler

            if (yas<20 || yas >80){
                System.out.println("Yas girisi hatali");
            } else if (yas>=65) {
                System.out.println("Erkek emekli olabilir");
            }else{
                System.out.println("Erkek emekli olmak icin daha " + (65-yas) + " yil calismalidir.");
            }


        } else if (cinsiyet == 'K') { // sadece kadinlar

            if (yas<20 || yas >80){
                System.out.println("Yas girisi hatali");
            } else if (yas>=60) {
                System.out.println("Kadin emekli olabilir");
            }else{
                System.out.println("Kadin emekli olmak icin daha " + (60-yas) + " yil calismalidir.");
            }

        }else {
            System.out.println("Cinsiyet icin girilen deger yanlis");
        }
    }
}
