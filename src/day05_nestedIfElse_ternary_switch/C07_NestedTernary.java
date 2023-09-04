package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C07_NestedTernary {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi alin
        // sayi pozitifse 100'den buyuk veya kucuk oldugunu yazdirin
        // sayi negatifse tek veya cift oldugu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println(
                sayi > 0
                ?
                //sayi 0'dan buyukse yazdirilacak kisim
                sayi>100 ? "sayi buyuk" : "sayi kucuk"
                :
                // sayi negatifse
                sayi %2 == 0 ? "Sayi cift" : "Sayi tek"

        );
        /*
        System.out.println(
                sayi > 0 ? sayi>100 ? "sayi buyuk" : "sayi kucuk" : sayi %2 == 0 ? "Sayi cift" : "Sayi tek"
        );

         */

    }
}
