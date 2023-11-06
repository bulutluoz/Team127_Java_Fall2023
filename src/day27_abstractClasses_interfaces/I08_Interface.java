package day27_abstractClasses_interfaces;

public interface I08_Interface {

    /*
        1- Interface'ler full abstraction saglar
        2- full abstraction sagladigi icin yazsak da yazmasak da
           tum method'lar public ve abstract'tir.
        3- Interface'de olusturulan her variable
           yazsak da yazmasak da
           public, static ve final'dir.

     */

    public final static int sayi1 = 20;
    final int sayi2 = 10;
    static String isim = "Ali Can";




    public abstract void method1();
    public void method2();
    abstract int method5();
    String method4();
    //void yeniMethod();

    public static void main(String[] args) {


    }

}
