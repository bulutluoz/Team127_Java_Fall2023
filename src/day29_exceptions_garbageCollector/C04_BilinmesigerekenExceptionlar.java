package day29_exceptions_garbageCollector;

public class C04_BilinmesigerekenExceptionlar {

    public static void main(String[] args) {

        String str = "Java Candir";

        // Integer sayi = str ;

        Object obj = str;  // arada parent child iliskisi oldugundan auto widening

        //Integer sayi = (Integer) obj; // arada parent child iliskisi oldugundan explicit narrowing yapilabilir
        // ClassCastException


        String aramaSonucuStr = "123a";
        Integer aramaSonucuInt = Integer.parseInt(aramaSonucuStr);
        // NumberFormatException

        // arama sonuc sayisinin 100'den fazla oldugunu test edin

        if (aramaSonucuInt>100){
            System.out.println("arama sonucu 100'den buyuk, test PASSED");
        }else{
            System.out.println("arama sonucu 100'den buyuk degil, test FAILED");
        }

    }
}
