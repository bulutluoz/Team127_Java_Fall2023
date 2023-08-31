package day04_ifStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {

    public static void main(String[] args) {
        // Kullanicidan pozitif bir tamsayi isteyin
        // sayi 3'e bolunuyorsa 3'e bolunuyor
        // sayi 5'e bolunuyorsa 5'e bolunuyor
        // hem 3, hem 5'e bolunuyorsa "super sayi"
        // ne 3 ne de 5'e bolunmuyorsa "Cope at gitsin" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();

        if (girilenSayi % 3 == 0 && girilenSayi % 5 == 0){
            System.out.println("super sayi");
        }else if(girilenSayi % 3 == 0){
            System.out.println("3'e bolunuyor");
        } else if (girilenSayi % 5 == 0) {
            System.out.println("5'e bolunuyor");
        }else{
            System.out.println("Cope at gitsin");
        }


    }
}
