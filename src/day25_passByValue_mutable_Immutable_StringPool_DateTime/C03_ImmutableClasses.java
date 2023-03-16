package day25_passByValue_mutable_Immutable_StringPool_DateTime;

import java.util.ArrayList;
import java.util.List;

public class C03_ImmutableClasses {

    public static void main(String[] args) {

        // String and Wrapper classes are immutable so whatever we do we can not change original variable

        // int ---> Integer
        // int is primitive
        int a = 12;
        //Integer is non-primitive
        Integer b = 12;

        String str = "Java is getting funnier everyday";
        str.substring(5);
        str.substring(5,10);
        str.startsWith("Java");
        str.toUpperCase();
        str.toLowerCase();
        //str = str.toUpperCase(); // to change a immutable variable we need to assing it to new value

        System.out.println(str); // Java is getting funnier everyday


        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);

        System.out.println(numbers); // [5, 9]
        numbers.set(0,7);
        numbers.remove(1);

        System.out.println(numbers); // [7]  // wihtout any assignment, just applying the methots, we change the variable.
                                            // this means the data type is mutable


    }
}
