package day26_dateTime_varargs;

import java.time.LocalDateTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt); // 2023-03-17T21:49:16.378497500

        System.out.println(dt.toLocalDate()); // 2023-03-17

    }
}
