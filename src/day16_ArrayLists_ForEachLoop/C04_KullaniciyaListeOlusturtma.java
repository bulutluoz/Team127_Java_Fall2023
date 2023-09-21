package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListeOlusturtma {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip,
        //        Q’ya bastiginda girdigi isimleri
        //        bize liste olarak dondurecek bir method olusturun.

        System.out.println(listeOlustur());
    }

    public static List<String> listeOlustur(){

        List<String> isimler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String girilenIsim;

        do {
            System.out.println("Listeye eklemek icin bir isim yazin" +
                    "\nVeya islemi sonlandirmak icin Q'ya basin ");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q") ){
                isimler.add(girilenIsim);
            }

        }while (!girilenIsim.equalsIgnoreCase("Q"));

        return isimler;
    }
}
