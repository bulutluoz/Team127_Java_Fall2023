package day33_MapUpdate_EntryKullanimi;

import java.util.HashMap;
import java.util.Map;

public class C09_FarkliDataTurleriIleMapOlusturma {

    public static void main(String[] args) {

        /*
                            {
                  id: 101,
                  title: 'foo',
                  body: 'bar',
                  userId: 1 ,
                  isActive: true ,
                  initial : A,
                }
         */

        Map<String,Object>  ornekMap = new HashMap<>();
        ornekMap.put("id",101);
        ornekMap.put("title","foo");
        ornekMap.put("body","bar");
        ornekMap.put("userid",1);
        ornekMap.put("isActive",true);
        ornekMap.put("initial",'K');

        System.out.println(ornekMap);
        // {initial=A, id=101, title=foo, body=bar, isActive=true, userid=1}


        // body key'inin value'sunu buyuk harf olarak yazdirin

        System.out.println(((String) ornekMap.get("body")).toUpperCase()); // BAR


        // id'yi 1 artir

        Integer idDeger = (Integer) ornekMap.get("id"); //101

        ornekMap.put("id", idDeger+1);

        System.out.println(ornekMap);


        // initial key'ine ait value bir buyuk harf mi ?

        System.out.println(Character.isUpperCase((Character) ornekMap.get("initial")));


    }
}
