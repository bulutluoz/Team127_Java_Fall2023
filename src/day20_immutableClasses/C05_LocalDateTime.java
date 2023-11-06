package day20_immutableClasses;

import java.time.LocalDateTime;

public class C05_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt); // 2023-10-03   T   12:32:31.244596

        // Kullaniciya zamani 3 ekim 2023 sali  seklinde yazdirin

        System.out.println(ldt.getDayOfMonth() + " "
                            + ldt.getMonth()+ " "
                            + ldt.getYear()+ " "
                            + ldt.getDayOfWeek());

        // 3 OCTOBER 2023 TUESDAY
        // 03 Oct 2023 Tue


    }
}
