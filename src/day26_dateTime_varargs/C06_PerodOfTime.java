package day26_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C06_PerodOfTime {
    public static void main(String[] args) {

        LocalDate birthDay = LocalDate.of(1984,1,31);
        System.out.println("birthday : "+birthDay);

        LocalDate today = LocalDate.now();
        System.out.println("today : "+today);

        System.out.println(Period.between(birthDay, today)); // P39Y1M17D

        System.out.println(Period.between(birthDay, today).getYears()); // 39
        System.out.println(Period.between(birthDay, today).getDays()); // 17



    }
}
