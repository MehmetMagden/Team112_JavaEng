package day16_scope_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        String [] str = {"mehmet","hasan","ömer"}; // adding [] and coding all data in {}

        System.out.println(Arrays.toString(str)); // [mehmet, hasan, ömer]

        int [] numbers = {1,2,3,4,5,3,4,5,3,4,5,6,3};
        char  characters [] = {'a','b','c'}; // the pace of [] should be after the data type But still you can code it
                                            // after the name

        /*
        Arrays can have primitive and non-Primitive variables
        We can create an array by writing the data inside curly braces
        and also we can use "new" keyword to create an array
        if we use the "new" keyword we need to set the length
         */

        String [] arr = new String[5]; // we have created an array with 5 elements. But we have not assinged any value
                                        // to them. Java will automaticly assign default values of the data type
        int [] intArr = new int[4];
        System.out.println(Arrays.toString(intArr)); // [0, 0, 0, 0] // default value of integer is assigned to each element


        System.out.println(arr); // we can not print an array directly // [Ljava.lang.String;@19dfb72a
        System.out.println(Arrays.toString(arr)); // to print an array we should use Arrays.toString() method // [null, null, null, null, null]


    }

}
