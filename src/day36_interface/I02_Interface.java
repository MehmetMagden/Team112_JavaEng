package day36_interface;

public interface I02_Interface {

    int numer3=34;
    static int number = 10;
    final String str = "java is the best";
    final static int number2 =0;

    void add ();
    public void sum();
    abstract int subtraction();
    String division();

    void newMethod ();


    /*
    When we have same named methods with different return types
    Child class does not know which to override
    In this kind of situations there is no absolute solution
    we should fix the problem in Interfaces

     */
}
