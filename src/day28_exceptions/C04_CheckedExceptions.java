package day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        /*
            Checked exceptions daha cok dosya okuma
            veya dosyaya bilgi kaydetme ile ilgilidir
            javada bu islemlere input/output dendiginden
            exception olarak IOException ve child class'lari olusturulmustur

         */

        String dosyaYolu = "src/day28_exceptions/text.txt";

        FileInputStream fis = new FileInputStream(dosyaYolu);

        /*
            Unhandled exception: java.io.FileNotFoundException

            CheckedExceptions kod calismadan riskli olan kodlarda bizi uyarir
            Bu konuda inisiyatif bizdedir

            1- istersek bu satiri try-catch ile handle eder ve
               exception olussa da yoluna devam etmesini saglariz
            2- veya exception olustugunda kodun durmasini istiyorsak
               sadece altindaki kirmizi cizginin gitmesini ve calismasini istiyorsak
               method deklarasyonunun yanina
               bu riskin farkinda oldugumuzu ve bu method'un
               belirtilen exception'i firlatabilecegini yazariz


         */


    }
}
