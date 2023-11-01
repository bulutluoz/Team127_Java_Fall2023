package day36_genelTekrar;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class C07_OrtalamaUstundekiOgrenciSayisi {

    public static void main(String[] args) {

        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.

        // once ogretmenden girmek istedigi kadar not alalim
        // notlari bir Listeye koyalim
        // bir yandan da notlari toplayalim(ortalama bulmak icin)
        // bitti demesi icin Q'ya bassin

        Scanner scanner = new Scanner(System.in);
        List<Double> notlarListesi = new ArrayList<>();
        double notToplami = 0;
        double ortalamaNot;
        int ortalamaUstundekiOgrenciSayisi=0;
        double not;
        boolean devamEdeyimMi = true;

        do {
            System.out.println("lutfen ogrenci notu giriniz, \nbitirmek icin Q'ya basiniz");
            try {
                not = scanner.nextDouble();
                if (not<0 || not>100){
                    throw new IllegalArgumentException();
                }
                notlarListesi.add(not);
                notToplami += not;
            } catch (InputMismatchException e) {
                String hocaMetin = scanner.nextLine();
                if (hocaMetin.equalsIgnoreCase("q")){
                    devamEdeyimMi = false;
                }else {
                    System.out.println("Hatali giris yaptiniz !!!");
                }
            }catch (IllegalArgumentException e){
                System.out.println("Yemezler canim  :) ");
            }

        }while (devamEdeyimMi);

        // ortalamayi bulalim

        ortalamaNot = notToplami / notlarListesi.size() ;

        // ortalama ustundeki ogrenci sayisini bulup yazdiralim

        for (double each : notlarListesi
             ) {

            if (each >= ortalamaNot){
                ortalamaUstundekiOgrenciSayisi++;
            }
        }

        System.out.println("Not girilen ogrenci sayisi : " + notlarListesi.size()
                            +"\nNot ortalamasi : " + ortalamaNot
                            +"\nOrtalama ustundeki ogrenci sayisi : " + ortalamaUstundekiOgrenciSayisi);
    }
}
