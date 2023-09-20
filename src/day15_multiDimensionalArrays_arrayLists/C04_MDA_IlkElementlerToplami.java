package day15_multiDimensionalArrays_arrayLists;

public class C04_MDA_IlkElementlerToplami {
    public static void main(String[] args) {

        // verilen bir MDA'de
        // her inner array'in ilk elementlerinin toplamini
        // bize donduren bir method olusturun

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{5,2}};

        System.out.println("Ilk elementler toplami : "+ilkElemanlarToplami(arr));

    }

    public static int ilkElemanlarToplami(int[][] arr){

        // tum elemanlara ihtiyacimiz yok
        // for loop inner array'leri getirirse, biz o inner array'in ilk elemanini aliriz
        int toplam = 0 ;

        for (int i = 0; i < arr.length; i++) { // arr[0], arr[1], arr[2], arr[3]

            toplam += arr[i][0] ;
        }

        return toplam;
    }

}
