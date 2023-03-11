package day21_ArrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_FindingCommonElements {

    // Question 5- Write a program that compares the elements of the two given arrays
    // and returns the elements common to both of them as a separate list.
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7};
        int[] arr2 = {3, 9, 6, 3};

        commonElements(arr1, arr2);

    }

    public static void commonElements(int[] arr1, int[] arr2) {
        // to store common elements we created a list
        List<Integer> commonElementsList = new ArrayList<>();

        for (int each1 : arr1) {

            for (int each2 : arr2) {

                if (each1 == each2 && !commonElementsList.contains(each1)) {
                    commonElementsList.add(each1);
                }
            }
        }
        System.out.println(commonElementsList);


    }
}
