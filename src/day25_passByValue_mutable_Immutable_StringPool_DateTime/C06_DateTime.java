package day25_passByValue_mutable_Immutable_StringPool_DateTime;

import java.time.LocalTime;

public class C06_DateTime {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        // create a loop to calculate sum of numbers starting from 1 to 10000
        // and find how much time it takes.


        LocalTime startingTime = LocalTime.now(); // 20:48:20.081694800
        System.out.println(startingTime.getNano()); //83694800
        int staringNanoSec = startingTime.getNano();

        int sum =0;
        for (int i = 1; i <= 10000000; i++) {
            sum +=i;
        }


        LocalTime endinTime = LocalTime.now();
        System.out.println(endinTime); // 20:48:20.095688100
        System.out.println(endinTime.getNano()); //95688100
        int endintNanoSec = endinTime.getNano();

        System.out.println(endintNanoSec-staringNanoSec); // 11993300

    }

}
