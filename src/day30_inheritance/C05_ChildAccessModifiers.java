package day30_inheritance;

public class C05_ChildAccessModifiers extends C04_ParentAccessModifiers {

    public static void main(String[] args) {




        C05_ChildAccessModifiers child = new C05_ChildAccessModifiers();

        System.out.println(child.publicNumber);
        System.out.println(child.normalNumber);
        System.out.println(child.protectedNumber);

        /*
        By using child object fromthe child class we can reach all normal variables
        exept private and static variables
         */
        //System.out.println(child.privateNumber); you can not reach a parent's private variable
        // from a child class

        System.out.println(child.staticNormalNumber);

        // static variables blong to the class itself so they can not be inherited

        // if we want to reach a static variable from other classes we should
        //write the class name before the variable name to reach it





    }
}
