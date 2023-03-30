package day34_Overriding;

public class BChildClass extends AParentClass {

    String str = "Child";

    void method1(){
        System.out.println("Child Method 1");
    }

    public static void main(String[] args) {

        BChildClass child = new BChildClass();


        child.method1(); // Child Method 1
        System.out.println(child.str); // Child

        AParentClass child2 = new BChildClass();
        child2.method1(); // Child Method 1
        System.out.println(child2.str); //Parent

        /*
        When we create an object from same datatype class and constructer class
        We take the first one we see

        When the constructor and the datatype are different,
        for variable
        go datatype class and we take the first one we see by following parent child realtions

        for methods
        go datatype then try to find method. When we find it we should check if it
        is overridden

        if it is overridden it should be in limits (between constructor class and the data
        type class;)
         */


    }




}
