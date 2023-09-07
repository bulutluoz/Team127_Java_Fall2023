package day08_stringManipulations;

public class C10_ForLoopDikkatEdilecekler {
    public static void main(String[] args) {


        // Eger baslangic degeri ve degisim yontemi
        // bitis sartini hic saglamayacak sekilde ilerlerse
        // SONSUZ LOOP olusur

        /*
        for (int i = 10; i >0 ; i++) {

            System.out.print(i+" ");

        }

         */


        // Eger ilk deger icin bile bitis kosulu false sonucunu veriyorsa
        // LOOP BODY'si hic devreye girmez

        for (int i = 10; i <5 ; i++) {

            System.out.println(i);
        }
    }
}
