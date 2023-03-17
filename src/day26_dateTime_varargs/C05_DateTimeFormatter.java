package day26_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {
/*
Java generates date and time in its own format
             However, we do not need to translate it in accordance with the format we want or
             allows us to print

             when creating the format
DAY
d : day number without typing 0 if there is a 0 at the beginning
dd: day number by typing zero for single digit days like 01
DDD : writes what day of the year it is
E, EE, EEE : first 3 letters of the name of the day
EEEE : full day name

MONTH (M for month, m for minute)
M : If there is 0 at the beginning, the month number without writing it
MM:dd: month number by writing zero for single digit months like 01
MMM : The first 3 letters of the month name
MMMM : Full month name

YY : last two digits of the year
YYYY : the whole of the year

Hour : (H if we want it over 24 hours, h if we want it in 12 hours)
HH : whole hour, like 02 if it's a single digit hour
H : If there is a single digit hour, only the hour
If we write a, it writes the value of AM or PM.
 */

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt); // 2023-03-17T21:55:16.352732500

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d / MMM / yy");
        System.out.println(dt.format(dtf)); // 17 / Mar / 23

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(dt.format(dtf2));// 17.03.2023

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEEE HH:mm");
        System.out.println(dt.format(dtf3)); // Cuma 22:04

        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("EEEE hh:mm a");
        System.out.println(dt.format(dtf4)); //  Cuma 10:05 PM




    }


}
