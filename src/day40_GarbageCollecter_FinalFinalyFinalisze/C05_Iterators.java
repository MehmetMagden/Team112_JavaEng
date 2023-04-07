package day40_GarbageCollecter_FinalFinalyFinalisze;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C05_Iterators {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(6);
        numbers.add(56);
        numbers.add(3);
        numbers.add(4);

        // let's delete all elements

        Iterator it1 = numbers.iterator();

        int sizeOfList = numbers.size();

//        for (int i = 0; i <sizeOfList ; i++) {
//
//            //System.out.println(it1.hasNext());
//            it1.next();
//            it1.remove();
//        }
//        System.out.println(numbers);

//        while (it1.hasNext()){
//            it1.next();
//            it1.remove();
//        }
//
//        System.out.println(numbers);

        // delete all even numbers by using iterators

        while (it1.hasNext()) {
            Integer number = (Integer) it1.next();

            if (number % 2 == 0) {
                it1.remove();
            }
        }

        System.out.println(numbers);


    }
}
