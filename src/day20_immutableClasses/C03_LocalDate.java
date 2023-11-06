package day20_immutableClasses;

import java.time.LocalDate;

public class C03_LocalDate {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println(localDate); // 2023-10-03

        System.out.println(localDate.plusWeeks(10)); // 2023-12-12

        System.out.println(localDate.plusMonths(4).plusDays(5)); // 2024-02-08

        System.out.println(localDate.minusYears(3).minusMonths(2).minusDays(13));
        // 2020-07-21

        System.out.println(localDate.withMonth(5)); // 2023-05-03

        System.out.println(localDate.withDayOfYear(200)); // 2023-07-19

        System.out.println(localDate.isLeapYear()); // false

        LocalDate dogumTarihi1 = LocalDate.of(1996,7,12);
        LocalDate dogumTarihi2 = LocalDate.of(2000,10,10);

        System.out.println(dogumTarihi1.isLeapYear()); // true
        System.out.println(dogumTarihi2.isLeapYear()); // true

        System.out.println(dogumTarihi1.isBefore(dogumTarihi2)); // true
        System.out.println(dogumTarihi1.isAfter(dogumTarihi2)); // false

        System.out.println(localDate.lengthOfYear()); // 365
        System.out.println(dogumTarihi1.lengthOfYear()); // 366

        System.out.println(localDate.getDayOfYear()); // 276

        System.out.println(localDate.getDayOfWeek()); // TUESDAY
        System.out.println(dogumTarihi1.getDayOfWeek()); // FRIDAY


    }
}
