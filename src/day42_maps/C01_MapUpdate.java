package day42_maps;

import day41_Iterators_Maps.MapMethods;

import java.util.Arrays;
import java.util.Map;

public class C01_MapUpdate {
    public static void main(String[] args) {

        Map<Integer,String> schoolMap=MapMethods.createExampleMap();
        System.out.println(schoolMap);
        // we whant to transfer all students from branch M to N

        //{101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}


        //System.out.println(schoolMap.get(102));

        /*
        1) reach keys

        2) check the values if the branch is M
        3) change M with N
        4) prepare the value
        5) update the map
        */

        // 1) reach keys

        //System.out.println(schoolMap.keySet()); // [101, 102, 103, 104, 105, 106]

        for ( Integer eachKey: schoolMap.keySet()
             ) {

            //check the values if the branch is M
            //System.out.println(schoolMap.get(eachKey));

            String[] arr=schoolMap.get(eachKey).split("-");         //Veli-Can-10-M  //[Veli, Can, 10, M]

            //2) check the values if the branch is M
            //3) change M with N
            if (arr[3].equalsIgnoreCase("m")){
                arr[3]= "N";
            }

            //System.out.println(Arrays.toString(arr)); // [Veli, Can, 10, N]  >>>>  Veli-Can-10-N

            //4) prepare the value
            String value ="";

            for (String each:arr
                 ) {
                value = value + each +"-";

            }
            //System.out.println(value); // Veli-Can-10-N-
            //System.out.println(value.substring(0, value.length() - 1)); // Veli-Can-10-N
            value = value.substring(0, value.length() - 1); // Veli-Can-10-N,

            //5) update the map
            schoolMap.put(eachKey,value);

        }

        System.out.println(schoolMap);


    }


}
