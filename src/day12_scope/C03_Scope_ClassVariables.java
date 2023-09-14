package day12_scope;

public class C03_Scope_ClassVariables {

    String str = "Java";
    int sayi = 23;

    static boolean bl = true;
    static char chr = 'a';

    public static void main(String[] args) {
        // static int a = 23;
        // System.out.println( str);
        // System.out.println(sayi);
        System.out.println(bl);
        System.out.println(chr);
    }

    public static void staticMethod(){
        // static String s = "tava";
        // System.out.println( str);
        // System.out.println(sayi);
        System.out.println(bl);
        System.out.println(chr);
    }

    public void staticOlmayanMethod(){
        System.out.println( str);
        System.out.println(sayi);
        System.out.println(bl);
        System.out.println(chr);
    }


    /*
        Class level variable'lar class'in icinde ama kod bloklarinin disinda olusturulur
        sonradan class'a bakildiginda ulasilmasi kolay olsun diye class'in basinda olusturulurlar

        Class level'da olusturulan variable'larin scope'u BUTUN CLASS'dir
        AMA class level variable'larda
        erisimi belirleyen SADECE scope degildir
        static KEYWORD de erisimde BELIRLEYICI bir role sahiptir

        static keyword'e sahip olan variable'lar tum class icinden direk kullanilabilir

        static keyword kullanmayan variable'lar
        SADECE static keyword kullanmayan method'larda direk kullanilabilir
     */

}
