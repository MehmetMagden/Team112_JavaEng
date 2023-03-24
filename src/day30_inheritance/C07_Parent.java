package day30_inheritance;

public class C07_Parent extends C06_GrandParent {

    C07_Parent (){
        super();
        System.out.println("Parent Class constructor is called");
    }

    protected int parentNumber=888888;
}
