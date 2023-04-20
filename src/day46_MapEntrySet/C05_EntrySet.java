package day46_MapEntrySet;

import day41_Iterators_Maps.MapMethods;

import java.util.Map;

public class C05_EntrySet {

    // Make firstLetters of surnames a lowercase
    public static void main(String[] args) {

        Map<Integer,String> schoolMap = MapMethods.createExampleMap();
        ////{101=Ali-Cem-10-H, 102=Veli-Can-10-M, 103=Ali-Can-11-M, 104=Ayse-Cem-11-H, 105=Ayse-Han-10-H, 106=Veli-Han-10-H}

        schoolMap = MapMethods.makeCapitalsSurnames(schoolMap); // changed the function to capitals
        System.out.println(schoolMap);


    }
}
