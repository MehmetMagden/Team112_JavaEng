package day25_passByValue_mutable_Immutable_StringPool_DateTime;

import java.time.LocalTime;

public class C06_DateTime {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println(time);

        // create a loop to calculate sum of numbers starting from 1 to 10000
        // and find how much time it takes.


        LocalTime startingTime = LocalTime.now();
        System.out.println(startingTime.getNano());
        int staringNanoSec = startingTime.getNano();

        int sum =0;
        for (int i = 1; i <= 10000; i++) {
            sum +=i;
        }


        LocalTime endinTime = LocalTime.now();
        System.out.println(endinTime.getNano());
        int endintNanoSec = endinTime.getNano();

        System.out.println(endintNanoSec-staringNanoSec);

    }

}
