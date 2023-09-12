package day10_methodOlusturma_methodOverloading;

public class C10_MethodOverloading {

    public static void main(String[] args) {
          /*
            Bir Method Call yapildiginda
            Java hangi method'un calisacagina karar vermek icin
            asagidakileri kontrolleri yapar

            1- isim
            2- argument sayisi ile parametre sayisi
            3- argument olarak yazilan DEGERler ile PARAMETRElerin data turunun uyumlu olmasi
            4- eger argument ve parametreler %100 uyumlu olmazsa
               minumun sayida casting ile calistirabilecegi method'u tercih eder
         */

        toplama(5,7); // double ve int 2 sayinin toplami : 12.0

    }



    public static void toplama(double a , int b){ // toplama double int
        System.out.println("double ve int 2 sayinin toplami : " + (a+b));
    }

    public static void toplama(double a , double b){ // toplama double double
        System.out.println("double ve double 2 sayinin toplami : " + (a+b));
    }
}

