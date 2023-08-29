package day02_scanner_DataCasting;

public class C05_DataCasting {

    public static void main(String[] args) {

        int sayiInt = 34;
        String str  = "Java Candir";
        boolean bl  = true;
        char chr    = '%';
        double dbl  = 4.5;
        byte byt    = 10;
        short shrt  = 23;


        // Data casting : bir data turundeki variable'a baska data turunden deger atamaya denir

        // bl  = sayiInt ;
        // bl = str;
        // bl = chr;
        // boolean data turundeki bir variable'a sadece boolean degerler atayabilirsiniz

        // str = sayiInt;
        // str = bl;
        // str = chr;

        // sayisal degerler alan variable'lara baska sayisal data turlerindeki degerler ATANABILIR MI?

        dbl = sayiInt;
        dbl = byt;
        dbl = shrt;
        dbl = chr;

        // sayiInt = dbl;
        sayiInt = shrt;
        sayiInt = byt;
        sayiInt = chr;

        // shrt = dbl;
        // shrt = sayiInt;
        shrt = byt;
        // shrt = chr;
    }
}
