package day41_Iterators_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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


    public static Map<Integer,String> updateBranch(Map<Integer, String> schoolMap, String oldBranch, String newBranch) {

        // 1) reach keys
        // 2) check the values if the branch is M
        // 3) change M with N
        // 4) prepare the value
        // 5) update the map

        // 1) reach keys
        for (Integer eachKey: schoolMap.keySet()
             ) {
        String[] arr =schoolMap.get(eachKey).split("-");  //Ali-Cem-10-H

        // 2) check the values if the branch is M
            if (arr[3].equalsIgnoreCase(oldBranch)){
                // 3) change M with N
                arr[3]= newBranch;
            }

            // 4) prepare the value
            String newValue ="";
            for (String each: arr
                 ) {
                newValue+=each+"-";
            }
            newValue=newValue.substring(0,newValue.length()-1);

            // 5) update the map
            schoolMap.put(eachKey,newValue);


        }
        return schoolMap;

    }

    public static Map<Integer,String> updateClassesAtEndOfYear(Map<Integer, String> schoolMap) {
        //        1) reach keys in a loop                                 //  101, 102, 103 ....
        //        2) by using keys reach value                            // Ali-Cem-10-H
        //        3) make an array for each element of the value          // [Ali, Cem, 10, H]
        //        4) reach class number by using the array                // 10
        //        5) if it is lower than 12, add 1. If it is 12, make it G
        //        6) make it a string value to save to the map            // Ali-Cem-11-H


        //        1) reach keys in a loop                                 //  101, 102, 103 ....
        for (Integer eachKey: schoolMap.keySet()
             ) {

            //        2) by using keys reach value                            // Ali-Cem-10-H
            //        3) make an array for each element of the value          // [Ali, Cem, 10, H]

            String[] arr =schoolMap.get(eachKey).split("-");

            //        4) reach class number by using the array                // 10
            //        5) if it is lower than 12, add 1. If it is 12, make it G
               Integer classNumber = Integer.parseInt(arr[2]); //to change a String to An Integer number //10

            if (classNumber<12){  // if class number is lower 12
                classNumber++;
                arr[2]=classNumber+""; // to make  integerdata  String data , we can add "" at the end,
            }else {
                arr[2]="G";
            }

            // [Ali, Cem, 11, H]
            //        6) make it a string value to save to the map            // Ali-Cem-11-H

            String newValue ="";
            for (String each: arr
                 ) {
                newValue+=each +"-";
            }

            newValue= newValue.substring(0,newValue.length()-1);                // Ali-Cem-11-H

            schoolMap.put(eachKey,newValue);


        }

        return schoolMap;

    }

    public static Map<Integer,String> updateSurname(Map<Integer, String> schoolMap, int studentNumber, String newSurname) {

        // 1) reach the student's value
        // 2) to work on it we should make it an arr
        // 3) update the array

        String[] arr = schoolMap.get(studentNumber).split("-");  // [Veli, Can, 10, M]

        arr[1]= newSurname;

        String newValue ="";
        for (String each: arr
             ) {
            newValue+= each +"-";
        }

        newValue= newValue.substring(0,newValue.length()-1);

        schoolMap.put(studentNumber,newValue);

        return schoolMap;

    }

    public static int newMethod(int a, int b) {

        int result = a + b;

        return result;
    }

    public static void studentsFromClass(Map<Integer, String> schoolMap, int classNumber) {

        //1) save entries from the map, create an entrySet
        Set<Map.Entry<Integer,String>> schoolEntrySet= schoolMap.entrySet();

        //2) reaching all keys and values of the entrySet

        // 101=Ali-Cem-10-H
        for (Map.Entry<Integer,String>  eachEntry: schoolEntrySet
             ) {

            // first we need to check if the students are from the classNumber

            // reach values of each student
            String value = eachEntry.getValue(); // Ali-Cem-10-H
            String [] arr = value.split("-");

            // is student from classNumber
            if (arr[2].equals(classNumber+"")){

                System.out.println(eachEntry.getKey()+" "+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]);

            }


        }



    }


    public static int addTwoNumbers(int i, int i1) {
        int sum = i+i1;

        return sum;
    }

    public static Map<Integer, String> makeCapitalsSurnames(Map<Integer, String> schoolMap) {

        Set<Map.Entry<Integer,String>> schoolEntrySet = schoolMap.entrySet(); // created an entrySet

        for ( Map.Entry<Integer,String> eachEntry : schoolEntrySet
             ) {
            //Entry set : 101=Ali-Cem-10-H
            String value = eachEntry.getValue(); // Ali-Cem-10-H
            String[] arr = value.split("-");

            arr[1] = arr[1].toUpperCase(); // CEM

            eachEntry.setValue(arr[0]+"-"+arr[1]+"-"+arr[2]+"-"+arr[3]);   // Ali-CEM-10-H


        }

        return schoolMap;

    }
}
