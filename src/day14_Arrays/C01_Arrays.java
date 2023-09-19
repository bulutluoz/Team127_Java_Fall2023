package day14_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        //        sonucu bize donduren bir method yaziniz.

        int[] arr = {3,-5,4,2,-6,-7,8,3,-1};

        System.out.println(pozitifSayilariTopla(arr)); // 20

    }

    public static int pozitifSayilariTopla(int[] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0){

                toplam += arr[i];
            }
        }

        return toplam;
    }
}
