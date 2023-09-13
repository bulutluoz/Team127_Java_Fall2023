package day11_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        //Soru 2- While loop kullanarak
        //        kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen rakamlar toplamini bulmak icin bir sayi giriniz");
        int girilenSayi = scanner.nextInt();

        int rakam = 0;
        int rakamlarToplami = 0;
        int geciciSayi = girilenSayi;

        while (geciciSayi>0){

            rakam = geciciSayi%10;
            rakamlarToplami += rakam;
            geciciSayi /= 10;
        }

        System.out.println(girilenSayi+" sayisinin rakamlar toplami : " + rakamlarToplami);
    }
}
