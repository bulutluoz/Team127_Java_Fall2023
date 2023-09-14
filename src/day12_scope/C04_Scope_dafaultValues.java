package day12_scope;

public class C04_Scope_dafaultValues {

    String str = "Java";
    String str2 ;
    int sayi = 23;
    int sayi2;

    static boolean bl = true;
    static boolean bl2;
    static char chr = 'a';
    static char chr2;

    public static void main(String[] args) {

        String metin;

        // System.out.println(metin);

        // System.out.println(str);
        // System.out.println(sayi);
        System.out.println(bl); // true
        System.out.println(bl2); // false
        System.out.println(chr); // a
        System.out.println(chr2); // hiclik
        // staticOlmayanMethod();
        // Non-static method 'staticOlmayanMethod()' cannot be referenced from a static context
        // static olan main method icerisinden static olmayan bir method direk CAGRILAMAZ

        // static method'lar icerisinden
        // static olmayan class uyelerine ulasmak istersek
        // obje olusturmamiz gerekir

        C04_Scope_dafaultValues obj = new C04_Scope_dafaultValues();
        obj.staticOlmayanMethod();

    }
    /*
        Local variable'lar deger atamadan olusturulabilir
        ANCAK deger atanmadan KULLANILAMAZ

        class level variable'lar ise
        ister static olsun, ister static olmasin
        deger atamadan olusturulabilir
        VE deger atanmadan da KULLANILABILIR

        Class level variable'lara biz deger ATAMAZSAK
        Java default olarak belirledigi degerleri ATAR

        Default Java Degerleri

        char ==> hiclik
        boolean ==> false
        sayisal primitive'ler ==> 0
        non-primitive'ler ==> null

     */


    public void staticOlmayanMethod(){

        System.out.println(str); // Java
        System.out.println(str2); // null
        System.out.println(sayi); // 23
        System.out.println(sayi2); // 0
    }
}
