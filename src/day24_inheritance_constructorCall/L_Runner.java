package day24_inheritance_constructorCall;

public class L_Runner {

    public static void main(String[] args) {

        K_Child child = new K_Child();

        System.out.println(child.sayi); // 25
        System.out.println(child.yas); // 20

        child.method1();// Child method1
        child.method2(); // Parent method2

    }
}
