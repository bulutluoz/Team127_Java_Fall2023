package day01_javaGiris;

public class C03_VariableOlusturma {

    public static void main(String[] args) {

        int sayi = 20;


        System.out.println(sayi); // 20

        System.out.println("sayi"); // sayi

        int sayi2;

        sayi2 = 30;

        /*

        java'da = isareti ATAMA islemidir
         ='in solunda sadece variable olur

         ='in saginda ise deger olur

         java = isareti gorunce
         once sag taraftaki degeri hesaplar
         buldugu sonucu deger olarak soldaki variable'a atar
         */

        int a = 10 ;

        a = a + 20 ;

        a = 2 * a + 1 ;

        float sayiFl = 3.4F ;

        float sayi3 = 20f;
        float sayi4 = 6f;

        System.out.println(sayi3/sayi4); // 3.3333333

        double sayi5 = 20;
        double sayi6 = 3;

        System.out.println(sayi5 / sayi6); // 6.666666666666667

    }
}
