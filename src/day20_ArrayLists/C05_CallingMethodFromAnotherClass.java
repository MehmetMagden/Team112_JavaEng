package day20_ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_CallingMethodFromAnotherClass {

    public static void main(String[] args) {
    // let's use deleteNamesWhichContainsUnwantedLetter method from C04 Class

    List<String> products = new ArrayList<>();
    products.add("Nutella");
    products.add("Toy Car");
    products.add("Baby Toy");
    products.add("Rabbit");
    products.add("Candy");

    String unwantedLetter = "o";

        System.out.println(C04_RemoveUnwanted.deleteNamesWhichContainsUnwantedLetter(products, unwantedLetter));
        System.out.println(C04_RemoveUnwanted.deleteNamesWhichContainsUnwantedLetter(products, "i"));


    }
}
