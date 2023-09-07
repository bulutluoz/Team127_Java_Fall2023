package day08_stringManipulations;

import java.util.Scanner;

public class C12_ForLoop {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //         Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Baslangic degeri giriniz");
        int bas = scanner.nextInt();

        System.out.println("Bitis degeri giriniz");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (bitis < bas){
            System.out.println("Bitis degeri baslangic degerinden kucuk olamaz");
        }else{ // bu durum toplam hesaplayacagimiz durumdur

            for (int i = bas; i <=bitis ; i++) {

                toplam += i;
            }

            System.out.println("Girilen aralikdaki sayilarin toplami : " + toplam);
        }
    }
}
