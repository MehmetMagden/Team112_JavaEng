package day44_collections;

import java.util.Set;
import java.util.TreeSet;

public class C02_Set {
    public static void main(String[] args) {
        // set stores only unique elements
        // it does not support index structure and it does not follow any rule when ordering elements

        Set<String> students = new TreeSet<>();

        students.add("Emre");
        students.add("Kerem");
        students.add("Duygu");
        students.add("Burcu");

        System.out.println(students); // [Burcu, Duygu, Emre, Kerem]
        students.add("Ahmet");
        System.out.println(students); // [Ahmet, Burcu, Duygu, Emre, Kerem]
        students.add("Kerem");
        System.out.println(students); // [Ahmet, Burcu, Duygu, Emre, Kerem]

    }


}
