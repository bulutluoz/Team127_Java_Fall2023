package day34_NestedMaps;

import day32_maps.MapMethodDepo;

import java.util.HashMap;
import java.util.Map;

public class C03_FarkliDataTurleriIleMapOlusturma {

    public static void main(String[] args) {
        /*

         {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2023-07-21",
                   "checkout" : "2023-08-10"
                      },
            "additionalneeds" : "wi-fi" }

         */
        Map<String, Object> bookingMap =
                MapMethodDepo.rezervasyonOlustur("Hasan","Yan",300,true,"2023-10-21","2023-10-25","wi-fi");


        System.out.println(bookingMap);

        Map<String,Object> bookingMap2 = MapMethodDepo.rezervasyonOlustur("Zeliha","Selcuk",200,false,"2023-11-07","2023-11-11",null);


        /*
            {
            firstname=Hasan,
            additionalneeds=wi-fi,
            bookingdates={
                            checkin=2023-10-21,
                            checkout=2023-10-25
                            },
           totalprice=300,
           depositpaid=true,
           lastname=Yan
           }
         */
    }
}
