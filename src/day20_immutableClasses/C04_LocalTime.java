package day20_immutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C04_LocalTime {
    public static void main(String[] args) {
        /*
            localtime objesi canli bir kronometre degil
            olusturuldugu anda sistemin saat bilgisini kaydeden bir variable'dir.
         */

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // 12:04:21.453676

        LocalTime turkiyeSaati = LocalTime.now(ZoneId.of("Europe/Paris")).plusHours(1);

        System.out.println(turkiyeSaati); // 13:07:37.990002

        LocalTime japonyaSaati = LocalTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(japonyaSaati); // 19:09:19.261636


        System.out.println(localTime.toNanoOfDay()); // 43854639213000


        // yuzbin ile 1 milyon arasindaki sayilarin toplamini
        // ve toplama isleminin kac nanosaniye surdugunu yazdirin


        System.out.println("loop basinda locatime : "+ localTime);
        LocalTime baslangic = LocalTime.now();
        System.out.println("Baslangic : " + baslangic);
        System.out.println("Baslangicta nano saniye : " + baslangic.toNanoOfDay());

        long toplam = 0;

        for (int i = 1; i <10000 ; i++) {
            toplam = 0;
            for (int j = 100000; j <=1000000 ; j++) {
                toplam +=j ;
            }
        }


        System.out.println("toplam : " + toplam);
        System.out.println("loop sonunda locatime : "+localTime);
        LocalTime bitis = LocalTime.now();
        System.out.println("Bitis : " + bitis);
        System.out.println("Bitiste nano saniye : " + bitis.toNanoOfDay());

        System.out.println("Islem suresi " + (bitis.toNanoOfDay()-baslangic.toNanoOfDay()));

    }
}
