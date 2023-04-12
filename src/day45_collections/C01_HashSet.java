package day45_collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C01_HashSet {

    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();

        numbers.add(45);
        numbers.add(12);

        System.out.println(numbers);

        Set<Integer> orderedSet = new TreeSet<>();

        orderedSet.add(23);
        orderedSet.add(35);
        orderedSet.addAll(numbers);

        System.out.println(orderedSet);

        // let's use hashset and treeset in action to see which one is faster
        // we will try to create 2000 random numbers and we will add them the treeset and hashset
        // and we will scale the time to see which one is faster

        // Random number

        Random rnd = new Random();
        int number ;

        // taking starting time of hashSet
        LocalTime hashStart = LocalTime.now();
        for (int i = 0; i <2000 ; i++) {

            number = rnd.nextInt(2000000);
            // adding random numbers to hashSet
            numbers.add(number);
        }
        LocalTime hashFinish = LocalTime.now();


        // taking starting time of treeSet
        LocalTime treeStart = LocalTime.now();
        for (int i = 0; i <8000 ; i++) {

            number = rnd.nextInt(2000000);
            // adding random numbers to treeSet
            orderedSet.add(number);
        }
        LocalTime treeFinish = LocalTime.now();


        System.out.println("hasSet starting : "+ hashStart+" Finish : "+hashFinish);
        System.out.println("treeSet starting : "+ treeStart+" Finish : "+treeFinish);

        System.out.println("hasSet   : "+ (hashFinish.getNano()-hashStart.getNano()));
        System.out.println("treeSet  : "+ (treeFinish.getNano()-treeStart.getNano()));





    }

}
