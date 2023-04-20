package day46_MapEntrySet;

import java.util.Map;
import java.util.TreeMap;

public class C07_Compute {
    public static void main(String[] args) {


              /*
        String[] arr = {"A","C","B","N","A","N","A"}
        Output : A=3, B=1, C=1, N=2

        print how manytimes a letter is used.
         */

        String[] arr = {"A","C","B","N","A","N","A"};

        Map<String,Integer> usageOfLetters = new TreeMap<>(); // an empty map

        for (String eachLetter: arr
             ) {



            usageOfLetters.computeIfPresent(eachLetter,(k,v) -> v+1);

            usageOfLetters.putIfAbsent(eachLetter,1); // if our map does not have the key, it will add it to the map

        }

        System.out.println(usageOfLetters);


    }
}
