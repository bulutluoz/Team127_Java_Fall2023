package day22_stringBuilder_accessModifier_encapsulation;


public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Candir");

        sb.reverse();

        System.out.println(sb); // ridnaC avaJ

        sb.reverse();

        System.out.println(sb); // Java Candir

        StringBuilder sb2 = new StringBuilder("Java Guzeldir");

        StringBuilder sb3 = new StringBuilder("Hava Guzel");

        StringBuilder sb4 = new StringBuilder("Ne bu simdi?");

        StringBuilder sb5 = new StringBuilder("Java Candir");


        System.out.println(sb.compareTo(sb2)); // -4
        System.out.println(sb.compareTo(sb3)); // 2
        System.out.println(sb.compareTo(sb4)); // -4
        System.out.println(sb.compareTo(sb5)); // 0



        System.out.println(sb.equals(sb5)); // false
        /*
            StringBuilder'larin esitligini anlamak icin equals() kullanilmaz
            Eger iki StringBuilder'in ayni oldugunu kontrol etmek istersek
            sb1.compareTo(sb2) yazariz,
            sonuc olarak bize 0 dondururse iki SB aynidir

            ayni degilse bastan kontrol ederek ilerler
            ve buldugu ilk farkli harflerin arasinda (ascii table) kac sayi oldugunu dondurur

         */

        /*
            Bir String ve bir StringBuilder karsilastirilabilir mi ?

            Java'da farkli non-primitive datalar == ile karsilastirilamaz

            bir String ile bir StringBuilder'i
            equals() ile karsilastirmaniza java CTE vermez
            AMMA metinler ayni olsa bile false doner
         */

        String str = "Java Candir";

        // System.out.println(str == sb );
        // Operator '==' cannot be applied to 'java.lang.String', 'java.lang.StringBuilder'

        System.out.println(str.equals(sb)); // false

        sb.replace(0,4,"Hava");
        System.out.println(sb); // Hava Candir
    }
}
