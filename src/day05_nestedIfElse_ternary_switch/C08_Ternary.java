package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        /*
            buyuk olmayan demekle kucuk olan demek farklidir
            cunku 9 9   verildiginde buyuk olmayan 9
                                     kucuk olan ????

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();


        System.out.println( sayi1 > sayi2 ? sayi2 : sayi1);
    }
}
