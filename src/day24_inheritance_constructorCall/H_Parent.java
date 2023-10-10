package day24_inheritance_constructorCall;

public class H_Parent extends G_GrandParent{

    H_Parent(){
        System.out.println("P parametresiz ");
    }

    H_Parent(String str){
        this();
        System.out.println("P String ");
    }

    H_Parent(int sayi){
        System.out.println("P int ");
    }

    H_Parent(boolean bl){
        super(false);
        System.out.println("P boolean ");
    }
}
