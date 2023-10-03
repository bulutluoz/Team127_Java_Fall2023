package day20_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Mutable_ImmutableClasses {

    public static void main(String[] args) {


        String s = "Java";

        String str = new String("Java Candir");


        System.out.println(str.toUpperCase()); // JAVA CANDIR


        System.out.println(str);// Java Candir

        str.toLowerCase();

        // String method'larinin yaptigi degisiklikler sadece o satir icin gecerlidir
        // kalici olmasini istersek atama yapmaliyiz


        List<String> isimler = new ArrayList<>();

        isimler.add("Senayda");
        isimler.add("Asli");
        isimler.add("Beytullah");

        System.out.println(isimler); // [Senayda, Asli, Beytullah]

        isimler.set(1,"Yusuf");

        System.out.println(isimler); // [Senayda, Yusuf, Beytullah]


    }
}
