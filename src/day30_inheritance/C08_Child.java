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


        /*
        Because of the parent child relation, when we create an object in the child class (line 15),
        object takes all variables and methods from itself and parents (except pritave)

        when we create an object, a constructor has to be executed. (constructor construct the object)

        As testers we do not use constructor calls but still we should be able to understand what is written in the code

        In this page we used C08_Child() constructor but somehow our object recieved all the variables from its parents

         */
    }

}
