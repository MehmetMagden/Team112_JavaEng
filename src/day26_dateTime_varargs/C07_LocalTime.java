package day26_dateTime_varargs;

import java.time.LocalTime;
import java.time.ZoneId;

public class C07_LocalTime {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time); // 22:19:45.871327700

        LocalTime localTime1 = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println(localTime1); // 19:18:40.661577600

        LocalTime localTime2 = LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(localTime2); // 15:19:45.885317700

    }
}
