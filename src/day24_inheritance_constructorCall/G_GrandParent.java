package day24_inheritance_constructorCall;

public class G_GrandParent {

    G_GrandParent(){
        System.out.println("GP parametresiz ");
    }

    G_GrandParent(String str){
        System.out.println("GP String ");
    }

    G_GrandParent(int sayi){
        this("b");
        System.out.println("GP int ");
    }

    G_GrandParent(boolean bl){
        this(5);
        System.out.println("GP boolean ");
    }
}
