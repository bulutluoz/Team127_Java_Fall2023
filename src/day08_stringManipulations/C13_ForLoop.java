package day08_stringManipulations;

import java.util.Scanner;

public class C13_ForLoop {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        //        sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //        Bitis degeri baslangic degerinden kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Baslangic degeri giriniz");
        int bas = scanner.nextInt();

        System.out.println("Bitis degeri giriniz");
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (bitis > bas){ // bitis degeri baslangictan buyuk

            for (int i = bas; i <=bitis ; i++) {
                toplam +=i;
            }

        }else { // bitis degeri baslagictan kucuk
            for (int i = bitis; i <=bas ; i++) {
                toplam += i;
            }
        }

        System.out.println("verilen aralikdaki sayilarin toplami : "+ toplam);
    }
}
