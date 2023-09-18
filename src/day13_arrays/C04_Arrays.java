package day13_arrays;

public class C04_Arrays {

    public static void main(String[] args) {

        // Verilen String bir array'de
        // istenen harfi iceren elementleri yazdirin

        String [] isimler = { "Huseyin","Mehmet","Esra","Ercan","Omer"};
        String istenenHarf = "x";


        for (int i = 0; i < isimler.length ; i++) {


            if (isimler[i].contains(istenenHarf)){
                System.out.print(isimler[i] + " ");
            }
        }
    }
}
