package day17_constructors;

import java.util.Random;

public class C01 {

    int sayi = 6;
    String str = "Java candir";

    public void rastgeleSayiUret(){

        Random random = new Random();
        int rastgeleSayi = random.nextInt(1000);
        System.out.println("Bugunku sansli sayi : " + rastgeleSayi);
    }

    public void bugunNePisireyim(){

        String[] yemekler = {"Kuru Fasulye","Pilav","Cacik","Makarna","Mercimek Corbasi"};

        Random random = new Random();
        int yemekNo= random.nextInt(yemekler.length);
        System.out.println("Bugunun yemek teklifi : " + yemekler[yemekNo]);
    }
}
