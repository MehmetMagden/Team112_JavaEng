package day40_GarbageCollecter_FinalFinalyFinalisze;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class C04_Iterators {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(56);
        numbers.add(3);
        numbers.add(4);



        // first we need to create an interator object
        Iterator it1 = numbers.iterator(); // iterator takes its place just before the first element of the list

        System.out.println(it1.hasNext()); // true // it has 6 (the first element of the list) next to it.
        System.out.println(it1.next()); // 6 // first element of the list

        System.out.println(it1.hasNext()); // true
        System.out.println(it1.next()); // 56

        System.out.println(it1.hasNext()); // true
        System.out.println(it1.next()); // 3

        System.out.println(it1.hasNext()); // true
        System.out.println(it1.next()); // 4

        System.out.println(it1.hasNext()); // false
        System.out.println(it1.next()); // // java.util.NoSuchElementException // because there is nothing at right side of the ite


    }
}
