package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin ve
        //         kullaniciya duzeltmesi gereken tum eksikleri soyleyin,ve yeni deger isteyin
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         	- ilk harf kucuk harf olmali
        //         	- son karakter rakam olmali
        //         	- sifre bosluk icermemeli
        //         	- uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        String sifre = " "; // sartlari saglamayan bir ilk deger atamasi yaptik

        while(!sifreKontrolEt(sifre)){ // sifre true donerse loop'un bitmesi icin basina ! yazdik

            System.out.println("Lutfen sifrenizi giriniz");
            sifre = scanner.nextLine();

        }
    }








    // bu class'da girilen sifreyi kontrol edip
    // uygun sifre ise true, uygun degilse false donduren bir method olusturalim

    public static boolean sifreKontrolEt(String sifre){

        // flag kullanalim
        int flag = 10;

        //         	- ilk harf kucuk harf olmali
        char ilkHarf = sifre.charAt(0);

        if (!(ilkHarf>= 'a' && ilkHarf<='z')){
            System.out.println("Ilk karakter kucuk harf olmali");
            flag = 11;
        }


        //         	- son karakter rakam olmali

        char sonKarakter = sifre.charAt(sifre.length()-1);

        if (!(sonKarakter>='0' && sonKarakter<='9')){
            System.out.println("Son karakter rakam olmali");
            flag = 11;
        }


        //         	- sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            flag = 11;
        }

        //         	- uzunlugu en az 10 karakter olmali

        if (!(sifre.length()>=10)){ // sifre.length() < 10
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            flag=11;
        }

        // bagimsiz if cumlelerinden sonra
        // flag ya 10 degerinde olacak ya da 11
        if (flag == 10){
            return true;
        }else {
            return false;
        }

    }
}
