package day21_varargs_stringBuilder;

public class C06_StringBuilder_length_capacity {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        // icinde hic bir yazi yok, length ==> 0 ,
        System.out.println("sb1 length : "+sb1.length()); // 0
        System.out.println("sb1 capacity : "+sb1.capacity()); // 16

        StringBuilder sb2 = new StringBuilder("Ali Can");
        // icinde Ali Can var , length ==>7
        System.out.println("sb2 length : "+sb2.length()); // 7
        System.out.println("sb2 capacity : "+sb2.capacity()); // 16+7 = 23

        StringBuilder sb3 = new StringBuilder(11);
        // icinde hic bir yazi yok, length ==> 0 ,
        System.out.println("sb3 length : "+sb3.length()); // 0
        System.out.println("sb3 capacity : "+sb3.capacity()); // 16



        // Eger stringBuilder'a ekleme yaparsaniz
        // java eklenecek metni de alabilmesi icin
        // sb'in kapasitesitini 2 * eski kapasite + 2 seklinde artirir

        sb2.append(" okula gitmek istiyor.");
        System.out.println("sb2 : " + sb2); // Ali Can okula gitmek istiyor.
        System.out.println("sb2 length : "+sb2.length()); // 29
        System.out.println("sb2 capacity : "+sb2.capacity()); // 23 * 2 + 2 = 48

        // Eger kapasite ve length'i esitlemek isterseniz

        sb2.trimToSize();

        System.out.println("sb2 : " + sb2); // Ali Can okula gitmek istiyor.
        System.out.println("sb2 length : "+sb2.length()); // 29
        System.out.println("sb2 capacity : "+sb2.capacity()); // 29




    }
}
