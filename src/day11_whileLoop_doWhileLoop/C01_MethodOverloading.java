package day11_whileLoop_doWhileLoop;

public class C01_MethodOverloading {
    public static void main(String[] args) {

        /*
            Bir class'da ismi ayni ama signature'i farkli method'lar olusturmaya
            Method OVERLOADING denir.

            Method overloading'in amaci ayni islevi,
            farkli sekillerde kullanabilmektir

            Overloading'de isimler ayni oldugundan,
            ayni class'da birden fazla overloaded method yazabilmek icin
            signature'lari degistirmemiz GEREKLIDIR

            signature = method adi + parametrelerin data turleri
            toplama int int
            toplama int
            toplama int int int

            toplama double int
            toplama int double
            toplama float int
            toplama float double

            Java hangi method'u kullanacagina
            method call sirasinda yazacagimiz argument'lere gore karar verir

            1- argument sayisi == parametre sayisi
            2- argument data turleri ve siralanisi == parametre data turleri ve siralanisi
            3- argument'ler ile parametyreler %100 uyumlu olmazsa
               casting ile calistirilabilir method var mi ? diye bakar
               casting ile calistirilabilecek birden fazla method varsa
               en az casting yaparak kullanabilecegini tercih eder

         */

        String str = "Java Candir";
        System.out.println(str.substring(3)); // a Candir
        System.out.println(str.substring(3, 6)); // a C


        System.out.println(str.replace('a', 'b')); // Jbvb Cbndir
        System.out.println(str.replace("Can", "Guzel")); // Java Guzeldir


    }
}
