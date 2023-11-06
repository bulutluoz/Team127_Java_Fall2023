package day22_stringBuilder_accessModifier_encapsulation;

public class C05_EncapsulationRunner {

    public static void main(String[] args) {

       C04_Encapsulation obj = new C04_Encapsulation();

        System.out.println(obj.getGorulebilsin());
        // Bu variable gorulebilir ama degistirilemez

        obj.setDegerAtanabilsin("Ali");

        obj.setDegerAtanabilsin("Veli");

        // bizim argument olarak yazdigimiz degerleri atama yapiyor
        // ama bizim gormemize izin vermiyor

        obj.gorulebilirVeDegerAtanabilir = "Deneme";
        System.out.println(obj.gorulebilirVeDegerAtanabilir); // Deneme

        // obj.sayi = 20;
        // System.out.println(obj.sayi);

        obj.setSayi(20);
        System.out.println(obj.getSayi()); // 20


    }
}
