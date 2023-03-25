package day31_inheritance;

import day30_inheritance.C03_Corolla;

public class C04_Corolla extends C03_Toyota {

    protected String corollaStr =" corolla";

    protected  C04_Corolla (){
        System.out.println("Corolla constructer without parameters is executed");
    }
    protected  C04_Corolla (int a){
        this(3,4);
        System.out.println("Corolla constructer with an int parameter is executed");
    }
    protected  C04_Corolla (String str){
        super();

        System.out.println("Corolla constructer with a String parameter is executed");
    }
    protected  C04_Corolla (int a, int b){
        this("Ali");
        System.out.println("Corolla constructer with 2 int parameters is executed");
    }



    public static void main(String[] args) {
        C04_Corolla childCar = new C04_Corolla( 5 );
    }

    /*
    Just like Default constructors, java creates super() constructor
    calls when we create parent child relation.

    constructor calls has to be at the first line of the constructors
    so we can not use 2 constructor calls at the same constructor

    When we manually create a constructor, java deletes
    invisible super() const call.

    we can choose different constructor by adding parameters
    to the constructor call.

    we can also call constructors from same class by using this()
    keyword with different arguments
    when we write this(), java will delete invisible super().
     */

}
