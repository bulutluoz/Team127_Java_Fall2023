package day04_ifStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not = scanner.nextDouble();


        if (not >= 50){
            System.out.println("Sinifi gectin");
        }

        if (not<50){
            System.out.println("Maalesef kaldin");
        }


        if (not >= 50){
            System.out.println("Sinifi gectin");
        } else{
            System.out.println("Maalesef kaldin");
        }

    }
}
