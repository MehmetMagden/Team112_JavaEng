package day41_Iterators_Maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_IteratorQuestions {

    public static void main(String[] args) {
        // Question 2) Print elements in a list from end to begining using an iterator


        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(13);
        numbers.add(56);
        numbers.add(23);
        numbers.add(45);
        numbers.add(14);
        numbers.add(40);

        ListIterator lit = numbers.listIterator();

        // we are sending iterator to the end of the list
        while (lit.hasNext()){
            lit.next();
        }

        // we make iterator jump backward and print the value
        while( lit.hasPrevious())
            System.out.print(lit.previous()+" ");

    }
}
