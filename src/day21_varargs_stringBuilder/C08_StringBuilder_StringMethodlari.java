package day21_varargs_stringBuilder;

public class C08_StringBuilder_StringMethodlari {

    public static void main(String[] args) {

        /*
            StringBuilder ile bazi String method'lari da kullanilabilir
            bize String veya char donduren method'lar
            kalici degisiklik yapmazlar

            Bazi String method'lari ise StringBuilder'da yoktur
            kullanmak istersek
            sb.toString() ile once String'e cevirir, sonra istenen String method'u kullanilabilir
            boyle yapilan degisiklikler sb'da kalici degisiklik YAPMAZ
         */

        StringBuilder sb = new StringBuilder("Java");

        System.out.println(sb.substring(2)); // va

        System.out.println(sb); // Java

        System.out.println(sb.charAt(2)); // v

        System.out.println(sb); // Java

        // void olan setCharAt() kalici degisiklik yapar
        sb.setCharAt(0,'H');
        System.out.println(sb); // Hava

        // sb  "a" iceriyor mu ?

        System.out.println(sb.toString().contains("a")); // true


    }
}
