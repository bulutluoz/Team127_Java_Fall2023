package day36_genelTekrar;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class C02_RandomTarihUretme {

    public static void main(String[] args) {
        /*
        Bu uygulama bir Arraye random olarak oluşturulan 10 tarih ekleyin
        ve bu tarihleri en eskiden yeniye doğru sıralayınız.
        Yil degiskeni icin 2013 ila 2023 arasinda random sayi uretin
        Ay degiskeni icin 1 ila 12 arasinda random sayi uretin
        Gun degiskeni icin 1 ila 28 arasinda random sayi uretin
        LocalDate clasini kullanarak bu uc degiskeni bir method icine gonderin ve random tarih uretin
    */

        LocalDate[] tarihler = new LocalDate[10];

        for (int i = 0; i < tarihler.length ; i++) {

            tarihler[i] = tarihUret();
        }

        Arrays.sort(tarihler);
        System.out.println(Arrays.toString(tarihler));

    }


    public static LocalDate tarihUret(){

        //        Yil degiskeni icin 2013 ila 2023 arasinda random sayi uretin
        //        Ay degiskeni icin 1 ila 12 arasinda random sayi uretin
        //        Gun degiskeni icin 1 ila 28 arasinda random sayi uretin

        Random random = new Random(); // 0 ile 1 arasinda ondalikli bir sayi uretir
        int yil = random.nextInt(10)+ 2013;
        int ay = random.nextInt(11)+ 1;
        int gun = random.nextInt(27)+1;

        LocalDate localDate = LocalDate.of(yil,ay,gun);

        return localDate;
    }
}
