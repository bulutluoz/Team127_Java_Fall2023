package day10_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C02_MaximumSayiyiBulma {

    public static void main(String[] args) {

        // Kullanicidan method icerisinde 3 sayi alip
        // bu 3 sayidan en buyuk olani yazdiran bir method olusturun


        enBuyukSayiyiyazdir();





    }

    public static void enBuyukSayiyiyazdir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("En buyuk sayiyi bulmak icin , 3 adet sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        double sayi3 = scanner.nextDouble();

        if (sayi1>sayi2 && sayi1>sayi3) System.out.println("En buyuk sayi : " + sayi1);
        else if (sayi2>sayi1 && sayi2>sayi3) System.out.println("En buyuk sayi : " + sayi2);
        else if (sayi3>sayi1 && sayi3>sayi2) System.out.println("En buyuk sayi : " + sayi3);
        else System.out.println("En buyuk sayiyi bulamadim");

    }

}
