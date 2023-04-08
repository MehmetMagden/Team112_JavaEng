package day42_maps;

import day41_Iterators_Maps.MapMethods;

import java.util.Arrays;
import java.util.Map;

public class C04_UpdateMap {

    public static void main(String[] args) {

        // change surname of a student by using key
        // please change number 102 student's surname with brown

        //{101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}

        Map<Integer,String> schoolMap = MapMethods.createExampleMap();



        // 1) reach the student's value
        System.out.println(schoolMap.get(102));  // Veli-Can-10-M

        // 2) to work on it we should make it an arr
        String[] arr = schoolMap.get(102).split("-");
        System.out.println(Arrays.toString(arr));  //[Veli, Can, 10, M]

        // 3) update the array
        arr[1]="Brown";
        System.out.println(Arrays.toString(arr)); // [Veli, Brown, 10, M]

        // 4) make the array like the origilan String value
        String newValue = "";
        for (String each: arr
             ) {
            newValue += each +"-";
        }
        System.out.println(newValue); //Veli-Brown-10-M-

        newValue = newValue.substring(0,newValue.length()-1);
        System.out.println(newValue); // Veli-Brown-10-M

        schoolMap.put(102,newValue);

        System.out.println(schoolMap);


    }
}
