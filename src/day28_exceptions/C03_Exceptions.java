package day28_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {
        // kullanicidan iki tamsayi alin
        // ilk sayiyi ikinciye bolup yazdirin

        /*
            Bir kod yazarken
            olasi risk durumlarini analiz etmek
            ve bu riskler gerceklesirse ne yapacagini Java'ya soylemek
            iyi bir kod yazarinin gorevidir

            Java'da ongorulen bir hatayi
            exception olusmadan cozmek icin (handle etmek)
            try-catch/finally bloklari kullanilir

            1- hatanin olusabilecegi satirlari bir try blog'unun icine alin
            2- olasi exception'i catch (olasiExceptionAdi exceptioniKaydedecegimizObje)
               seklinde yaz
            3- exception olusmasi durumunda calismasini istedigimiz kodu
               catch() { catch blogu} na yaz

             Eger birden fazla olasi exception varsa
             1- ic ice try-catch bloklari olusturabiliriz
             2- bir try birden fazla catch yazabiliriz
             3- Eger tum olasi exception'lari kapsayan bir exception varsa
                tek catch ile genis kapsamli exception yazilabilir

         */

        Scanner scanner = new Scanner(System.in);
        /* ic-ice try-catch
        try{
            try{
                System.out.println("Lutfen iki tamsayi giriniz");

                int sayi1 = scanner.nextInt();
                int sayi2 = scanner.nextInt();
                System.out.println("Sayilarin bolumu : " + sayi1/sayi2);

            }catch (ArithmeticException e){

                System.out.println("Ikinci sayi 0 olamaz");
            }

        }catch (InputMismatchException f){
            System.out.println("Tamsayi girmelisiniz");
        }

         */

        /*
        try {
            System.out.println("Lutfen iki tamsayi giriniz");

            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("Sayilarin bolumu : " + sayi1/sayi2);
        }catch (ArithmeticException e){
            System.out.println("ikinci sayi 0 olamaz");
        }catch (InputMismatchException f){
            System.out.println("tamsayi girmelisiniz");
        }

         */

    }
}
