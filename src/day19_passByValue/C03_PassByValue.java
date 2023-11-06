package day19_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        // Main method’da verilen fiyat degerine %10, %20 ve %30 indirim yaparak,
        // indirimli fiyati bize döndüren 3 method olusturun.
        // Main method’dan bu 3 method’u arka arkaya cagirip,
        // return edilen fiyatlari yazdirin

        double fiyat = 100 ;

        System.out.println("%10 indirimli fiyat :"+ indirim10(fiyat));
        System.out.println("%20 indirimli fiyat :"+indirim20(fiyat));
        System.out.println("%30 indirimli fiyat :"+indirim30(fiyat));

        System.out.println("indirimli fiyatlar yazdirildiktan sonra fiyat : " + fiyat);

    }


    public static double indirim10(double fiyat ){

        fiyat = fiyat * 90 / 100 ;

        return fiyat;
    }

    public static double indirim20(double fiyat ){

        fiyat = fiyat * 80 / 100 ;

        return fiyat;
    }

    public static double indirim30(double fiyat ){

        fiyat = fiyat * 70 / 100 ;

        return fiyat;
    }
}
