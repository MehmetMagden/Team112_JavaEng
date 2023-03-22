package day29_encapsulation_Inheritance;

public class C05_GrandChildClass extends C04_ChildClass {

    public static void main(String[] args) {

        /*
        In a child class ( or a grandChild ) we can use all variables and methods from parent classes without doing anything

        let's say there are same method in parent and grandparent classes. When we try to reach these method child class will
        use the most updated one ( which means the closest one)

         */

        method3(); // Parent static method3 is called

        // to reach non-static variables we need to create an object from the class
        C05_GrandChildClass grChild = new C05_GrandChildClass();

        grChild.method1(); // Child Class method1 is called
        grChild.method2(); // Parent Method2 is called
        grChild.testMethod();
        //Test method is called
        //Child class
        //Child Class method1 is called
        //Parent Method2 is called
        //Parent static method3 is called
        //test method is ended
         System.out.println(grChild.s);  // Child class
        System.out.println(grChild.t); // null
        System.out.println(grChild.m); // null
        System.out.println(grChild.c); // 20
        System.out.println(grChild.a);  // 0
        System.out.println(grChild.t); //null
        System.out.println(grChild.b);  //0



    }





}
