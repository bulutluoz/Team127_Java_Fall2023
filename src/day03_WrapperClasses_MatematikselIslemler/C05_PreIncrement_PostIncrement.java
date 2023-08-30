package day03_WrapperClasses_MatematikselIslemler;

public class C05_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        int a = 20 ;

        // a'nin degerini yazdirin
        // sonra a'nin degerini 1 artir ve olusturacaginiz b variable'ina yeni degeri atayin

        System.out.println("a : " + a);

        a += 1;
        int b = a ;

        System.out.println( "islem sonunda a : " + a + ", b : " + b);

        a = 20;
        // a'nin degerini b'ye atayin
        // sonra a'nin degerini 1 artirin

        b = a ;
        a += 1 ;

        System.out.println( "islem sonunda a : " + a + ", b : " + b);

        System.out.println("=========================");

        // bu anlatilan sadece ++ veya -- seklindeki kullanim icindir

        a = 20 ;
        b = a++ ;
        System.out.println( "a++ islem sonunda a : " + a + ", b : " + b);

        a=20;
        b= ++a;
        System.out.println( "++a islem sonunda a : " + a + ", b : " + b);


        int c = 40;

        System.out.println( "c++ ile yazdirinca : " + c++);
        System.out.println("c++ ile bir alt satirda c'nin degeri : " + c);


        c = 40;

        System.out.println( "++c ile yazdirinca : " + ++c);
        System.out.println("++c ile bir alt satirda c'nin degeri : " + c);


    }
}
