package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;

public class C04_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih= LocalDate.now();
        System.out.println(tarih);  // 2022-10-29
        System.out.println(tarih.minusDays(100)); // 2022-07-21
        System.out.println(tarih.minusWeeks(5).minusDays(3)); // 2022-09-21
        System.out.println(tarih.plusMonths(5)
                .plusWeeks(2)
                .plusDays(3)); // 2023-04-

        LocalDate tarih2= LocalDate.now();
        System.out.println(tarih2);
        System.out.println(tarih2.minusDays(100000).minusWeeks(5));
        LocalDate tarih3= LocalDate.ofYearDay(571, 12
        );
        System.out.println(tarih3);
    }
}
