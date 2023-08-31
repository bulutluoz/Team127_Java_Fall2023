package day04_ifStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //         girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char krk = scanner.next().charAt(0);

        if (krk >= 'A' && krk <= 'Z'){
            System.out.println("Girilen karakter buyuk harf");
        }else {
            System.out.println("Girilen karakter buyuk harf degil");
        }
    }
}
