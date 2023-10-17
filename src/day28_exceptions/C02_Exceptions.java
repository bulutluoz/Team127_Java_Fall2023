package day28_exceptions;

import java.util.Scanner;

public class C02_Exceptions {

    public static void main(String[] args) {

        // kullanicidan iki tamsayi alin
        // ilk sayiyi ikinciye bolup yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi2 != 0){
            System.out.println("Sayilarin bolumu : " + sayi1/sayi2);
        }else {
            System.out.println("ikinci sayi 0 olamaz");
        }
    }
}
