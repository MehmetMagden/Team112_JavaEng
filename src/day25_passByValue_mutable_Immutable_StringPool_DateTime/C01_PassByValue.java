package day25_passByValue_mutable_Immutable_StringPool_DateTime;

import java.util.Arrays;

public class C01_PassByValue {
    public static void main(String[] args) {

        int [] arr = {3,4,5};

        System.out.println("Original array : "+Arrays.toString(arr));

        increaseElements(arr,3);

        System.out.println("Original array after the method Call : "+ Arrays.toString(arr));
    }

    public static void increaseElements(int[] arr,int increment){

        for (int i = 0; i < arr.length ; i++) {

            arr[i] += increment;
        }

        System.out.println("inside increaseElements method, array is : "+Arrays.toString(arr));






















    }

}
