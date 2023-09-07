package day08_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {

        String str = "Arama sonucunda 1434 kelimeye ulasildi";

        // arama sonuclarinin 100'den fazla oldugunu test edin
        // 100'den fazla ise "Test Passed",
        // 100'den fazla degilse "Test Failed" yazdirin

        str = str.replaceAll("\\D",""); // "1434"

        int sonucSayisi = Integer.parseInt(str);
        // parseInt() icinde sadece digit bulunan String'i
        // Integer'a donusturur

        if (sonucSayisi > 100){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }



    }
}
