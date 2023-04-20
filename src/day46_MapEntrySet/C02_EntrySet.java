package day46_MapEntrySet;

import day41_Iterators_Maps.MapMethods;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {

/*
    in a given map please print student's number, name, surname, and branch of a desired class

    //{101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}

 */
        /*
        Normaly we would solve it like this
        1) we would get the keys as a set (collection) schoolMap.keySet();
         */


        Map<Integer,String> schoolMap = MapMethods.createExampleMap();
        System.out.println(schoolMap);

        // 1) we would get the keys as a set (collection) schoolMap.keySet();
       Set<Integer> studentNumbers = schoolMap.keySet();

       // 2) to reach each keys, and students' information we need to use for each loop
        String valueOfMap="";


        for (Integer each: studentNumbers
             ) {
            valueOfMap=schoolMap.get(each); // Ali-Cem-10-H
            String [] valueArr =  valueOfMap.split("-");

            if (valueArr[2].equals("10")){

                System.out.println(each +" " + valueArr[0]+" "+valueArr[1]+" "+valueArr[2]);

            }
        }


        //Let's try to solve same question by using an entrySet

        // When we create an entrySet, although it seems like same as maps, in an entrySet, keys and values stored together.
        Set<Map.Entry<Integer,String>> schoolEntrySet = schoolMap.entrySet();
        System.out.println(schoolEntrySet);
                //101=Ali-Cem-10-H

        for (Map.Entry<Integer,String> each: schoolEntrySet
             ) {
            // first each will be : 101=Ali-Cem-10-H

            String value = each.getValue(); // Ali-Cem-10-H
            String [] arr = value.split("-");

            if (arr[2].equals("10")){
                System.out.println(each.getKey() +" "+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);
            }




        }

    }
}
