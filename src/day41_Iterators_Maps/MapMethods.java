package day41_Iterators_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {


    public static void namesOfStudentsFromBranch(Map<Integer, String> schoolMap, String h) {



        for (String each: schoolMap.values()
             ) {
            String [] arr =each.split("-");  // [Ali, Cem, 10, H]

            if (arr[3].equalsIgnoreCase(h)){
                System.out.println("name : "+arr[0]+", surname : " + arr[1]);
            }

        }

    }

    public static Map<Integer,String> createExampleMap(){

        Map<Integer,String> schoolMap = new HashMap<>();

        schoolMap.put(101,"Ali-Cem-10-H");//  [Ali, Cem, 10, H]
        schoolMap.put(102,"Veli-Can-10-M");
        schoolMap.put(103,"Ali-Can-11-M");
        schoolMap.put(104,"Ayse-Cem-11-H");
        schoolMap.put(105,"Ayse-Han-10-H");
        schoolMap.put(106,"Veli-Han-10-H");

        return schoolMap;

    }

}
