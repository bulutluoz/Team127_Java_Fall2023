package day06_stringManipulations;

public class C05_length {
    public static void main(String[] args) {

        String str = "Java ogren issiz kalma.";

        System.out.println(str.length()); // 26

        // sondan 2.karakteri yazdirin

        // System.out.println(str.charAt(26-2)); // z

        str= "Java";
        System.out.println(str.charAt(str.length()-2)); // v

        // Kodlamada DINAMIK kod yazmak onemlidir
        // Dinamik kod input'dan bilgileri alip,
        // input degisse bile calismaya devam eden kod demektir


        // metnin son karakterini yazdirin

        System.out.println(str.charAt(str.length()-1)); // a

        str= "Java guzeldir.";

        System.out.println(str.charAt(str.length()-1)); // .
    }
}
