package day42_maps;

import day41_Iterators_Maps.MapMethods;

import java.util.Map;

public class C02_MapUpdateWithMethod {

    public static void main(String[] args) {
        Map<Integer,String> schoolMap = MapMethods.createExampleMap();
        System.out.println(schoolMap);

        MapMethods.updateBranch(schoolMap,"H","K");
        System.out.println(schoolMap);

        MapMethods.updateBranch(schoolMap,"K","A");
        System.out.println(schoolMap);
    }

}
