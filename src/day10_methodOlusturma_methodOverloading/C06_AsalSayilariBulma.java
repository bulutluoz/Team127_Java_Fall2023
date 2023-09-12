package day10_methodOlusturma_methodOverloading;

public class C06_AsalSayilariBulma {
    public static void main(String[] args) {

        // bir onceki class'da olusturulan method'u kullanarak
        // 3 basamakli sayilardan asal olanlari yazdirin

        for (int i = 100; i <1000 ; i++) {

            if (C05_AsalSayiMiDondur.asalMiDondur(i)){
                System.out.print(i + " ");
            }
        }

        // 4 basamakli kac tane asal sayi var ?
        System.out.println("");
        int sayac=0;

        for (int i = 1000; i <10000 ; i++) {

            if (C05_AsalSayiMiDondur.asalMiDondur(i)){
                sayac++;
            }
        }

        System.out.println("4 Basamakli sayilardaki asal sayi adedi : " + sayac);
    }
}
