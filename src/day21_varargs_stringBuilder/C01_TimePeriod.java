package day21_varargs_stringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C01_TimePeriod {

    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1992,12,29);
        LocalDate bugun = LocalDate.now();

        Period yasim = Period.between(dogumTarihi,bugun);

        System.out.println(yasim); // P30Y9M5D

        System.out.println(yasim.getYears()); // 30
    }
}
