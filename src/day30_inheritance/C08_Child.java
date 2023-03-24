package day30_inheritance;

public class C08_Child extends C07_Parent {

    C08_Child (){

        System.out.println("ChildClass constructor is executed");
    }

    protected int childNumber =9;

    public static void main(String[] args) {


        C08_Child child = new C08_Child();

        System.out.println(child.childNumber);  // 9
        System.out.println(child.parentNumber);  //888888
        System.out.println(child.GrandParentNumber); //99999999
    }

}
