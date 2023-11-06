package day19_passByValue;

public class C01_staticBlocks {


    C01_staticBlocks(){
        System.out.println("constructor calisti");
    }

    static {
        System.out.println("static block calisti");
        /*
            Eger class calismaya baslamadan
            belirli ayarlari yapmak isterseniz
            static block olusturabilirsiniz

            static block'lar class'daki HERSEYDEN
            hatta main method'dan bile
            once calisirlar

            birden fazla static block varsa,
            kendi iclerinde once ustteki calisir
         */
    }

    {
        System.out.println("static olmayan block");
        /*
            obje olusturmadan once
            yapilmasi gereken on ayarlar varsa kullanilir
         */

    }



    public static void main(String[] args) {

        System.out.println("main method calisti");

        C01_staticBlocks obj = new C01_staticBlocks();
        C01_staticBlocks obj2 = new C01_staticBlocks();

    }

    static {
        System.out.println("alttaki static block calisti");
    }
}
