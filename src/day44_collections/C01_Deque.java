package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {

    public static void main(String[] args) {

        // deque means double ended queue
        // an element can be added or removed from both sides of a deque

        Deque<String> letters = new LinkedList<>();

        letters.add("J");
        letters.add("K");
        System.out.println(letters);  // [J, K]

        letters.addFirst("B");
        System.out.println(letters); // [B, J, K]
        letters.addLast("B");
        System.out.println(letters); // [B, J, K, B]
        letters.add("L");
        letters.add("H");
        letters.add("U");
        letters.addFirst("R");

        System.out.println(letters); // [R, B, J, K, B, L, H, U]

        letters.remove("B");
        System.out.println(letters); // [R, J, K, B, L, H, U]

        letters.addFirst("B");
        System.out.println(letters); // [B, R, J, K, B, L, H, U]
        System.out.println(letters.removeFirstOccurrence("B")); // true
        System.out.println(letters); // [R, J, K, B, L, H, U]

        letters.addFirst("B");
        System.out.println(letters); // [B, R, J, K, B, L, H, U]
        System.out.println(letters.removeLastOccurrence("B")); // true
        System.out.println(letters); // [B, R, J, K, L, H, U]

        System.out.println(letters.peekFirst()); // B
        System.out.println(letters.peekLast()); // U
        System.out.println(letters.peek()); // B

        LinkedList<String> symbols = new LinkedList<>();
        symbols.add("*");
        symbols.add("?");
        symbols.add("&");
        System.out.println(symbols); // [*, ?, &]

        LinkedList<String> copy =(LinkedList<String>) symbols.clone();
        System.out.println(copy);  // [*, ?, &]




    }
}
