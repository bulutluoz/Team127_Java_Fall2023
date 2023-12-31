package day23_inheritance;

public class F_Corolla extends E_Toyota {

    String model = "Corolla";
    String uretimYeri = "Turkiye";
    String lastik = "Pirelli Sakarya";
    String aku = "Inci aku";

    String tekerCapi = "19 inc";
    String guvenlik = "safe drive";
    String bagajHacmi = "200 litre";


    public static void main(String[] args) {

        F_Corolla corolla1 = new F_Corolla();

        System.out.println(corolla1.marka); // T Toyota
        System.out.println(corolla1.model); // Co Corolla
        System.out.println(corolla1.renk); // Car renk atanmamis
        System.out.println(corolla1.yakit); // Car yakit atanmamis
        System.out.println(corolla1.uretimYeri); // Co Turkiye
        System.out.println(corolla1.sanziman); // T otomatik veya manuel
        System.out.println(corolla1.lastik); // Co Pirelli Sakarya
        System.out.println(corolla1.guvenlik); // Co safe drive
        System.out.println(corolla1.aku); // Co Inci aku
        System.out.println(corolla1.tekerCapi); // Co 19 inc
        System.out.println(corolla1.bagajHacmi); // Co 200 litre


    }

}
