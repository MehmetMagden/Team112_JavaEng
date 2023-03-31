package day36_interface;

public interface I03_InterfaceExceptions {

    void method1();  // an abstract method

    static void method2(){
        System.out.println("Child clas is not forced to override this method");
    }

    default void method3(){
        System.out.println("It may seem lilke default access modifier but it is not");
    }

}
