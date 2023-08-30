package day02_scanner_DataCasting;

import java.util.Scanner;

public class C07_AsciiTable {

    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = 'b';

        System.out.println(chr1 + chr2); // 97 + 98 = 195

        char chr3 = '1';
        char chr4 = '2';
        System.out.println(chr3 + chr4); // 49 + 50 = 99

        int sayi1 = chr1 ;

        /*
            char data turu ozel bir duruma sahiptir
            Eger char data turundeki bir degeri
            matematiksel isleme sokarsaniz
            veya sayisal bir data turune atama yaparsaniz
            ASCII TABLE'daki degeri ile isleme girer
         */


        System.out.println("char 'a' nin int karsiligi : " + sayi1);
        // char 'a' nin int karsiligi : 97

        // kullanicidan bir char alip
        // ascii table'da o kararkterden sonra gelen 3 karakteri yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ascii table'dan bir karakter giriniz");
        char krk = scanner.next().charAt(0);

        System.out.println("girilen karakterden 1 sonraki karakter : "+(char)(krk + 1));
        System.out.println("girilen karakterden 2 sonraki karakter : "+(char)(krk + 2));
        System.out.println("girilen karakterden 3 sonraki karakter : "+(char)(krk + 3));

    }
}
