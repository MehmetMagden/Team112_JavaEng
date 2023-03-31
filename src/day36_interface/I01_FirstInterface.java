package day36_interface;

public interface I01_FirstInterface{

    int numer3=34;
    static int number = 10;
    final String str = "java is the best";
    final static int number2 =0;

    void add ();
    public void sum();
    abstract int subtraction();
    String division();


    /*
    In all interfaces, all variables are final and static
    If it is final, we can not change it
    even though we do not write them, java will accept them as final and static
    if we still try to write they will be pale because it is unnecessery
     */

    /*
    In an interface, all methods are public and abstract (even we don't write)
     */





}
