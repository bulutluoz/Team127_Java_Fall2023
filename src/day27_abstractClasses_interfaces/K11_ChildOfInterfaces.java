package day27_abstractClasses_interfaces;

import day26_overriddin_pollyMorphism.C03_ZorlamaSevmeyenParent;



public class K11_ChildOfInterfaces extends C03_ZorlamaSevmeyenParent implements I08_Interface,I10_Interface {

    /*
     bir class istedigi kadar interface'i implement edebilir

     Bir class sadece 1 class'a extends edebilir
     AMA istedigi kadar interface'i IMPLEMENT edebilir
  */



    @Override
    public void method1() {

    }


    public void method7() {

    }

    @Override
    public void method2() {

    }

    @Override
    public int method5() {
        return 0;
    }


    @Override
    public String method4() {
        return null;
    }


}
