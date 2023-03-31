package day36_interface;

public class C03_ChildOfI03 implements I03_InterfaceExceptions {


    @Override
    public void method1() {

    }

    public static void main(String[] args) {

        C03_ChildOfI03 obj = new C03_ChildOfI03();

        obj.method3(); //we don't have to override this method
        obj.method1();

        I03_InterfaceExceptions.method2();
    }
}
