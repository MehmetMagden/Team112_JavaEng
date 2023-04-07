package day41_Iterators_Maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_IteratorQuestion {

    /*
    Question 1) Write a program that deletes elements in a list that are not in the desired number range ...
    (operate on the current list without creating the 2nd list)
Example : [2,13,56,23,45,14,40] desired range is between 20 and 40 (including borders)
output: [23,40]

     */

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(13);
        numbers.add(56);
        numbers.add(23);
        numbers.add(45);
        numbers.add(14);
        numbers.add(40);

        Iterator it = numbers.iterator();

        while (it.hasNext()) {

            int numb = (Integer) it.next();

            if (numb <= 40 && numb >= 20) {

            } else {
                it.remove();
            }
        }
        System.out.println(numbers);
    }
}
