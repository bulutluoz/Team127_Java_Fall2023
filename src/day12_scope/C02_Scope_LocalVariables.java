package day12_scope;

public class C02_Scope_LocalVariables {

    /*
        Bir method/kod blogu icerisinde olusturulan variable'lara local variable denir
        ve local variable'larin scopee'u icerisinde olusturulduklari kod blogudur.

        Loop'lar da bagimsiz kod bloklaridir
        loop icerisinde olusturulan variable'larin scope'u
        icerisinde olusturulduklari kod blogu olan loop ile sinirlidir
        yani loop icerisinde olusturulan local variable'lar
        loop disinda KULLANILAMAZ

     */

    public static void main(String[] args) {

        int sayi = 20;
        // System.out.println(str);
        // System.out.println(bl);

        String s= "Hava";


        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            String str = "Java";
            str += i ;
            s+=i;

        }

        // System.out.println(str);
        // System.out.println(i);
        System.out.println(s);

    }


    public static void staticMethod(){
        // System.out.println(sayi);
        String str = "Java";
        // System.out.println(bl);
    }


    public void staticOlmayanMethod(){
        // System.out.println(sayi);
        // str= "Tava";
        boolean bl =true;
    }
}
