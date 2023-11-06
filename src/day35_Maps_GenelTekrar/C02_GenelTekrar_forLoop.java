package day35_Maps_GenelTekrar;

public class C02_GenelTekrar_forLoop {
    /*
Yıldızlar (*) ile baklava deseni oluşturabileceğiniz bir kod yazınız.
       Sonuç böyle olmalıdır;

              *
             * *
            * * *
           * * * *
          * * * * *
           * * * *
            * * *
             * *
              *


          şeklini konsola yazdiriniz.
*/

    public static void main(String[] args) {

        int enGenisSatir = 7;

        for (int i = 1; i <=enGenisSatir ; i++) {

            for (int j =1 ; j <= enGenisSatir-i ; j++) { // bastaki bosluklar icin
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) { // yildizlar icin
                System.out.print("* ");
            }
            System.out.println("");
        } // en genis satira kadar olan kisim

        for (int i = enGenisSatir-1; i >=1 ; i--) {
            for (int j = 1; j <=enGenisSatir-i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
