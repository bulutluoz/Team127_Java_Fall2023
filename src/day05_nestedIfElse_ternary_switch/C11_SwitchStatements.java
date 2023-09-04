package day05_nestedIfElse_ternary_switch;

import java.util.Scanner;

public class C11_SwitchStatements {

    public static void main(String[] args) {
        // Soru 4- Kullanicidan ISTQB kisaltmasindaki harflerden,
        //         anlamini ogrenmek istedigi harfi alin
        //         ve girilen harfin karsiligini yazdirin.
        //	I : International  S : Software T : Testing Q : Qualifications B: Board


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen anlamini ogrenmek istediginiz harfi giriniz");
        char harf = scanner.next().charAt(0);

        switch (harf){
            case 'I' :
            case 'i' :
                System.out.println("International");
                break;
            case 's' :
            case 'S' :
                System.out.println("Software");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualifications");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Lutfen ISTQB kisaltmasindaki harflerden birini yaziniz");
        }
    }
}
