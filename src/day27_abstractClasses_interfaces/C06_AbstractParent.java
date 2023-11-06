package day27_abstractClasses_interfaces;

public abstract class C06_AbstractParent extends C05_AbstractGrandParent{
    /*
        Abstract olan child class'lardan da OBJE OLUSTURULAMAYACAGI icin
        child olsalar da parent'larindaki abstract method'lari
        UYARLAMAK ZORUNDA KALMAZLAR

        Abstract parent - child arasindaki iliski
        normal inheritance kullanan parent - child class'lar gibidir
        YANI isterse uyarlar, istemezse uyarlamaz
     */

    public void method1(){
        System.out.println("GP'daki abstract method1 P'da concrete yapildi");
    }

    public void method4(){
        System.out.println("P'daki concrete method4");
    }

    public abstract int method5();

    public abstract String method6();

}
