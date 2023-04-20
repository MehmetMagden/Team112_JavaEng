package day46_MapEntrySet;

import day41_Iterators_Maps.MapMethods;

import java.util.Map;

public class C03_SolvingWithMethod {

    /*
    in a given map please print student's number, name, surname, and branch of a desired class

    //{101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}

 */
    public static void main(String[] args) {

        Map<Integer,String> schoolMap = MapMethods.createExampleMap();
//{101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}

        MapMethods.studentsFromClass(schoolMap,11);


    }


}
