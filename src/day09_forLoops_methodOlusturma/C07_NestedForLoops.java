package day09_forLoops_methodOlusturma;

import java.util.Scanner;

public class C07_NestedForLoops {
    public static void main(String[] args) {
        /*
            Kullanicidan satir ve sutun sayisini alip
            asagidaki gibi *'lardan olusan bir sekil cizdirin

            * * * * *
            * * * * *
            * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir= scanner.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun= scanner.nextInt();


        // satir = 5  sutun = 9

        for (int i = 1; i <=satir ; i++) { // satir
            for (int j = 1; j <=sutun ; j++) { // sutun

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
