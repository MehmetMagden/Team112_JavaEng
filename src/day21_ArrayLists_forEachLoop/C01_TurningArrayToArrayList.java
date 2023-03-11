package day21_ArrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_TurningArrayToArrayList {
    public static void main(String[] args) {

        Integer[] arr = {3,4,5,6,4,3,5,4,6,5,4,3,4,5,6,4,5,3,4,5,6,5,4};

        // copy all these elements to an arrayList

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            numbers.add(arr[i]);
        }

        System.out.println("Numbers Lists : "+ numbers);
        /*
        // java has a premade method named asList().
        // but we prefer using loop to change an array to arrayList
        // because
            1) If you used asList() to create a list, you can not add or remove elements from it.
            it will act just like an array

            2) If you change any value of list or array, it will also change the other one's value
        */
            // First Problem
        // by using asList method, I directly created a new list
        List<Integer> listFromArray = Arrays.asList(arr);

        System.out.println("Numbers Lists : "+ numbers);
        System.out.println("listFromArray : "+listFromArray);

        numbers.add(11);
        //listFromArray.add(11); // UnsupportedOperationException

        System.out.println("Numbers Lists : "+ numbers);
        System.out.println("listFromArray : "+listFromArray);

        numbers.remove(0);
        //listFromArray.remove(0); // UnsupportedOperationException

        System.out.println("Numbers Lists : "+ numbers);
        System.out.println("listFromArray : "+listFromArray);

            // Second Problem
        System.out.println("===============================");
        System.out.println("Array           : "+Arrays.toString(arr));
        System.out.println("List from Array : "+listFromArray);

        // let's change the first value of the array to 55
        arr[0] = 55;
        System.out.println("==== after we change the first value of the array ==========");
        System.out.println("Array           : "+Arrays.toString(arr));
        System.out.println("List from Array : "+listFromArray);

        // let's change a value of the list to 99
        listFromArray.set(0,99);
        System.out.println("==== after we change the first value of the List ==========");
        System.out.println("Array           : "+Arrays.toString(arr));
        System.out.println("List from Array : "+listFromArray);


    }

}
