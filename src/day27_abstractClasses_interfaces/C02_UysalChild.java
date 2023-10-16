package day27_abstractClasses_interfaces;

public class C02_UysalChild extends C01_KuralciParent{
    public void method1() {

    }

    public void method2() {

    }

    public void method3() {

    }

    @Override
    public int method5() {
        return 0;
    }

    public void method4(){

    }


    /*
        Java bir parent class'in
        Child Class'lara belirlenen method'lari
        override etme mecburiyeti koyabilmesi icin
        OZEL BIR KONSEPT hazirlamistir.

        Eger siz parent class'da
        abstract bir method olusturursaniz
        child class'lar parent class'daki abstract method'lari OVERRIDE ETMEK ZORUNDA olur
     */
}
