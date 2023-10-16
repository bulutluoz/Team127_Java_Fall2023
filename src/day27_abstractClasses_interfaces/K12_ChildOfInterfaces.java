package day27_abstractClasses_interfaces;

public class K12_ChildOfInterfaces implements I08_Interface,I10_Interface{

    public void method1(){
        // method1 I08 ve I10 da var
        // her ikisinde olsa da, ikisi de void oldugundan
        // hangisini implement ettigimizin bir onemi yok
    }

    public void method2(){
        // I08
    }

    public void method3(){
        // I10
    }

    public String method4(){
        // I08
        return null;
    }


    public int method5(){
        // birden fazla interface'i implement ettigimizde
        // birden fazla interface'de ayni isimde method varsa
        // EGER return type'lari ayni ise sorun yok,
        // ama return type'lar farkli ise bir karar vermemiz gerekir
        //  - ya iki interface'den birini implement etmekten vazgececegiz
        //  - veya mumkunse o interface'lerde degistirme yapacagiz
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(I08_Interface.sayi1); // 20
        // sayi2 = 30;
        // interface'lerdeki tum variable'lar final oldugundan, sonradan deger atanamaz

        System.out.println(I10_Interface.isim); // veli Cem
    }
}
