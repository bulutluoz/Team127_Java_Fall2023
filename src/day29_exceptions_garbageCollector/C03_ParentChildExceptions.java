package day29_exceptions_garbageCollector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ParentChildExceptions {

    public static void main(String[] args) {

        /*
            Birden fazla exception olusma ihtimali varsa
            ve bu exception'lar arasinda Parent - Child iliskisi olursa

            once Child, sonra Parent yazilmalidir.

            Tersi yapilirsa
            yani once Parent yazilirsa
            Parent exception'in yakalama kapasitesi daha fazla oldugundan
            tum olasi exception'lari yakalayacak
            ve alttaki child exception'a is kalmayacaktir.
            Boyle yazarsak Java altini cizer
            ve duzeltmemizi ister

         */

        try {
            FileInputStream fis = new FileInputStream("src/day28_exceptions1/text.txt");

            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {

            System.out.println("Dosya yolu yanlis");

        } catch (IOException e) {

            System.out.println("Dosya okunamiyor");
        }

    }
}
