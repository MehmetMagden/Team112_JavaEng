package day43_collections;

import java.util.LinkedList;
import java.util.List;

public class C02_LinkedListsMethods {
    public static void main(String[] args) {
        // Let's create a linkedList using List Interface

        List<String> letters = new LinkedList<>();

        letters.add("H");
        letters.add("K");
        letters.add("M");
        letters.add("L");

        System.out.println(letters); // [H, K, M, L] // a linked list using nodes
        letters.add("B");
        System.out.println(letters); // [H, K, M, L, B] // did not change the order of elements

        letters.add(3,"R");
        System.out.println(letters); // [H, K, M, R, L, B]

        List<String>  symbols = new LinkedList<>();

        symbols.add("*");
        symbols.add("B");
        symbols.add("%");
        symbols.add("&");

        System.out.println(symbols); // [*, B, %, &]

        // true  // if it can find comment elements, they will be removed (returning true).
        // if it can not find any, it will return false
        System.out.println(letters.removeAll(symbols));
        System.out.println(letters);  // [H, K, M, R, L]
        System.out.println(symbols); // [*, B, %, &]

        System.out.println(letters.subList(2, 4)); //[M, R]
        System.out.println(letters); // [H, K, M, R, L]

        letters.add("B");

        //Please keep if you have any common elements with the symbols list

        System.out.println(letters); // [H, K, M, R, L, B]  // only common elements will be kept in this list
        System.out.println(symbols); // [*, B, %, &]
        System.out.println(letters.retainAll(symbols)); //true
        System.out.println(letters); //[B]
        System.out.println(symbols);// [*, B, %, &]




    }
}
