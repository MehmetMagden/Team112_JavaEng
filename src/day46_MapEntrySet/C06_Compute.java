package day46_MapEntrySet;

import java.util.Map;
import java.util.TreeMap;

public class C06_Compute {
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
        // if there is no "A" in the map we will add it to the map
            if (!usageOfLetters.containsKey(eachLetter)){
                usageOfLetters.put(eachLetter,1);
            }else {
//                // if your map has the letter, we need to increase value
//                int oldValue = usageOfLetters.get(eachLetter); // old value of the letter
//                usageOfLetters.put(eachLetter,oldValue+1);




            }



        }

        System.out.println(usageOfLetters);


    }
}
