package day40_GarbageCollecter_FinalFinalyFinalisze;

import java.util.Arrays;

public class C02_Iterators {

    public static void main(String[] args) {

        int [] arr = {3,4,8,6,4,8,2,12};

        // print all elements of the arr

        for ( int each : arr
             ) {
            System.out.print(each+ "    ");
        }

        System.out.println();
        System.out.println("============");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"    ");
        }

        // without using index structure
        // please add 3 to all elements

        /*
        we can not use fori loop because we can not use index structure
         */

        System.out.println();
        System.out.println("============");


        for (int each: arr
             ) {
            each= each +3;
            System.out.print(each+"    ");

        }

        System.out.println();
        System.out.println("============");

        System.out.println(Arrays.toString(arr));

        /*
        by using for each loop, even we do not use index, we can print all elements, but we can not change them
         */




    }
}
