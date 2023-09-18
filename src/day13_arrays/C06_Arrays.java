package day13_arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //        ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {3,4,2,6,5,4,5,7,8,2,3,9};
        int arananSayi = 3;

        elemanSayisiYazdir(arr,3); // Aranan eleman array'de 2 kere kullanilmis
        elemanSayisiYazdir(arr,11);// Aranan eleman array'de yok
        elemanSayisiYazdir(arr,7); // Aranan eleman array'de 1 kere kullanilmis




    }

    public static void elemanSayisiYazdir(int[] arr , int arananSayi){

        int sayac = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == arananSayi){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Aranan eleman array'de yok");
        }else{
            System.out.println("Aranan eleman array'de " + sayac + " kere kullanilmis");
        }


    }
}
