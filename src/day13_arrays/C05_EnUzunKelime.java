package day13_arrays;

public class C05_EnUzunKelime {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        //         en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

        String [] isimler = { "Zehra","Huseyin","Mehmet","Esra","Ali","Ercan","Omer"};

        enUzunEnKisaYazdir(isimler);


    }


    public static void enUzunEnKisaYazdir(String[] arr){

        String enKisaIsim = arr[0];
        String enUzunisim = arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].length() >= enUzunisim.length()){
                enUzunisim = arr[i];

            }

            if (arr[i].length()<= enKisaIsim.length()){
                enKisaIsim = arr[i];
            }

        }

        System.out.println("en uzun isim : " + enUzunisim);
        System.out.println("en kisa isim : " + enKisaIsim);

    }
}
