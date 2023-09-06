package day07_StringManipulations;

import java.util.Scanner;

public class C01_EndsWith {
    public static void main(String[] args) {
        //kullanicidan bir mail alin
        //   - mail @ icermiyorsa "gecersiz mail"
        //   - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //   - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String mail = scanner.nextLine();

        if (!mail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }
    }
}
