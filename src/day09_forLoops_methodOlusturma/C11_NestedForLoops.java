package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C11_NestedForLoops {

    public static void main(String[] args) {
         /*
            Kullanicidan satir sayisini alip
            asagidaki gibi *'lardan olusan bir sekil cizdirin

            1
            2 4
            3 6 9
            4 8 12 16
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir= scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(i*j + " ");

            }
            System.out.println("");
        }
    }
}
