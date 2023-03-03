package day16_scope_arrays;

public class C02_Static_NonStatic {

    static String str1 = "staticVariable";

    String str2 = "NonStaticVariable";
    String str3 = "nonStatic var 2";


    public static void main(String[] args) {

        //System.out.println(str2); we can not use a non-static variable inside of a static method

        // to reach the non-static variable (str2) we have created an object
        C02_Static_NonStatic asfdasdf = new C02_Static_NonStatic();

        // used the object to reach str2
        System.out.println(asfdasdf.str2);


        // by creating an object you can use non-static variables in static methods
        ADoctor doctor4 = new ADoctor();
        doctor4.name = "Adnan";
        System.out.println(doctor4.name);

        System.out.println(str1);

        // If we want to use a nonStatic variable in a static method, we need to create an object from the class

        // when we want to reach a non-static variable, first we need to check where it is.
        // we should take the name of the class of that variable and by using that class, we should create an object from the class
        // then we can reach the non-static variable by using created object
        C02_Static_NonStatic testObject1 = new C02_Static_NonStatic();
        System.out.println(testObject1.str2); // NonStaticVariable
        //System.out.println(str2);
        System.out.println(testObject1.str3); // nonStatic var 2



        ADoctor asdf = new ADoctor();
        System.out.println(asdf.phoneNumber);
    }

}
