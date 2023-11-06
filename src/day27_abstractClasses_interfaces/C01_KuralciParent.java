package day27_abstractClasses_interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class C01_KuralciParent {

    /*
        1- bir class'in child class'lari override etmeye zorlayacagi
           method'lari abstract olarak tanimlamasi gerekir
        2- bir class'in abstract method'lar barindirabilmesi icin
           kendisinin de abstract olarak tanimlanmasi gerekir
        3- abstract method'lar child class'larin OVERRIDE etmesi icin olusturulur
           dolayisiyla body'ye ihtiyaclari yoktur.
        4- bir abstract class abstract method'lar barindirdigi gibi
           abstract olmayan (concrete) method'lar da bulundurabilir
           partial abstraction
        5- abstract class'da bulunan concrete method'lar
           child class'lar tarafindan overide EDILMEK ZORUNDA DEGILDIR
        6- abstract class'lar class olduklari icin constructor'lari vardir
           AMMA iclerinde abstract method'lar bulundugundan
           abstract class'lardan OBJE OLUSTURULAMAZ
     */

    public abstract void method1();

    public abstract void method2();

    public abstract void method3();

    public void method4(){

    }

    public abstract int method5();

    public static void main(String[] args) {

        //C01_KuralciParent obj = new C01_KuralciParent();
        // obj.method1();

        List<String > isimler = new ArrayList<>();
    }
}
