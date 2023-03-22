package day29_encapsulation_Inheritance;

public class C04_ChildClass extends C03_ParentClass {

    /*
    in java, Child classes choose their parents. If we want to create a parent-child relation
    we need to go to the child class and after the name of class we should use "extends" keyword and
    we should enter the name of the parent class.

    a child class can use all methods and variables from his/her parent class as long as they are not private

    */

    int c = 20;
    int a ;
    String s = "Child class";
    String m;

    public void method1(){
        System.out.println("Child Class method1 is called");
    }
    public static void main(String[] args) {
        C03_ParentClass prClass = new C03_ParentClass();
        prClass.a = 20;
        prClass.b = 22;
        prClass.t ="k";
        prClass.s = "p";
        prClass.method1();
        prClass.method2();
        C04_ChildClass c04ChldClassObject = new C04_ChildClass();
        c04ChldClassObject.c =50;
        c04ChldClassObject.a=30;
        c04ChldClassObject.m ="l";
        c04ChldClassObject.s ="u";
        c04ChldClassObject.method1();

        // now we have parent-child relation
        c04ChldClassObject.testMethod();
        c04ChldClassObject.method1();
        c04ChldClassObject.method2();
        method3();


    }

    public void testMethod(){
        System.out.println("Test method is called");
        System.out.println(s);
        method1();
        method2();
        method3();
        System.out.println("test method is ended");


    }













}
