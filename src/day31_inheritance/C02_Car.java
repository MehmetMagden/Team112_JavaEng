package day31_inheritance;

public class C02_Car {


    protected String carStr =" car";

    protected C02_Car (){
        System.out.println("Car constructor without parameters is executed");

    }

    protected C02_Car (String str){
        System.out.println("Car constructor with a String parameter is executed");

    }

    protected C02_Car (int a, int b, int c){
        System.out.println("Car constructor with 3 int parameters is executed");

    }



}
