package day11_whileLoop_doWhileLoop;

public class C08_DoWhileLoop {

    public static void main(String[] args) {

        /*
            While loop'u kullanicidan deger alinan
            ve/veya tekrar sayisi belli olmayan durumlarda kullanmayi tercih ediyoruz

            while loop'un 2 tane negatif yonu vardir
            1- loop oncesinde baslangic degerini bizim atamamiz gerekir
               kullanicidan degeri loop icinde aliriz
               eger ilk deger atamasinda dikkat edilmezse
               hatali bir deger atanabilir ve bu durumda loop calismayabilir

            2- kontrol islemi basta yapilip, body sonradan calistigi icin
               kontrol islemi hep bir fazla yapilir
         */


        int sayi = 5 ;

        // verilen sayi(dahil) ile 3(haric) arasindaki sayilari yazdirin

        while (sayi > 3){

            System.out.print(sayi + " ");
            sayi-- ;
        }

        // Java ozellikle kullanicidan deger alirken
        // ilk degeri yanlis atamamamiz icin
        // bir alternatif olarak do-while loop'u olusturmustur
        // do-while loop'da once islem yapilir, sonra kontrol edilir


        sayi = 5 ;

        // verilen sayi(dahil) ile 3(haric) arasindaki sayilari yazdirin

        do {
            System.out.print(sayi + " ");
            sayi-- ;
        }while (sayi > 3);
    }
}
