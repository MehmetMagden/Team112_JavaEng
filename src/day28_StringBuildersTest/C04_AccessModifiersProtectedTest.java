package day28_StringBuildersTest;

import day28_StringBuilders_AccessModifiers_Encapsulation.C01_AccessModifers;

public class C04_AccessModifiersProtectedTest extends C01_AccessModifers {


    public static void main(String[] args) {

        //C01_AccessModifers.protectedStr just like C03, we couldn't be able to reach it before creating parent-child relation


        // "extends C01_AccessModifers" by adding this part after class name, I have created a parent-Child relation
        // between these classes. So if the datatype is protected, from this point on, I can reach all protected variables
        System.out.println(C01_AccessModifers.protectedStr);
        C01_AccessModifers.protectedStr ="I changed protectedStr because I am child of that class";

        // As you can see, still we can not reach a default access typed variable


    }
}
