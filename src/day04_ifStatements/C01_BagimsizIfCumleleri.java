package day04_ifStatements;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

        /*
            bagimsiz if cumleleri kodun geriye kalani ile ilgilenmez
            sadece kendi sartina odaklanir

            birden fazla bagimsiz if cumlesi varsa
            butun if body'lerini calistiran durumlar olabilecegi gibi
            a=230, b=45
            hicbir if body'sinin calismayacagi durumlar da olabilir
            a=23, b=44

         */

        int a = 123;
        int b = 44;

        // a 'b'den buyuk mu ?
        if (a > b) {
            System.out.println("a b'den buyuk");
        }

        // a cift sayi mi ?
        if (a % 2 == 0){
            System.out.println("a cift sayi");
        }

        // b 5 ile tam bolunebiliyor mu ?
        if (b % 5 == 0){
            System.out.println("b 5 ile tam bolunur");
        }

        // a 3 basamakli bir sayi mi ?
        if (a >=100 && a<=999){
            System.out.println("a sayisi 3 basamakli");
        }


        // a ile b'nin toplami 100'den buyuk mu ?
        boolean sart = a + b > 100;
        System.out.println(sart); // false

        if (sart){
            System.out.println("a ile b'nin toplami 100'den buyuk");
        }


        if(true){
            System.out.println("Bu if body'si her zaman calisir");
        }

        if(false){
            System.out.println("Bu if body hicbir zaman calismaz");
        }


    }
}
