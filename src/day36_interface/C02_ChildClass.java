package day36_interface;

import day31_inheritance.C01_ChildClass;

public class C02_ChildClass extends C01_Interface implements  I01_FirstInterface, I02_Interface{


    @Override
    public void add() {

    }

    @Override
    public void sum() {

    }

    @Override
    public int subtraction() {
        return 0;
    }


    @Override
    public String division() {
        return null;
    }

    @Override
    public void newMethod() {

    }

    public static void main(String[] args) {

        C02_ChildClass child = new C02_ChildClass();
        System.out.println(I01_FirstInterface.number);
    }
}
