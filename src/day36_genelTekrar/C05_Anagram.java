package day36_genelTekrar;

import java.util.Arrays;

public class C05_Anagram {

    public static void main(String[] args) {

        /*
		    Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanicidan alinacak iki metnin Anagram durumunu belirleyen  Java kodunu yaziniz.
			isAnagram("listen", "Silent") ==> true
		 */

        System.out.println(isAnagram("Listen","Silent"));
        System.out.println(isAnagram("Kalma","Almak"));
        System.out.println(isAnagram("arcelik","kralice"));
        System.out.println(isAnagram("Selma","Elmas"));
    }

    public static boolean isAnagram(String str1 , String str2){

        String[] str1Arr = str1.toUpperCase().split("");
        String[] str2Arr = str2.toUpperCase().split("");

        Arrays.sort(str1Arr);
        Arrays.sort(str2Arr);

        return Arrays.equals(str1Arr, str2Arr);
    }
}
