package day43_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C02_Queue {
    public static void main(String[] args) {
        Queue<String> letters = new LinkedList<>();

        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("A");

        // this is not a set so we can add same elements more than once
        System.out.println(letters);  // [A, B, C, A]

        // let's try to add an element to index 2
        // because of queue structure we can only add elements to the end of the queue

        System.out.println(letters.remove());
        System.out.println(letters);  // [B, C, A]

        System.out.println(letters.remove()); // B
        System.out.println(letters); // [C, A]

        letters.add("K");
        letters.add("L");

        // element method will return us the first one in the queue, but it won't remove it
        System.out.println(letters); // [C, A, K, L]
        System.out.println(letters.element()); // C
        System.out.println(letters); // [C, A, K, L]

        System.out.println(letters.remove());
        System.out.println(letters.element());  // A

        System.out.println(letters.peek()); // A

        Queue<String> emptyQueue = new LinkedList<>();

        // peek and element methods returns head of the queue, If the queue is empty peek returns null but element method
        // throws an exception
        System.out.println(emptyQueue.peek()); // null

        //System.out.println(emptyQueue.element()); // NoSuchElementException
        System.out.println(letters);  // [A, K, L]
        System.out.println(letters.poll()); // A removes the head of the queue and returns it
        System.out.println(letters); // [K, L]

        System.out.println(letters.remove()); // K
        System.out.println(letters); // [L]

        System.out.println(letters.offer("*"));
        System.out.println(letters); // [L, *]


    }


}
