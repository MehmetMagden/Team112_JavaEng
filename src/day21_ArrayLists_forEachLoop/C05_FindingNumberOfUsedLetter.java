package day21_ArrayLists_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C05_FindingNumberOfUsedLetter {
    public static void main(String[] args) {
        //Question 4- Take a sentence and a letter from the user,
        // print how many times the letter is used in the sentence,
        // if not, print “the letter is not used in the sentence”.

        String str = "We should work hard to get paid";

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter");
        String letter = scan.next().substring(0,1);

        // split str by using "" then assing it to an array
        String[] arr = str.split(""); // [W, e,  , s, h, o, u, l, d,  , w, o, r, k,  , h, a, r, d,  , t, o,  , g, e, t,  , p, a, i, d]

        System.out.println(Arrays.toString(arr));
        int counter = 0;
        for (String each : arr
        ) {
            if (each.equalsIgnoreCase(letter)) {
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println(letter + " is not used in the sentence");
        } else {
            System.out.println(letter + " is used " + counter + " times in the sentence");
        }
    }
}
