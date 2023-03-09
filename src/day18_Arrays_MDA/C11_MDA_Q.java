package day18_Arrays_MDA;

import java.util.ArrayList;
import java.util.List;

public class C11_MDA_Q {

    //Question 2- calculate sum of  the elements with the same index in a given 2 dimensional array and
    // assign these sums to a single-layered array that we will create.


    //			input : int[][] arr = {{3,4,5}, {2,3,6,7}};
    //			output: [5, 7, 11]

    //  to find the shortest array
    public static void main(String[] args) {

        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}, {6, 8}};

        int shortestArrayLength = arr[0].length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length < shortestArrayLength) {
                shortestArrayLength = arr[i].length;
            }
        }

        // to find sum of numbers with same index numbers

        int sum = 0; //to calculate sum of numbers
        List<Integer> sumList = new ArrayList<>();  // empty list

        for (int i = 0; i < shortestArrayLength; i++) {
            for (int j = 0; j < arr.length; j++) {

                //System.out.println("Loop Number is (j) : " +j +"   (i) : " +i);
                System.out.println(arr[j][i]);
                sum += arr[j][i];
            }
            sumList.add(sum);
            sum = 0;
        }
        System.out.println(sumList);
    }
}
