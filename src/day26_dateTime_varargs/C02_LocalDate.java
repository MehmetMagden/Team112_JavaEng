package day26_dateTime_varargs;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date); // 2023-03-17

        System.out.println(date.isLeapYear()); // false

        LocalDate date2 = LocalDate.of(1984,7,3);

        System.out.println(date2.isLeapYear()); // true

        System.out.println(date.plusYears(1).plusWeeks(2).plusDays(3)); // 2024-04-03

        System.out.println(date); // 2023-03-17

        System.out.println(date.minusYears(10).minusMonths(3).minusDays(3)); // 2012-12-14

        System.out.println(date.withYear(1999)); // 1999-03-17
        System.out.println(date.withYear(1999).withMonth(12)); // 1999-12-17

        System.out.println(date.getDayOfYear()); // 76
        System.out.println(date.getDayOfMonth()); //17
        System.out.println(date.getMonth()); // MARCH

        LocalDate date3 = LocalDate.of(1984,1,31);
        System.out.println(date3.getDayOfWeek()); // TUESDAY

        System.out.println(date.isBefore(date3)); // false
        System.out.println(date.isAfter(date3)); // true


    }
}
