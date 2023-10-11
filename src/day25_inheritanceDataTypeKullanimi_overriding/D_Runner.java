package day25_inheritanceDataTypeKullanimi_overriding;

import java.util.*;

public class D_Runner {

    public static void main(String[] args) {

        /*
            Bir obje olusturulurken
            Data turu ve constructor ayni class'dan ise
            variable'larin hangi degeri alacagini bulmak icin
            ilgili class'a gidip aramaya baslariz
            parent class'lara dogru aramaya devam ederiz
            ilk buldugumuz yani en guncel olan deger
            gecerli deger olur.

            Java bir objenin data turu olarak
            constructor'in oldugu class
            veya parent class'lari kabul eder

            Eger data turu, constructor'in parent'i ise
            aramaya DATA TURUnun oldugu class'dan baslanir
            parent class'lara dogru aramaya devam edilir
            ilk bulunan deger kullanilir
         */

        C_AvciKuslar kartal1 = new C_AvciKuslar();
        System.out.println(kartal1.hareket); // C Ucarlar
        System.out.println(kartal1.solunum); // B akcigerle nefes alirlar
        System.out.println(kartal1.beslenme); // C Et yerler
        System.out.println(kartal1.cogalma); // B Yumurtayla cogalirlar
        System.out.println(kartal1.omur); // A yasar ve olurler
        System.out.println(kartal1.kanat); // B Kanatlidirlar
        System.out.println(kartal1.gaga); // C Sivri gagalidir
        System.out.println(kartal1.pence); // C pencelidir


        B_Kuslar kartal2 = new C_AvciKuslar();
        System.out.println(kartal2.hareket); // A Hareket ederler
        System.out.println(kartal2.solunum); // B akcigerle nefes alirlar
        System.out.println(kartal2.beslenme); // A Beslenirler
        System.out.println(kartal2.cogalma); // B Yumurtayla cogalirlar
        System.out.println(kartal2.omur); // A yasar ve olurler
        System.out.println(kartal2.kanat); // B Kanatlidirlar
        System.out.println(kartal2.gaga); // B gagalidir
        //System.out.println(kartal2.pence); // CTE


        A_Hayvanlar kartal3 = new C_AvciKuslar();
        System.out.println(kartal3.hareket); // A Hareket ederler
        System.out.println(kartal3.solunum); // A solunum yaparlar
        System.out.println(kartal3.beslenme); // A Beslenirler
        System.out.println(kartal3.cogalma); // A Cogalirlar
        System.out.println(kartal3.omur); // A yasar ve olurler
        //System.out.println(kartal3.kanat); // CTE
        //System.out.println(kartal3.gaga); // CTE
        //System.out.println(kartal3.pence); // CTE







    }

}
