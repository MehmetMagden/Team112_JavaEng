package day31_inheritance;

import day30_inheritance.C07_Parent;

public class C01_ChildClass extends C07_Parent {

    /*
    When we create a child class from different package, Parent's access modifiers should be public or protected because
    child class will try to reach that constructor form different package
     */
    String childStr;

    C01_ChildClass() {
        super(); // calls parent's constructor
        System.out.println("New child constructer is executed");
    }

    public static void main(String[] args) {

        C01_ChildClass childObj = new C01_ChildClass();

    }

    /*
    If there is a parent-child relation, when we try to create an object from subclass, because of extends keyword, before
    all constructore, java will add an invisible constructer call ( super() )

    when we create an object, because of these super() constructor cals, object receives all variables and methods from
    parent classes

     */


}
