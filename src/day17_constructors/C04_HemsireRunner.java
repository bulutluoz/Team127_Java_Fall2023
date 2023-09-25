package day17_constructors;

public class C04_HemsireRunner {

    public static void main(String[] args) {

        C03_Hemsire hemsire1 = new C03_Hemsire();

        hemsire1.hemsireAdi = "Esra";

        hemsire1.hemsireAdresi = "Yenimahalle";


        C03_Hemsire hemsire2 = new C03_Hemsire();

        System.out.println(hemsire2.hemsireTel); // null


        System.out.println((new C03_Hemsire().hemsireAdresi)); // null

        // son olusturdugumuz objeyi
        // atama yapmadigimiz icin bir daha kullanamayiz
        // bu tur bos objeler Java'daki Garbage Collector tarafindan toplanip, yok edilir

        C03_Hemsire hemsire3;
        // hemsire3.method1();
        // System.out.println(hemsire3.hemsireAdresi);
        // initialize yapilmadigi icin, herhangi bir variable degerini yazdiramaz


    }
}
