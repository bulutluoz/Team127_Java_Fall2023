package day21_varargs_stringBuilder;

public class C02_Varargs {
    public static void main(String[] args) {

        topla(3,5); // Toplam  : 8
        topla(3,5,7); // Toplam  : 15

        /*
            method call sirasinda istedigim kadar argument yazabilmek istiyorum

            java variety of arguments ==> varargs ile hizmetinizde

            varargs array alt yapisini kullanarak
            istedigimiz kadar argument yazmamiza imkan tanir

         */

        topla(2); // 2
        topla(2,5,9,1,3,5,7,1,3,4); // 40
        topla(1,2,3,4,5,6); // 21
        topla(1,2,3,4,5,6,7,8); // 36
        topla(3,4,5,6,7); // 25



    }

    public static void topla(int... sayi){
        int toplam=0;
        for (int each : sayi
             ) {
            toplam += each ;
        }

        System.out.println(toplam);
    }


    public static void topla(int sayi1, int sayi2){

        System.out.println("Toplam  : " + (sayi1+sayi2));
    }

    public static void topla(int sayi1, int sayi2, int sayi3){

        System.out.println("Toplam  : " + (sayi1+sayi2+sayi3));
    }
}
