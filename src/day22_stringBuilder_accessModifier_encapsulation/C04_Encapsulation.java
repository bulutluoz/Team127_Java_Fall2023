package day22_stringBuilder_accessModifier_encapsulation;

public class C04_Encapsulation {


    public String getGorulebilsin() {
        return gorulebilsin;
    }

    public void setDegerAtanabilsin(String degerAtanabilsin) {
        this.degerAtanabilsin = degerAtanabilsin;
    }

    private String gorulebilsin = "Bu variable gorulebilir ama degistirilemez";

    private String degerAtanabilsin = "Bu variable'a deger atanabilir ama atanmis deger gorunemez";

    public String gorulebilirVeDegerAtanabilir = "Bu variable'a hem deger atanabilir hem de degeri gorulebilir";

    private int sayi = 10 ;

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }
/*
        Bir projede calisirken
        en onemli konulardan birisi de
        class uyelerine kimlerin ulasabileceginin ve degistirebileceginin belirlenmesidir

        Bu sinirlamayi en kolay olarak access modifier ile yapabiliriz
        Access modifier ile bir variable'a ulasabilirseniz
        o variable hem deger atayabilir
                   hem de degerini okuyup kullanabilirsiniz

        Gercek hayatta degerleri gorme(read) ve yeni deger atayabilme (write)
        YETKILERININ AYRILMASI istenebilir

        Yekileri ayirmak istiyorsaniz
        1- oncelikle access modifier ile erisimi engelleyin
        2- istenen yetkiyi saglayan getter ve/veya setter method'u olusturun

     */


}
