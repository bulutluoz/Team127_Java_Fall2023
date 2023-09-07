package day08_stringManipulations;

public class C09_ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <10 ; i++) {

            System.out.print(i + " ");
        }

        System.out.println("");
        // 100'den 200'e kadar (sinirlar dahil) cift sayilari yazdirin

        for (int i = 100; i <=200 ; i+=2 ) {
            System.out.print(i + " ");
        }


        System.out.println("");
        // 100'den 200'e kadar (sinirlar dahil) cift sayilari yazdirin

        for (int i = 100; i <=200 ; i++) {

            if ( i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        // 200 ile 270 arasinda (sinirlar dahil) 7'nin kati olan sayilari yazdirin

        for (int i = 200; i <=270 ; i++) {
            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("");
        // 200'den baslayip, 150'ye kadar(sinirlar dahil) 3'er 3'er atlayarak yazdirin

        for (int i = 200; i >= 150 ; i-=3) {
            System.out.print(i + " ");
        }

    }
}
