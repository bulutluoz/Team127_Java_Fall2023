package day17_constructors;






public class C05 {

    // default constructor ile ayni islevi yapan
    // gorunur bir constructor olusturalim

    public C05(){
        System.out.println("Merhaba, ben constructor");
    }
    // bu constructor gorunur oldugu icin
    // buna default constructor degil
    // PARAMETRESIZ constructor denir
    // Cunku default constructor'larin body'si bos olur
    // ama biz parametresiz constructor'larin body'sine kod ekleyebiliriz


    int sayi = 0;
    String str;

    public void method1(){
        System.out.println("C05 method1 calisti");
    }

    public void C05(){
        // method isimleri kucuk harfle baslamalidir
        // ama bu bir kural degil convention(genel kabul)'dir.
        // bir kod blogunun return type'i varsa method'dur

    }

    /*
    public asd(){

    }

    c05(){

    }
    Invalid method declaration; return type required
    ismi class adi ile ayni degil, olsa olsa method olabilir
    ama method icin return type yazilmali
     */


}
