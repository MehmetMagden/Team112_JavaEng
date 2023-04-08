package day42_maps;

import day41_Iterators_Maps.MapMethods;

import java.util.Map;

public class C05_MapUpdate {
    public static void main(String[] args) {

        Map<Integer,String> schoolMap = MapMethods.createExampleMap();
        System.out.println(schoolMap);

        int studentNumber=103;
        String newSurname="Bal";

        schoolMap = MapMethods.updateSurname(schoolMap,studentNumber,newSurname);
        System.out.println(schoolMap);

        schoolMap = MapMethods.updateSurname(schoolMap,106,"Java");
        System.out.println(schoolMap);

    }
}
