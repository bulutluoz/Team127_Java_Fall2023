package day36_genelTekrar;

import java.util.Scanner;

public class C01_whileLoop {

    public static void main(String[] args) {
        //Kullanıcı adı "admin", şifre "p12" olarak belirlenmiştir.
        //Kullanıcıdan kullanıcı adı ve şifre girmesi istenmelidir.
        //Kullanıcı "Kullanıcı adınızı ve şifrenizi giriniz" mesajını görmelidir.
        //Eğer kullanıcı doğru bilgileri girerse, "Hesabınızdasınız!" mesajını almalıdır.
        //Aksi halde, kullanıcı "Kullanıcı adınızı ve şifrenizi giriniz" mesajını 3 kez görmelidir.
        //3 kez yanlış giriş yapılması durumunda, "Hesabınız bloke edilmiştir" mesajını almalıdır.


        Scanner scanner = new Scanner(System.in);
        boolean sifreDogruMu = false ;
        int sayac= 0;
        String gecerliKullaniciAdi = "admin";
        String gecerliPassword = "p12";


        do {
            System.out.println("Lutfen kullanici adinizi giriniz");
            String kullaniciAdi = scanner.next();
            System.out.println("lutfen sifrenizi giriniz");
            String sifre = scanner.next();
            sayac++;

            if (kullaniciAdi.equals(gecerliKullaniciAdi) && sifre.equals(gecerliPassword)){
                System.out.println("Hesabınızdasınız!");
                sifreDogruMu=true;
            }else if(sayac >=3){
                System.out.println("Hesabınız bloke edilmiştir");
                break;
            }
        }while (!sifreDogruMu);  // while loop parantezinin ici true oldugunda devam eder
                                 // biz sifreDogruMu ==> false iken devam etmesini istiyoruz

    }
}
