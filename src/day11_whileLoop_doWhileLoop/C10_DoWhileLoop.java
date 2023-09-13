package day11_whileLoop_doWhileLoop;

public class C10_DoWhileLoop {

    public static void main(String[] args) {

        int sayi = 10 ;

        // do-while loop ile verilen sayidan baslayip, birer azaltarak
        // 3'e kadar olan sayilari yazdirin

        do {
            System.out.print(sayi + " ");
            sayi--;
        }while (sayi>3);





        System.out.println("");
        System.out.println("======================");
        sayi = 2;
        System.out.println("do while loop ile : ");
        do {

            System.out.print(sayi + " ");
            sayi--;
        }while (sayi>3);

        System.out.println("");
        System.out.println("======================");
        // ayni soruyu while loop ile yapalim
        sayi = 2;
        System.out.println("while loop ile : ");
        while (sayi>3){

            System.out.print(sayi + " ");
            sayi--;
        }
    }
}
