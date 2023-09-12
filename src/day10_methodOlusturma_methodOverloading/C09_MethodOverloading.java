package day10_methodOlusturma_methodOverloading;

public class C09_MethodOverloading {

    public static void main(String[] args) {
        /*
            Bir class'da ayni isim ve esit sayida parametre ile
            birden fazla method olusturulabilir mi ?

            parametrelerin data turleri ayni olmazsa
            birden fazla ayni isimde method olusturulabilir

            Java'da method ismi ve parametrelerin data turleri birlikte kullanilarak
            method signature olusur

            method signature'i farkli olmak uzere
            bir class'da istediginiz kadar
            ayni isimde method olusturabilirsiniz

            Buna OVERLOADING denir

         */

        toplama(4,5); // Iki int sayinin toplami : 9
        toplama(5,6.3); // int ve double 2 sayinin toplami : 11.3
        toplama(5.3,5); // double ve int 2 sayinin toplami : 10.3
    }

    // verilen iki integer sayiyi toplayip yazdiran bir method olusturun

    public static void toplama(int sayi1 , int sayi2){ // toplama int int
        System.out.println("Iki int sayinin toplami : " + (sayi1+sayi2));
    }

    // verilen iki integer sayiyi toplayip yazdiran bir method olusturun

    public static void toplama(int a , double b){ // toplama int double
        System.out.println("int ve double 2 sayinin toplami : " + (a+b));
    }


    public static void toplama(double a , int b){ // toplama double int
        System.out.println("double ve int 2 sayinin toplami : " + (a+b));
    }
}
