package day23_inheritance;

public class I_Child extends H_Parent{

    public static void main(String[] args) {

        I_Child child1 = new I_Child();

        // child1.araba private
        System.out.println(kasa);

        kasa = "75" ;
        System.out.println(kasa); // 75

        // default normalde inheritance icin uygun degildir
        // ama bu class ayni package'da oldugu icin kullanilabilir
        // Parent baska package'da olursa,child class
        // parent class'daki default access modifier'a sahip
        // class uyelerine ulasamaz
        child1.sayi = 34;
        System.out.println(child1.adres); // Cankaya


    }

}
