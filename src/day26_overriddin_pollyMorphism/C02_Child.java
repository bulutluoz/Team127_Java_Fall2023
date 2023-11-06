package day26_overriddin_pollyMorphism;

public class C02_Child extends C01_Parent{

    public void method1(){
        // bir method'un overriding yapmasi icin
        // parent class'daki method ile
        // ayni SIGNATURE'a sahip olmalidir
    }

    @Override
    public void method1(String str) {
        // overriding method'u intelliJ'e olusturtunca
        // otomatik olarak @Override notasyonu ekliyor
        // bu notasyonu kullanmak zorunlu degildir
        // ama kullanmanin bir artisi var
        // @Override kullanildiginda parent class'daki
        // overridden method'u takip eder
        // eger overridden method silinir veya signature degistirilirse
        // CTE verir
    }

    public void method2() {
        super.method2();
        // herhangi bir obje icin
        // ya overriding method veya overridden method calisir
        // EGER ikisinin de calismasini isterseniz
        // overriding method'un icine
        // super.overriddenMethod() yazabilirsiniz
    }
    /*
    public void method3(){

    }
    final keyword kullanildigi class uyesinin DEGISTIRILEMEYECEGINI belirtir
    overridding ise direk parent class'daki method'u
    degistirerek child class'a uyarlamaktir.

    final method'lar OVERRIDE EDILEMEZ
     */

    public static void method4(){
        // static method'lari cagirmak icin obje kullanilmaz
        // static method'lar override edilemezler
        // zaten yanda OK da cikmadi
    }


    public void method5(){
        // private bir method'a class disindan ulasilamaz
        // child class'dan da olsa
        // parent'daki private method'a ulasilamadigindan
        // child class'daki method5 bagimsiz bir method olur
        // overriding method olmaz
    }


}
