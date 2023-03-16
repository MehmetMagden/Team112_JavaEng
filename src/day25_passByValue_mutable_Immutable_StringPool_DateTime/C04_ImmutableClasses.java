package day25_passByValue_mutable_Immutable_StringPool_DateTime;

public class C04_ImmutableClasses {


    public static void main(String[] args) {

        /*
        When we create an object from a class, it can be immutable or mutable

        To store text values we can use 3 different classes
        String -- immutable
        StringBuilder   --  mutable
        StringBuffer  --  mutable

        If we use an immutable class to create objects, these objects will be immutable too.
        String class is a immutable data type. As long as we don't assign new value to it, The orjinal value
        will not change even we use a lot of methods on it

        everytime we use a method on it, java creates a new object. If we dont use these new objects, They will
        stay in heap memory until they are cleaned by garbage collecter.

         */

        String str = "Java is the best";
        str = str.toLowerCase();
        System.out.println(str); // java is the best
        str = str.toUpperCase();
        System.out.println(str); // JAVA İS THE BEST

        String s = "Java";

        for (int i = 0; i <100 ; i++) {

            s = s + ".";
        }

        System.out.println(s);

    }
}
